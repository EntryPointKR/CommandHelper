/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laytonsmith.aliasengine.functions;

import com.laytonsmith.aliasengine.functions.exceptions.CancelCommandException;
import com.laytonsmith.aliasengine.functions.exceptions.ConfigRuntimeException;
import com.laytonsmith.aliasengine.Constructs.*;
import com.laytonsmith.aliasengine.GenericTreeNode;
import com.laytonsmith.aliasengine.Script;
import com.laytonsmith.aliasengine.Static;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.entity.Player;

/**
 *
 * @author Layton
 */
public class Exceptions {
    public static String docs(){
        return "This class contains functions related to Exception handling in MScript";
    }
    public enum ExceptionType{
        /**
         * This exception is thrown if a value cannot be cast into an appropriate type. Functions that require
         * a numeric value, for instance, would throw this if the string "hi" were passed in.
         */
        CastException,
        /**
         * This exception is thrown if a value is requested from an array that is above the highest index of the array,
         * or a negative number.
         */
        IndexOverflowException,
        /**
         * This exception is thrown if a function expected a numeric value to be in a particular range, and it wasn't
         */
        RangeException,
        /**
         * This exception is thrown if a function expected the length of something to be a particular value, but it was not.
         */
        LengthException,
        /**
         * This exception is thrown if the user running the command does not have permission to run the function
         */
        InsufficientPermissionException,
        /**
         * This exception is thrown if a function expected an online player, but that player was offline
         */
        PlayerOfflineException, 
        /**
         * Some var arg functions may require at least a certain number of arguments to be passed to the function
         */
        InsufficientArgumentsException, 
        /**
         * This exception is thrown if a function expected a string to be formatted in a particular way, but it could not interpret the 
         * given value.
         */
        FormatException,
    }
    @api public static class _try implements Function{      
        
        IVariableList varList;
        public String getName() {
            
            return "try";
        }

        public Integer[] numArgs() {
            return new Integer[]{3,4};
        }

        public String docs() {
            return "void {tryCode, varName, catchCode, [exceptionTypes]} This function works similar to a try-catch block in most languages. If the code in"
                    + " tryCode throws an exception, instead of killing the whole script, it stops running, and begins running the catchCode."
                    + " var should be an ivariable, and it is set to an array containing the following information about the exception:"
                    + " 0 - The class of the exception; 1 - The message generated by the exception; 2 - Reserved for future use; 3 - The line the exception"
                    + " occured on. If exceptionTypes is provided, it should be an array of exception types, or a single string that this try function is interested in."
                    + " If the exception type matches one of the values listed, the exception will be caught, otherwise, the exception will continue up the stack."
                    + " If exceptionTypes is missing, it will catch all exceptions."
                    + " PLEASE NOTE! This function will not catch exceptions thrown by CommandHelper, only built in exceptions. "
                    + " Please see the wiki for more information about what possible exceptions can be thrown and where.";
        }
        
        public ExceptionType[] thrown(){
            return new ExceptionType[]{ExceptionType.CastException, ExceptionType.FormatException};
        }

        public boolean isRestricted() {
            return false;
        }

        public void varList(IVariableList varList) {
            this.varList = varList;
        }

        public boolean preResolveVariables() {
            return false;
        }

        public String since() {
            return "3.1.2";
        }

        public Boolean runAsync() {
            return null;
        }
        public Construct execs(int line_num, Player p, Script that, GenericTreeNode<Construct> tryCode,
                GenericTreeNode<Construct> varName, GenericTreeNode<Construct> catchCode, GenericTreeNode<Construct> types) throws CancelCommandException{
            Construct pivar = that.eval(varName, p);
            IVariable ivar;
            if(pivar instanceof IVariable){
                ivar = (IVariable)pivar;
            } else {
                throw new ConfigRuntimeException("Expected argument 2 to be an IVariable", ExceptionType.CastException, line_num);
            }
            List<String> interest = new ArrayList<String>();
            if(types != null){
            Construct ptypes = that.eval(types, p);
                if(ptypes instanceof CString){
                    interest.add(ptypes.val());
                } else if(ptypes instanceof CArray){
                    CArray ca = (CArray)ptypes;
                    for(int i = 0; i < ca.size(); i++){
                        interest.add(ca.get(i, line_num).val());
                    }
                } else {
                    throw new ConfigRuntimeException("Expected argument 4 to be a string, or an array of strings.", ExceptionType.CastException, line_num);
                }
            }
            
            for(String in : interest){
                try{
                    ExceptionType.valueOf(in);
                } catch(IllegalArgumentException e){
                    throw new ConfigRuntimeException("Invalid exception type passed to try():" + in, ExceptionType.FormatException, line_num);
                }
            }
            
            try{
                that.eval(tryCode, p);
            } catch (ConfigRuntimeException e){
                if((Boolean)Static.getPreferences().getPreference("debug-mode")){
                    System.out.println("[CommandHelper]: Exception thrown -> " + e.getMessage() + " :: " + e.getExceptionType() + ":" + e.getLineNum());
                }
                if(interest.isEmpty() || interest.contains(e.getExceptionType().toString())){
                    CArray ex = new CArray(line_num);
                    ex.push(new CString(e.getExceptionType().toString(), line_num));
                    ex.push(new CString(e.getMessage(), line_num));
                    ex.push(new CNull(line_num));
                    ex.push(new CInt(e.getLineNum(), line_num));
                    ivar.setIval(ex);
                    varList.set(ivar);
                    that.eval(catchCode, p);
                } else {
                    throw e;
                }
            }
            
            
            return new CVoid(line_num);
        }
        public Construct exec(int line_num, Player p, Construct... args) throws CancelCommandException, ConfigRuntimeException {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }
    
    @api public static class _throw implements Function{

        public String getName() {
            return "throw";
        }

        public Integer[] numArgs() {
            return new Integer[]{2};
        }

        public String docs() {
            return "nothing {exceptionType, msg} This function causes an exception to be thrown. If the exception type is null,"
                    + " it will be uncatchable. Otherwise, exceptionType may be any valid exception type.";
        }
        
        public ExceptionType[] thrown(){
            return new ExceptionType[]{ExceptionType.FormatException};
        }

        public boolean isRestricted() {
            return false;
        }

        public void varList(IVariableList varList) {}

        public boolean preResolveVariables() {
            return true;
        }

        public String since() {
            return "3.1.2";
        }

        public Boolean runAsync() {
            return null;
        }

        public Construct exec(int line_num, Player p, Construct... args) throws CancelCommandException, ConfigRuntimeException {
            try{
                throw new ConfigRuntimeException(args[1].val(), ExceptionType.valueOf(args[0].val()), line_num, null);
            } catch(IllegalArgumentException e){
                throw new ConfigRuntimeException("Expected a valid exception type", ExceptionType.FormatException, line_num);
            }
        }
        
    }
}

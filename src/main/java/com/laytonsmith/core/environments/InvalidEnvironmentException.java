package com.laytonsmith.core.environments;

/**
 *
 *
 */
public class InvalidEnvironmentException extends RuntimeException {

    private String data = null;
    private boolean hasBeenSet = false;

    /**
     * Creates a new instance of
     * <code>InvalidEnvironmentException</code> without detail message.
     */
    public InvalidEnvironmentException() {
    }

    /**
     * Constructs an instance of
     * <code>InvalidEnvironmentException</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public InvalidEnvironmentException(String msg) {
        super(msg);
    }

    /**
     * Returns any custom data that was set.
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * Sets custom data. This may be used to add more specific information
     * about the context of the error by generic handlers.
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
        hasBeenSet = true;
    }

    /**
     * If you don't want to replace the data if it's already set, you can
     * check if it has been set once with this.
     *
     * @return
     */
    public boolean isDataSet() {
        return hasBeenSet;
    }


}

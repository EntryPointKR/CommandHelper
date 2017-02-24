package com.laytonsmith.tools.pnviewer;

import com.laytonsmith.PureUtilities.Common.UIUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lsmith
 */


public final class ManageBookmarksDialog extends javax.swing.JDialog {

    BookmarkList blist = new BookmarkList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList bookmarkList;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField hostField;
    private javax.swing.JLabel hostLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField localFileField;
    private javax.swing.JLabel localFileLabel;
    private javax.swing.ButtonGroup localOrRemoteGroup;
    private javax.swing.JRadioButton localRadioButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton newButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JTextField remoteFileField;
    private javax.swing.JLabel remoteFileLabel;
    private javax.swing.JRadioButton remoteRadioButton;
    private javax.swing.JButton saveButton;
    /**
     * Creates new form ManageBookmarksDialog
     */
    public ManageBookmarksDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //setEnabledAll(false);
        ActionListener buttonGroupActionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                determineRadioButtons();
            }
        };
        localRadioButton.addActionListener(buttonGroupActionListener);
        remoteRadioButton.addActionListener(buttonGroupActionListener);
        setEnabledAll(false);
        newButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabledAll(true);
                Bookmark b = new Bookmark();
                b.name = "New Bookmark";
                populateFromBookmark(b);
                blist.addBookmark(b);
                bookmarkList.setListData(blist.getNameList());
                bookmarkList.setSelectedValue(b.name, true);
                nameField.requestFocus();
                nameField.setSelectionStart(0);
                nameField.setSelectionEnd(b.name.length());
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageBookmarksDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBookmarksDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBookmarksDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBookmarksDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

		/* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManageBookmarksDialog dialog = new ManageBookmarksDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void determineRadioButtons() {
        boolean isLocal = localOrRemoteGroup.isSelected(localRadioButton.getModel());
        setEnabledLocal(isLocal);
        setEnabledRemote(!isLocal);
    }

    private void setEnabledAll(boolean enabled) {
        UIUtils.setEnabled(enabled, nameLabel, nameField, localRadioButton, localFileLabel, localFileField,
                remoteRadioButton, hostLabel, hostField, portLabel, portField, passwordLabel, passwordField,
                remoteFileLabel, remoteFileField, saveButton, deleteButton);
    }

    private void setEnabledLocal(boolean enabled) {
        UIUtils.setEnabled(enabled, localFileLabel, localFileField);
    }

    private void setEnabledRemote(boolean enabled) {
        UIUtils.setEnabled(enabled, hostLabel, hostField, portLabel, portField, passwordLabel, passwordField,
                remoteFileLabel, remoteFileField);
    }

    private void populateFromBookmark(Bookmark b) {
        localRadioButton.setSelected(b.isLocal);
        remoteRadioButton.setSelected(!b.isLocal);
        determineRadioButtons();
        nameField.setText(b.name);
        localFileField.setText(b.localFile);
        hostField.setText(b.host);
        portField.setText(b.port);
        passwordField.setText(b.password);
        remoteFileField.setText(b.remoteFile);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        localOrRemoteGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookmarkList = new javax.swing.JList();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        localRadioButton = new javax.swing.JRadioButton();
        localFileLabel = new javax.swing.JLabel();
        remoteRadioButton = new javax.swing.JRadioButton();
        hostLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        remoteFileLabel = new javax.swing.JLabel();
        localFileField = new javax.swing.JTextField();
        hostField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        remoteFileField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(bookmarkList);

        newButton.setText("New");

        deleteButton.setText("Delete");

        nameLabel.setText("Name");

        localOrRemoteGroup.add(localRadioButton);
        localRadioButton.setSelected(true);
        localRadioButton.setText("Local");

        localFileLabel.setText("Local File");

        localOrRemoteGroup.add(remoteRadioButton);
        remoteRadioButton.setText("Remote");

        hostLabel.setText("Host");

        portLabel.setText("Port");

        passwordLabel.setText("Password");

        remoteFileLabel.setText("Remote File");

        saveButton.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(localFileLabel)
                                                                .addGap(43, 43, 43)
                                                                .addComponent(localFileField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                                                        .addComponent(remoteRadioButton)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(hostLabel)
                                                                        .addComponent(localRadioButton)
                                                                        .addComponent(portLabel)
                                                                        .addComponent(passwordLabel)
                                                                        .addComponent(remoteFileLabel)
                                                                        .addComponent(nameLabel))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(hostField)
                                                                        .addComponent(portField)
                                                                        .addComponent(passwordField)
                                                                        .addComponent(remoteFileField)
                                                                        .addComponent(nameField)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(newButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(deleteButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(saveButton)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nameLabel)
                                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(localRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(localFileLabel)
                                                        .addComponent(localFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(remoteRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(hostLabel)
                                                        .addComponent(hostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(portLabel)
                                                        .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(passwordLabel)
                                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(remoteFileLabel)
                                                        .addComponent(remoteFileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 7, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(newButton)
                                        .addComponent(deleteButton)
                                        .addComponent(saveButton))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static class BookmarkList {
        private List<Bookmark> bookmarks = new ArrayList<>();

        private void addBookmark(Bookmark b) {
            bookmarks.add(b);
        }

        private String[] getNameList() {
            String[] ret = new String[bookmarks.size()];
            for (int i = 0; i < bookmarks.size(); i++) {
                ret[i] = bookmarks.get(i).name;
            }
            Arrays.sort(ret);
            return ret;
        }

        private Bookmark getBookmark(String name) {
            for (Bookmark b : bookmarks) {
                if (name.equals(b.name)) {
                    return b;
                }
            }
            return null;
        }
    }

    private static class Bookmark {
        public String name = "";
        public boolean isLocal = true;
        public String localFile = "";
        public String host = "";
        public String port = "";
        public String password = "";
        public String remoteFile = "";
    }
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srira
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private boolean emailValid;
    private boolean nameValid;
    private int entAvail = 0;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        clearLabels();
        populateTable();
        enterpriseJTable.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateNetworkComboBox();
    }

    private void clearLabels() {
        emailLbl.setVisible(false);
        emailSuccessLbl.setVisible(false);
        passwordSuccessLbl.setVisible(false);
        passwordLbl.setVisible(false);
        citySuccessLbl.setVisible(false);
        cityLbl.setVisible(false);
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[5];
                    row[0] = userAccount.getEmployee().getId();
                    row[1] = userAccount.getEmployee().getName();
                    row[2] = enterprise.getName();
                    row[3] = network.getName();
                    row[4] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private boolean usernamePatternCorrect(String val) {
        Pattern p = Pattern.compile("^.+@[^\\.].*\\.[a-z]{2,}$");
        Matcher m = p.matcher(val);
        boolean b = m.matches();
        return b;
    }

    private boolean cityPatternCorrect(String val3) {
        Pattern p = Pattern.compile("^[a-zA-Z ]+$");
        Matcher m = p.matcher(val3);
        boolean b = m.matches();
        return b;
    }

    private boolean passwordPatternCorrect(String val4) {
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = p1.matcher(String.valueOf(val4));
        boolean b1 = m1.matches();
        return b1;
    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        submitJButton1 = new javax.swing.JButton();
        emailLbl = new javax.swing.JLabel();
        emailSuccessLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        passwordSuccessLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        citySuccessLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setBackground(new java.awt.Color(204, 204, 204));
        enterpriseJTable.setForeground(new java.awt.Color(51, 51, 51));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Enterprise Name", "State", "EmailID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);
        if (enterpriseJTable.getColumnModel().getColumnCount() > 0) {
            enterpriseJTable.getColumnModel().getColumn(0).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(1).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(2).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(3).setResizable(false);
            enterpriseJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 205, 730, 110));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Network :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 80, 30));

        networkJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        networkJComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(51, 51, 51));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 190, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Email ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 80, 30));

        usernameJTextField.setBackground(new java.awt.Color(204, 204, 204));
        usernameJTextField.setForeground(new java.awt.Color(51, 51, 51));
        usernameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameJTextFieldKeyReleased(evt);
            }
        });
        add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 190, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enterprise :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 90, 30));

        enterpriseJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        enterpriseJComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        enterpriseJComboBox.setForeground(new java.awt.Color(51, 51, 51));
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 190, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 80, 30));

        nameJTextField.setBackground(new java.awt.Color(204, 204, 204));
        nameJTextField.setForeground(new java.awt.Color(51, 51, 51));
        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyReleased(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 190, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 80, 30));

        passwordJPasswordField.setBackground(new java.awt.Color(204, 204, 204));
        passwordJPasswordField.setForeground(new java.awt.Color(51, 51, 51));
        passwordJPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordJPasswordFieldKeyReleased(evt);
            }
        });
        add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 190, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE ENTERPRISE ADMIN");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 723, 30));

        backJButton1.setBackground(new java.awt.Color(204, 204, 204));
        backJButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton1.setForeground(new java.awt.Color(51, 51, 51));
        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        submitJButton1.setBackground(new java.awt.Color(204, 204, 204));
        submitJButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitJButton1.setForeground(new java.awt.Color(51, 51, 51));
        submitJButton1.setText("Submit");
        submitJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButton1ActionPerformed(evt);
            }
        });
        add(submitJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 98, 42));

        emailLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(255, 51, 51));
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLbl.setText("Valid Format - 'xx@xx.xx'");
        add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 190, 20));

        emailSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(emailSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 30, 30));

        passwordLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 51, 51));
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLbl.setText("Sample format: Asdf@1");
        add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 190, 50));

        passwordSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(passwordSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 30, -1));

        cityLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        cityLbl.setForeground(new java.awt.Color(255, 51, 51));
        cityLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityLbl.setText("Only Alphabets are allowed");
        add(cityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 190, 40));

        citySuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(citySuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 30, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void submitJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButton1ActionPerformed
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        if (enterprise.getEmployeeDirectory().getEmployeeList().size() != 0) {
            entAvail = 1;
        }
        if (usernameJTextField.getText().isEmpty() || passwordJPasswordField.getText().isEmpty() || nameJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field(s) cannot be Empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (emailValid && nameValid && entAvail != 1) {

            String username = usernameJTextField.getText();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name = nameJTextField.getText();

            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);

            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
            populateTable();
            networkJComboBox.setSelectedIndex(0);
            enterpriseJComboBox.setSelectedIndex(0);
            usernameJTextField.setText("");
            passwordJPasswordField.setText("");
            nameJTextField.setText("");
            clearLabels();

        } else {
            if (entAvail == 1) {
                JOptionPane.showMessageDialog(null, "Enterprise admin is already added !", "Alert", JOptionPane.INFORMATION_MESSAGE);
                clearLabels();
                usernameJTextField.setText("");
                passwordJPasswordField.setText("");
                nameJTextField.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_submitJButton1ActionPerformed

    private void usernameJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameJTextFieldKeyReleased
        // TODO add your handling code here:
        if (!usernamePatternCorrect(usernameJTextField.getText()) && !(usernameJTextField.getText().isEmpty())) {
            emailLbl.setVisible(true);
            emailSuccessLbl.setVisible(false);
            emailValid = false;
        } else if (usernameJTextField.getText().isEmpty()) {
            emailLbl.setVisible(false);
            emailValid = false;
            emailSuccessLbl.setVisible(false);
        } else {
            emailLbl.setVisible(false);
            emailSuccessLbl.setVisible(true);
            emailValid = true;
        }
    }//GEN-LAST:event_usernameJTextFieldKeyReleased

    private void passwordJPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordJPasswordFieldKeyReleased
        // TODO add your handling code here:
        if (!passwordPatternCorrect(passwordJPasswordField.getText()) && !(passwordJPasswordField.getText().isEmpty())) {
            passwordSuccessLbl.setVisible(false);
            passwordLbl.setVisible(true);
        } else if (passwordJPasswordField.getText().isEmpty()) {
            passwordLbl.setVisible(false);
            passwordSuccessLbl.setVisible(false);
        } else {
            passwordLbl.setVisible(false);
            passwordSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_passwordJPasswordFieldKeyReleased

    private void nameJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyReleased
        // TODO add your handling code here:
        if (!cityPatternCorrect(nameJTextField.getText()) && !(nameJTextField.getText().isEmpty())) {
            citySuccessLbl.setVisible(false);
            cityLbl.setVisible(true);
            nameValid = false;
        } else if (nameJTextField.getText().isEmpty()) {
            citySuccessLbl.setVisible(false);
            cityLbl.setVisible(false);
            nameValid = false;
        } else {
            nameValid = true;
            cityLbl.setVisible(false);
            citySuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_nameJTextFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JLabel citySuccessLbl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel emailSuccessLbl;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel passwordSuccessLbl;
    private javax.swing.JButton submitJButton1;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables

}

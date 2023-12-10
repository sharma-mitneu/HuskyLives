/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aishwaryasamel
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Organization org;
    private EcoSystem system;
    private boolean emailValid;
    private boolean userNameValid;
     private boolean nameValid;
     private boolean  passwordValid;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.system = system;
        clearLabels();
        organizationJTable.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();

    }
    
    public void clearLabels(){
        passwordSuccessLbl.setVisible(false);
        passwordLbl.setVisible(false);
        emailSuccessLbl.setVisible(false);
        emailIDAlreadyLbl.setVisible(false);
        emailLbl.setVisible(false);
        citySuccessLbl.setVisible(false);
        cityLbl.setVisible(false);
    }
    public void populateOrganizationComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationJComboBox.addItem(organization);
        }
    }
     private boolean cityPatternCorrect(String val3){
        Pattern p=Pattern.compile("^[a-zA-Z ]+$");
        Matcher m=p.matcher(val3);
        boolean b=m.matches();
        return b;
    }
    
    public void populateOrganizationEmpComboBox(){
        organizationEmpJComboBox.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            organizationEmpJComboBox.addItem(organization);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){

            String r = role.toString();
            roleJComboBox.addItem(role);
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (UserAccount acc : organization.getUserAccountDirectory().getUserAccountList()){
            Employee employee = acc.getEmployee();
            Object[] row = new Object[3];
            row[0] = employee.getId();
            row[1] = employee;
            row[2] = acc;
            model.addRow(row);
        
        }
    }
    private boolean usernamePatternCorrect(String val){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(val);
        boolean b=m.matches();
        return b;
    }
    private boolean namePatternCorrect(String val1){
        Pattern p=Pattern.compile("^[a-zA-Z]+$");
        Matcher m=p.matcher(val1);
        boolean b=m.matches();
        return b;
    }
    private boolean passwordPatternCorrect(String val4){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(String.valueOf(val4));
        boolean b1=m1.matches();
        return b1;
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
        organizationJTable = new javax.swing.JTable();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        createUserJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        emailIDAlreadyLbl = new javax.swing.JLabel();
        emailSuccessLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        citySuccessLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        passwordSuccessLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passwordJTextField = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 137, 19));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "User Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
            organizationJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 480, 170));

        organizationJComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 190, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setText("Organization:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 78, 25));

        backJButton.setBackground(new java.awt.Color(255, 102, 0));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 31));

        organizationEmpJComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpJComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 126, 190, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Organization:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 120, -1, 40));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Role:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 163, 72, 40));

        roleJComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 169, 190, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Email ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 70, 30));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 70, 10));

        createUserJButton.setBackground(new java.awt.Color(255, 102, 0));
        createUserJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 87, 44));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 80, 82));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Employees");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 78, 302, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 80, 82));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("View Employees");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 480, 31));

        btnRemove.setBackground(new java.awt.Color(255, 102, 0));
        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 113, 44));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Name:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 212, 72, 30));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 213, 190, 30));

        emailIDAlreadyLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        emailIDAlreadyLbl.setForeground(new java.awt.Color(255, 0, 0));
        emailIDAlreadyLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailIDAlreadyLbl.setText("EmailID already Exists");
        add(emailIDAlreadyLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 160, 20));

        emailSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(emailSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 30, 50));

        emailLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(255, 0, 0));
        emailLbl.setText("Valid Format - 'xx@xx.xx'");
        add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 150, 20));

        cityLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        cityLbl.setForeground(new java.awt.Color(255, 0, 0));
        cityLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityLbl.setText("Only Alphabets are allowed");
        add(cityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 160, 20));

        citySuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(citySuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 30, 30));

        passwordLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 0, 0));
        passwordLbl.setText("Sample format: Asdf@1");
        add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 160, 10));

        passwordSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(passwordSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 30, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 40, 320));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1100, -1));

        passwordJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordJTextFieldKeyReleased(evt);
            }
        });
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 190, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/addEmployee.jpg"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -10, 1410, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        org = (Organization) organizationJComboBox.getSelectedItem();
        if (org != null){
            populateTable(org);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = txtUserName.getText();
        String password = passwordJTextField.getText();
        //String name = txtName.getText();
        
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        
        Employee employee = new Employee();
        employee.setName(txtName.getText());
        
        Role role = (Role) roleJComboBox.getSelectedItem();
        

        if(!txtUserName.getText().isEmpty() && !passwordJTextField.getText().isEmpty() && !txtName.getText().isEmpty()){
            if(organization.getEmployeeDirectory().checkIfUsernameIsUnique(userName)){
                if(usernamePatternCorrect(userName)){
                    if(organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
                        organization.getEmployeeDirectory().createEmployee(txtName.getText());
                         organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                        // organization.getUserAccountDirectory().createUserAccount(userName, password, role);
                         JOptionPane.showMessageDialog(null,"Employee created successfully");
                         //nd@nd.com    populateTable(organization);
                         txtUserName.setText("");
                         passwordJTextField.setText("");
                         txtName.setText("");
                         citySuccessLbl.setVisible(false);
                         emailSuccessLbl.setVisible(false);
                         passwordSuccessLbl.setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Username already exists", "Warning", JOptionPane.WARNING_MESSAGE);
                        txtUserName.setText("");
                        return;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email format emp@domain.com", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtUserName.setText("");
                    return;
                }
            }
            else{
                    JOptionPane.showMessageDialog(null, "Employee already exists", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtName.setText("");
                    return;
            } 
        }
        else{
                JOptionPane.showMessageDialog(null, "All fields must be entered", "Warning", JOptionPane.WARNING_MESSAGE);
                txtName.setText("");
        if(txtUserName.getText().isEmpty() && passwordJTextField.getText().isEmpty() && txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields must be entered", "Warning", JOptionPane.WARNING_MESSAGE);

                return;
        }
            if(userNameValid && nameValid && passwordValid){
                organization.getEmployeeDirectory().createEmployee(txtUserName.getText());
                 organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                 JOptionPane.showMessageDialog(null,"Employee created successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                 //populateTable(organization);
                 txtUserName.setText("");
                 passwordJTextField.setText("");
                 txtName.setText("");
                 clearLabels();
            }
        }   
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void organizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpJComboBoxActionPerformed
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        if (organization != null){
            //populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationEmpJComboBoxActionPerformed

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased

        // TODO add your handling code here:
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        if(!usernamePatternCorrect(txtUserName.getText()) && !(txtUserName.getText().isEmpty())){
            emailSuccessLbl.setVisible(false);
            emailIDAlreadyLbl.setVisible(false);
            emailLbl.setVisible(true);
            userNameValid = false;
        }else if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(txtUserName.getText())){
            emailSuccessLbl.setVisible(false);
            emailIDAlreadyLbl.setVisible(true);
            emailLbl.setVisible(false);
            userNameValid = false;

        }else if(txtUserName.getText().isEmpty()){
            emailSuccessLbl.setVisible(false);
            emailIDAlreadyLbl.setVisible(false);
            emailLbl.setVisible(false);
            userNameValid = false;
        }else {
            emailSuccessLbl.setVisible(true);
            emailIDAlreadyLbl.setVisible(false);
            emailLbl.setVisible(false);
            userNameValid = true;
        }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int row = organizationJTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Employee e1 = (Employee)organizationJTable.getValueAt(row, 1);
        UserAccount ua = (UserAccount)organizationJTable.getValueAt(row, 2);
        org.getEmployeeDirectory().removeEmployee(e1);
        org.getUserAccountDirectory().removeUserAccount(ua);
        populateTable(org);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if(!cityPatternCorrect(txtName.getText()) && !(txtName.getText().isEmpty())){
            citySuccessLbl.setVisible(false);
            cityLbl.setVisible(true);
            nameValid = false;
        }else if(txtName.getText().isEmpty()){
            citySuccessLbl.setVisible(false);
            cityLbl.setVisible(false);
            nameValid = false;
        }else{
            nameValid = true;
            cityLbl.setVisible(false);
            citySuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void passwordJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordJTextFieldKeyReleased
        // TODO add your handling code here:
         if(!passwordPatternCorrect(passwordJTextField.getText()) && !(passwordJTextField.getText().isEmpty())){
            passwordSuccessLbl.setVisible(false);
            passwordLbl.setVisible(true);
        }else if(passwordJTextField.getText().isEmpty()){
            passwordLbl.setVisible(false);
             passwordSuccessLbl.setVisible(false);
        }else{
            passwordLbl.setVisible(false);
            passwordSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_passwordJTextFieldKeyReleased
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JLabel citySuccessLbl;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JLabel emailIDAlreadyLbl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel emailSuccessLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JPasswordField passwordJTextField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel passwordSuccessLbl;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

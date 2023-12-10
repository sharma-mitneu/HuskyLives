/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NutritionistWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashish
 */
public class ManageRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRequestsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    //private AdminOrganization adminOrganization;
    private Enterprise enterprise;

    

    public ManageRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise;
        workRequestJTable.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        //this.adminOrganization = (AdminOrganization)organization;
       
        populateOrganization();
    }
    private void populateOrganization() {
        
        orgComboBox.removeAllItems();
        
        employeeComboBox.removeAllItems();
        
       for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                orgComboBox.addItem(organization.toString());
        }
       
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        String o = orgComboBox.getSelectedItem().toString();
         for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org.getName().equals(o)){
                for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
           
            row[0] = request.getSender().getCustomer().getName();
            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[2] = request;
            row[3] = request.getStatus();
            
            model.addRow(row);
            }}  
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

        jLabel1 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox();
        employeeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        assignBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 137, 19));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setText("Organization:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 94, -1, -1));

        orgComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        orgComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboBoxActionPerformed(evt);
            }
        });
        orgComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                orgComboBoxPropertyChange(evt);
            }
        });
        add(orgComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 86, 190, 30));

        employeeComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 345, 190, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Assign Selected Task to:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 353, 172, -1));

        assignBtn.setBackground(new java.awt.Color(255, 102, 0));
        assignBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 417, 93, 42));

        workRequestJTable.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Goal", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 170, 653, 96));

        backJButton.setBackground(new java.awt.Color(255, 102, 0));
        backJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/manageRequest.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow >= 0){
            WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 2);
            //NutritionistWorkRequest request = (NutritionistWorkRequest) workRequestJTable.getValueAt(selectedRow, 2);
        //request.setSender(userAccount);
            if(!request.getStatus().equals("Assigned") && !request.getStatus().equals("Result Posted")){
                for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount user: org.getUserAccountDirectory().getUserAccountList()){
                        if(employeeComboBox.getSelectedItem().equals(user.getEmployee().getName())){    
                            
                            int x = user.getWorkQueue().getWorkRequestList().size();
                            if(x>0){
                            WorkRequest r = user.getWorkQueue().getWorkRequestList().get(x-1);
                            String st = r.getStatus();
                                if(st.equals("Assigned")){
                                    JOptionPane.showMessageDialog(null,"Asignee already has a request in open status!","Error",JOptionPane.ERROR_MESSAGE);
                                        return;
                                    
                                }
                                else{
                                request.setReceiver(user);
                                //request.setStatus("Assigned to " + employeeComboBox.getSelectedItem());
                                 request.setStatus("Assigned");
                                 JOptionPane.showMessageDialog(null,"Request has been Assigned Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
                                user.getWorkQueue().getWorkRequestList().add(request);

                                }}else{
                            request.setReceiver(user);
                            //request.setStatus("Assigned to " + employeeComboBox.getSelectedItem());
                             request.setStatus("Assigned");
                             JOptionPane.showMessageDialog(null,"Request has been Assigned Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
                            user.getWorkQueue().getWorkRequestList().add(request);

                                }
                        }
                    }
                }
                populateTable();
            }else{
                if(request.getStatus().equals("Assigned")){
                     JOptionPane.showMessageDialog(null,"Request has been assigned Already!","Alert",JOptionPane.INFORMATION_MESSAGE);
                }else if(request.getStatus().equals("Result Posted")){
                     JOptionPane.showMessageDialog(null,"Request has been Posted Already!","Alert",JOptionPane.INFORMATION_MESSAGE);
                }
               
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please Select a row","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_assignBtnActionPerformed

    private void orgComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboBoxActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_orgComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void orgComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_orgComboBoxPropertyChange
        // TODO add your handling code here:
             
        
        
    }//GEN-LAST:event_orgComboBoxPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        employeeComboBox.removeAllItems();
        String organization = orgComboBox.getSelectedItem().toString();
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org.getName().equals(organization)){
                
                for(Employee emp:org.getEmployeeDirectory().getEmployeeList()){
                    employeeComboBox.addItem(emp.getName());
                }
               
                    
                }
            
         populateTable();
                
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox<String> employeeComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgComboBox;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    
}

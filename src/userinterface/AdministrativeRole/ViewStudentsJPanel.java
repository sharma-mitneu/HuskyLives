/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.AdministrativeRole;

import Business.Student.Student;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author omkar
 */
public class ViewStudentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStudentsJPanel
     */
    
    private EcoSystem business;
    private JPanel userProcessContainer;
    
    public ViewStudentsJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        txtNuIdSearchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 51, 51));
        enterpriseLabel.setText("Northeastern University Students");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 410, 30));

        tblStudents.setBackground(new java.awt.Color(204, 204, 204));
        tblStudents.setForeground(new java.awt.Color(0, 0, 0));
        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUID", "Name", "Campus", "Room Number", "Email"
            }
        ));
        jScrollPane1.setViewportView(tblStudents);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 670, 220));

        txtNuIdSearchField.setBackground(new java.awt.Color(204, 204, 204));
        txtNuIdSearchField.setForeground(new java.awt.Color(0, 0, 0));
        add(txtNuIdSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 120, -1));

        searchBtn.setBackground(new java.awt.Color(204, 204, 204));
        searchBtn.setForeground(new java.awt.Color(51, 51, 51));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLabel1.setText("Enter NUID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(51, 51, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        int nuId = 0;
        try {
            nuId = Integer.parseInt(txtNuIdSearchField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(nuId==0){
            populateTable();
            return;
        }
        
        Student studentResult = null;
        for(Student student: business.getStudentDirectory().getStudentList()){
            if(student.getId() == nuId){
                studentResult = student;
                break;
            }
        }
        
        if(studentResult == null) {
            JOptionPane.showMessageDialog(this, "Student not found!", "Not Found", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        
        model.setRowCount(0);
        Object[] row = new Object[5];
        row[0] = studentResult.getId();
        row[1] = studentResult.getName();
        row[2] = studentResult.getNetwork();
        row[3] = studentResult.getRoomNumber();
        row[4] = studentResult.getEmail();
        
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtNuIdSearchField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        
        model.setRowCount(0);
        
        for (Student student : business.getStudentDirectory().getStudentList()){
            Object[] row = new Object[5];
            row[0] = student.getId();
            row[1] = student.getName();
            row[2] = student.getNetwork();
            row[3] = student.getRoomNumber();
            row[4] = student.getEmail();
            
            model.addRow(row);
        }
    }
}

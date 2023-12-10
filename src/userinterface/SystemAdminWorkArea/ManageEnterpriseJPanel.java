/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author srira
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network n;
    private boolean nameValid;
    private int entAvail = 0;
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
citySuccessLbl.setVisible(false);
enterpriseJTable.getTableHeader().setDefaultRenderer(new tableHeaderColors());
            cityLbl.setVisible(false);
        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }
 private boolean cityPatternCorrect(String val3){
        Pattern p=Pattern.compile("^[a-zA-Z ]+$");
        Matcher m=p.matcher(val3);
        boolean b=m.matches();
        return b;
    }
    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network); 
        }
         for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
                enterpriseTypeJComboBox.addItem(type); 
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
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        citySuccessLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setBackground(new java.awt.Color(204, 204, 204));
        enterpriseJTable.setForeground(new java.awt.Color(0, 0, 0));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 74, 523, 95));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Network:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 215, 88, -1));

        networkJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        networkJComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 211, 190, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enterprise Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 301, 130, -1));

        nameJTextField.setBackground(new java.awt.Color(204, 204, 204));
        nameJTextField.setForeground(new java.awt.Color(0, 0, 0));
        nameJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameJTextFieldKeyReleased(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 297, 190, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enterprise Type:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 258, -1, -1));

        enterpriseTypeJComboBox.setBackground(new java.awt.Color(204, 204, 204));
        enterpriseTypeJComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        enterpriseTypeJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 254, 190, 30));

        submitJButton.setBackground(new java.awt.Color(204, 204, 204));
        submitJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(51, 51, 51));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 101, 41));

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
        backJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(51, 51, 51));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANAGE ENTERPRISE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 723, 30));

        citySuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(citySuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 30, 60));

        cityLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        cityLbl.setForeground(new java.awt.Color(255, 51, 51));
        cityLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityLbl.setText("Only Alphabets are allowed");
        add(cityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 220, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        Network network = (Network) networkJComboBox.getSelectedItem();
                    for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList() ){
                       if(e.getEnterpriseType().equals(enterpriseTypeJComboBox.getSelectedItem())){
                           entAvail = 1;
                       }
               }
       
        if(nameValid && entAvail != 1){
            //Network network = (Network) networkJComboBox.getSelectedItem();
            Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

            if (network == null || type == null) {
                JOptionPane.showMessageDialog(null, "Invalid Input!");
                return;
            }

            String name = nameJTextField.getText();
            Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);   

            //Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
            n = network;
            citySuccessLbl.setVisible(false);
            populateTable();
            nameJTextField.setText("");
        }else {
            if(entAvail == 1){
                JOptionPane.showMessageDialog(null, "Enterprise is already added !","Alert",JOptionPane.INFORMATION_MESSAGE);
                citySuccessLbl.setVisible(false);
                nameJTextField.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!","Error",JOptionPane.ERROR_MESSAGE);
            }
           
        }

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    private void nameJTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameJTextFieldKeyReleased
        // TODO add your handling code here:
        if(!cityPatternCorrect(nameJTextField.getText()) && !(nameJTextField.getText().isEmpty())){
            citySuccessLbl.setVisible(false);
            cityLbl.setVisible(true);
            nameValid = false;
        }else if(nameJTextField.getText().isEmpty()){
            citySuccessLbl.setVisible(false);
            cityLbl.setVisible(false);
            nameValid = false;
        }else{
            cityLbl.setVisible(false);
            nameValid = true;
            citySuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_nameJTextFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JLabel citySuccessLbl;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}

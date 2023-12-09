/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StoreManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Items;
import Business.Organization.Organization;
import Business.Store.Store;
//import Business.Restaurant.Restaurant;
//import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.utilities.tableHeaderColors;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srira
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAcc;
   // private Restaurant restaurant;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;
    private boolean priceValid;
    private boolean itemValid;

    /**
     * Creates new form ManageMenuJPanel
     */

    ManageInventoryJPanel(JPanel userProcessContainer, Organization organization, EcoSystem business, Enterprise enterprise, UserAccount account) {
       initComponents();
        this.organization=organization;
        this.enterprise=enterprise;
        this.account=account;
        this.business=business;
        itemLbl.setVisible(false);
        itemSuccessLbl.setVisible(false);
        priceLbl.setVisible(false);
        price0lbl.setVisible(false);
        menuTbl.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        priceSuccessLbl.setVisible(false);
        this.userProcessContainer=userProcessContainer;
                populateTable();
    }
      private boolean cityPatternCorrect(String val3){
        Pattern p=Pattern.compile("^[a-zA-Z ]+$");
        Matcher m=p.matcher(val3);
        boolean b=m.matches();
        return b;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        itemNameTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        itemLbl = new javax.swing.JLabel();
        itemSuccessLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        priceSuccessLbl = new javax.swing.JLabel();
        price0lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        priceLbl1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 137, 19));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 80, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Store Inventory Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1200, 37));

        menuTbl.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        menuTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTbl);
        if (menuTbl.getColumnModel().getColumnCount() > 0) {
            menuTbl.getColumnModel().getColumn(0).setResizable(false);
            menuTbl.getColumnModel().getColumn(1).setResizable(false);
            menuTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 103, -1, 91));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Item Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 100, 30));

        itemNameTxt.setMinimumSize(new java.awt.Dimension(7, 25));
        itemNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemNameTxtKeyReleased(evt);
            }
        });
        add(itemNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 150, 30));

        priceTxt.setMinimumSize(new java.awt.Dimension(7, 25));
        priceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceTxtKeyReleased(evt);
            }
        });
        add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 150, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 130, 30));

        backBtn.setBackground(new java.awt.Color(255, 102, 0));
        backBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        addBtn.setBackground(new java.awt.Color(255, 102, 0));
        addBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 100, 40));

        delBtn.setBackground(new java.awt.Color(255, 102, 0));
        delBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 205, 80, 40));

        itemLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        itemLbl.setForeground(new java.awt.Color(181, 7, 7));
        itemLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemLbl.setText("Only Alphabets are allowed");
        add(itemLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 150, 20));

        itemSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(itemSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 30, -1));

        priceLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        priceLbl.setForeground(new java.awt.Color(181, 7, 7));
        priceLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLbl.setText("Only Numbers Allowed");
        add(priceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 160, 20));

        priceSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/tick.png"))); // NOI18N
        add(priceSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 30, -1));

        price0lbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        price0lbl.setForeground(new java.awt.Color(181, 7, 7));
        price0lbl.setText("Price Should be Greater than 0");
        add(price0lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setText("Item Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 60, 30));

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipments", "Supplements" }));
        add(typeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/manageinventory.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 1340, 770));

        priceLbl1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        priceLbl1.setForeground(new java.awt.Color(181, 7, 7));
        priceLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLbl1.setText("Only Numbers Allowed");
        add(priceLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 160, 20));
    }// </editor-fold>//GEN-END:initComponents
    /*public void populateRestaurantJComboBox() {
            resNameCmbBox.removeAllItems();

            for (Restaurant rest : system.getRestaurantDirectory().getRestaurantList()) {
                if (userAcc.getEmployee().getName().equals(rest.getName())) {
                    resNameCmbBox.addItem(rest);
                }
            }
        }*/
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) menuTbl.getModel();
        dtm.setRowCount(0);
      
        for(Items store:enterprise.getItemsList()) {
            Object row[] = new Object[3];
            row[0] = store;
            row[1] = store.getItemType();
            row[2] = store.getPrice();
            dtm.addRow(row);
        }
    }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(priceValid && itemValid){
            
            for(Items item:enterprise.getItemsList()) {
            if(itemNameTxt.getText().equals(item.getItemName())){
                
        JOptionPane.showMessageDialog(null, "Item already exists.","Error",JOptionPane.ERROR_MESSAGE);
        return;
            } 
        }
        if(itemNameTxt.getText().equals("")||itemNameTxt.getText()==null){
              JOptionPane.showMessageDialog(null, "Field(s) cannot be empty.","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        if(!itemNameTxt.getText().matches("^[a-zA-Z0-9 ]*$")){
            JOptionPane.showMessageDialog(null, "Invalid Item Name.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            Double.parseDouble(priceTxt.getText());
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Invalid Price.","Error",JOptionPane.ERROR_MESSAGE);
        return;
        }
        if(Double.parseDouble(priceTxt.getText()) <= 0){
            JOptionPane.showMessageDialog(null, "Price should be greater than zero.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String name = itemNameTxt.getText();
        String type = (String) typeComboBox.getSelectedItem();
        int price = Integer.parseInt(priceTxt.getText());
        Items s = enterprise.createMenuItem();
        s.setItemName(name);
        s.setItemType(type);
        s.setPrice(price);
        JOptionPane.showMessageDialog(null, "Item Added Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
        populateTable();
        itemNameTxt.setText("");
        priceTxt.setText("");
        typeComboBox.setSelectedIndex(0);
        itemSuccessLbl.setVisible(false);
        priceSuccessLbl.setVisible(false);
        
        }else{
            JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
                  int selectedRow = menuTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            Items item = (Items)menuTbl.getValueAt(selectedRow, 0);
           enterprise.deleteItem(item);
        JOptionPane.showMessageDialog(null, "Item deleted successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
        populateTable();
    } 
    }//GEN-LAST:event_delBtnActionPerformed

    private void itemNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemNameTxtKeyReleased
        // TODO add your handling code here:
        if(!cityPatternCorrect(itemNameTxt.getText()) && !(itemNameTxt.getText().isEmpty())){
            itemSuccessLbl.setVisible(false);
            itemValid = false;
            itemLbl.setVisible(true);
        }else{
            itemLbl.setVisible(false);
            itemValid = true;
            itemSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_itemNameTxtKeyReleased

    private void priceTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTxtKeyReleased
        // TODO add your handling code here:
        if(priceTxt.getText().isEmpty()){
             priceValid = false;
             priceSuccessLbl.setVisible(false);
             priceLbl.setVisible(false);
             price0lbl.setVisible(false);
             return;
        }
        int price=0;
        try{
            price = Integer.parseInt(priceTxt.getText());
            if(price > 0){ 
            priceValid = true;
             priceSuccessLbl.setVisible(true);
             priceLbl.setVisible(false);
             price0lbl.setVisible(false);
             return;
            }else if( price == 0 || price < 0){
            priceValid = false;
             priceSuccessLbl.setVisible(false);
             price0lbl.setVisible(true);
             priceLbl.setVisible(false);
             return;
            }
        }catch(NumberFormatException e){
            if(!priceTxt.getText().isEmpty()){
             priceValid = false;
             priceSuccessLbl.setVisible(false);
             priceLbl.setVisible(true);
             price0lbl.setVisible(false);
             return;
            }else {
             priceValid = false;
             priceLbl.setVisible(false);
             price0lbl.setVisible(false);
             priceSuccessLbl.setVisible(true);
             return;
            }
        }
    }//GEN-LAST:event_priceTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JLabel itemLbl;
    private javax.swing.JTextField itemNameTxt;
    private javax.swing.JLabel itemSuccessLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menuTbl;
    private javax.swing.JLabel price0lbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JLabel priceLbl1;
    private javax.swing.JLabel priceSuccessLbl;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JComboBox<String> typeComboBox;
    // End of variables declaration//GEN-END:variables
}

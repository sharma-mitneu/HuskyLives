

package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  ashish
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Organization organization;
    UserAccount account;
    EcoSystem business;
     Network network;
    /** Creates new form AdminWorkAreaJPanel */
  
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.business = business;
        this.account = account;
        this.network =network;
        greetLbl.setText(account.getEmployee().getName()+ "!!");
        valueLabel.setText(enterprise.getName());
        if(enterprise.getEnterpriseType().toString().equals("Dorm Inventory Unit")){
            manageRequestsBtn.setVisible(false);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageRequestsBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        greetLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageEmployeeJButton.setBackground(new java.awt.Color(204, 204, 204));
        manageEmployeeJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        manageEmployeeJButton.setForeground(new java.awt.Color(51, 51, 51));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 180, 40));

        manageOrganizationJButton.setBackground(new java.awt.Color(204, 204, 204));
        manageOrganizationJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        manageOrganizationJButton.setForeground(new java.awt.Color(51, 51, 51));
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 180, 40));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 51, 51));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 150, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 51, 51));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 220, 30));

        manageRequestsBtn.setBackground(new java.awt.Color(204, 204, 204));
        manageRequestsBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        manageRequestsBtn.setForeground(new java.awt.Color(51, 51, 51));
        manageRequestsBtn.setText("Manage Requests");
        manageRequestsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRequestsBtnActionPerformed(evt);
            }
        });
        add(manageRequestsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 180, 40));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Welcome,");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 40));

        greetLbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        greetLbl.setForeground(new java.awt.Color(204, 204, 204));
        greetLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(greetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 320, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundLogo.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 100));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/backgroundFoot.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 264, 52));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),business);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageRequestsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRequestsBtnActionPerformed
        ManageRequestsJPanel manageRequestsJPanel = new ManageRequestsJPanel(userProcessContainer, enterprise, account, organization, business);
        userProcessContainer.add("manageRequestsJPanel", manageRequestsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageRequestsBtnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel greetLbl;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageRequestsBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}

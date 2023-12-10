/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.StudentRole.CreateNewStudentJPanel;
import userinterface.SystemAdminWorkArea.ManageNetworkJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
/**
 *
 * @author ashish
 */
public class MainJFrame extends javax.swing.JFrame {
private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    EcoSystem system;
    UserAccount account;
    Enterprise enterprise;
    Organization organization;
    Network network;
    /**
     * Creates new form MainJFrameCopy
     */
    public MainJFrame() {
        initComponents();
         system = dB4OUtil.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        LeftJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loginJButton = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        orangeLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jSplitPane1.setDividerLocation(300);
        jSplitPane1.setMaximumSize(new java.awt.Dimension(1754, 724));

        LeftJPanel.setBackground(new java.awt.Color(51, 51, 51));
        LeftJPanel.setMaximumSize(new java.awt.Dimension(467, 722));
        LeftJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/usernameIcon.png"))); // NOI18N
        LeftJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 40, -1));

        userNameJTextField.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        LeftJPanel.add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 204, 32));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/passwordIcon.png"))); // NOI18N
        LeftJPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 347, 40, 41));

        passwordField.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        LeftJPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 347, 204, 32));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("New User? Click on Sign Up");
        LeftJPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 204, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/UserImg.png"))); // NOI18N
        LeftJPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 78, 250, 150));

        loginJButton.setBackground(new java.awt.Color(204, 204, 204));
        loginJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(51, 51, 51));
        loginJButton.setText("Log in");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        LeftJPanel.add(loginJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 409, 148, 49));

        registerBtn.setBackground(new java.awt.Color(204, 204, 204));
        registerBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(51, 51, 51));
        registerBtn.setText("Sign Up");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        LeftJPanel.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 558, 149, 49));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Northeastern University");
        LeftJPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 295, 58));

        logoutJButton.setBackground(new java.awt.Color(204, 204, 204));
        logoutJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(51, 51, 51));
        logoutJButton.setText("Log Out");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        LeftJPanel.add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 469, 148, 49));

        jSplitPane1.setLeftComponent(LeftJPanel);

        container.setLayout(new java.awt.CardLayout());

        orangeLbl.setBackground(new java.awt.Color(51, 51, 51));
        orangeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/orangesBackground.jpg"))); // NOI18N
        container.add(orangeLbl, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
         
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise enterprise =null;
        Organization organization=null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=e.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization org:e.getOrganizationDirectory().getOrganizationList()){
                           userAccount=org.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               enterprise = e;
                               organization=org;
                               break;
                           }
                       }
                        
                    }
                    else{
                       enterprise = e;
                       break;
                    }
                    if(organization!=null){
                        break;
                    }  
                }
                if(enterprise!=null){
                    break;
                }
            }
        }
        if(userAccount !=null && userAccount.getStudent() != null){
            network = userAccount.getStudent().getNetwork();
        
        }
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();
//            System.out.println("role while loggin in" + userAccount.getRole());
//            System.out.println("enterprise" + enterprise.toString());
//            System.out.println("organization" + organization.toString());
//            System.out.println("user account" + userAccount);
            
            container.add("workArea",userAccount.getRole().createWorkArea(container, enterprise, organization,userAccount , system, network));
            layout.next(container);
        }
        
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        registerBtn.setVisible(false);

    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        // TODO add your handling code here:
         logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        //orangeLbl.setEnabled(true);
        registerBtn.setVisible(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
       jSplitPane1.setLeftComponent(LeftJPanel);

        container.setLayout(new java.awt.CardLayout());

        orangeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/orangesBackground.jpg"))); // NOI18N
       
        container.add(orangeLbl, "card2");
        jSplitPane1.setRightComponent(container);
        getContentPane().add(jSplitPane1, "card2");
        pack();
        jSplitPane1.setDividerLocation(300);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        System.out.println("user list  " + system.getUserAccountDirectory().getUserAccountList());
        CreateNewStudentJPanel createCus =new CreateNewStudentJPanel(container, system);
        container.add("SignUpJPanel",createCus);
        CardLayout layout=(CardLayout)container.getLayout();
        layout.next(container);
        // TODO add your handling code here:
    }//GEN-LAST:event_registerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftJPanel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JLabel orangeLbl;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}

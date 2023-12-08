/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

public class AdminRole extends Role{

    public AdminRole(){
        this.type = RoleType.Admin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        
        return new AdminWorkAreaJPanel(userProcessContainer, Business.getInstance());
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ServiceProviderRole;
//import Business.Role.StoreManagerRole;
import java.util.ArrayList;

/**
 *
 * @author ashish
 */
public class ServiceOrganization extends Organization{
    
    public ServiceOrganization() {
        super(Organization.Type.Service.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ServiceProviderRole());
        return roles;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.DormInventoryManagerRole;
import java.util.ArrayList;

/**
 *
 * @author omkar
 */
public class InventoryOrganization extends Organization{

    public InventoryOrganization() {
        super(Organization.Type.DormInventory.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DormInventoryManagerRole());
        return roles;
    }
}

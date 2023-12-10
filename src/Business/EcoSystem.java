/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Student.StudentDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.Items;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Inventory.DormInventoryDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Inventory.DormInventory;
import java.util.ArrayList;

/**
 *
 * @author ashish
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private StudentRequestDirectory studentRequestDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    private DormInventory dormInventoryDirectory;
    
    private EcoSystem(){
        super(null);
        studentRequestDirectory = new StudentRequestDirectory();
        enterpriseDirectory=new EnterpriseDirectory();
        networkList=new ArrayList<Network>();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public static EcoSystem getBusiness() {
        return business;
    }
    public StudentRequestDirectory getStudentRequestDirectory() {
        return studentRequestDirectory;
    }

    public void setStudentRequestDirectory(StudentRequestDirectory studentRequestDirectory) {
        this.studentRequestDirectory = studentRequestDirectory;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Network network){
        networkList.remove(network);
        //return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
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
    
    private EcoSystem(){
        super(null);
        studentRequestDirectory = new StudentRequestDirectory();
        enterpriseDirectory = new EnterpriseDirectory();
        networkList = new ArrayList<>();
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
        if(business == null){
            business = new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Network network){
        networkList.remove(network);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
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
        return true;
    }
}

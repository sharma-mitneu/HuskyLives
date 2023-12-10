/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author omkar
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;

        if (type.getValue().equals(Type.Nutrition.getValue())){
            organization = new NutritionOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.WeightTraining.getValue())){
            organization = new WeightTrainingOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.FitnessTraining.getValue())){
            organization = new FitnessTrainingOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Physiotherapist.getValue())){
            organization = new PhysioOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.GeneralPractitioner.getValue())){
            organization = new GenPracOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.DormInventory.getValue())){
            organization = new InventoryOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Service.getValue())){
            organization = new ServiceOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.ServiceWorker.getValue())){
            organization = new ServiceWorkerOrganization();
            organizationList.add(organization);
        }
      
        return organization;
    }
}
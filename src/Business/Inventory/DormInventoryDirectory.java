/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;
import java.util.ArrayList;

/**
 *
 * @author srira
 */
public class DormInventoryDirectory {
    private ArrayList<DormInventory> dormInventoryList;
    
    public DormInventoryDirectory() {
        dormInventoryList = new ArrayList<>();
    }
    
    public ArrayList<DormInventory> getDormInventoryList() {
        return dormInventoryList;
    }
    
    public DormInventory createItem(DormInventory dormInventory){
        dormInventoryList.add(dormInventory);
        return dormInventory;
    }
    
    public DormInventory updateItem(DormInventory dormInventory,String itemName, int price){
        dormInventory.setItemName(itemName);
        dormInventory.setPrice(price);
        return dormInventory;
    }
}

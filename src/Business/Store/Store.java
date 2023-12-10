/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Store;

/**
 *
 * @author ashish
 */
public class Store{
    String itemName;
    int price;
    String itemType;
    
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String ItemName) {
        this.itemName = ItemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    
    
    @Override
        public String toString(){
        return itemName;
    }
}

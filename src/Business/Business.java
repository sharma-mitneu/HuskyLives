/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class Business {

    private static Business business;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
    }

   
}

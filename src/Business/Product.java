/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

/**
 *
 * @author Deepak
 */
public class Product {

    private int productId;
    private String name;
    private int price; 
    
    public Product(){
       
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    

}

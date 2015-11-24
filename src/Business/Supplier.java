/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

/**
 *
 * @author Deepak
 */
public class Supplier {
    private String name;
    private ProductCatalog productCatalog;
    
    public Supplier(){
        productCatalog = new ProductCatalog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}

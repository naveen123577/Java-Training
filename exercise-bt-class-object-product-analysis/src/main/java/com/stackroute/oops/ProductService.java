package com.stackroute.oops;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {
    Product[] productArray= ProductRepository.getProducts();

    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
        if(productArray==null){
            return null;
        }
        for(Product product: productArray){
            if(product.getProductCode() == productCode){
                return product.getName();
            }
        }
        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
        Product returnvalue= null;
        double max=0;
        if(productArray==null){
            return null;
        }

        for(Product product:productArray){
            if(product.getCategory().equalsIgnoreCase(category)){
                if(product.getPrice()>max){
                    max = product.getPrice();
                    returnvalue=product;
                }
            }
        }
        if(returnvalue==null){
            return null;
        }
//            return null;

        return returnvalue;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
        Product[] subcategory = new Product[10];
        int index = 0;
        if(productArray==null){
            return null;
        }
        for(Product product : productArray){
            if(product.getCategory().equalsIgnoreCase(category)){
                subcategory[index]=product;
                index++;
            }
        }
        if (index == 0){
            return null;
        }
        Product[] actualCategory = new Product[index];
        for(int i =0; i<index; i++){
            actualCategory[i]=subcategory[i];
        }
        return actualCategory;
    }
}

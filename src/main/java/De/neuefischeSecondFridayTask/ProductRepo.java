package De.neuefischeSecondFrydayTask;

import java.util.HashMap;

public class ProductRepo {
    private HashMap<Integer, Product> products;

    public ProductRepo(HashMap<Integer,Product>products) {
        this.products = products;

    }

    public  Product getProduct(int id) {
        return products.get(id);
    }
public  HashMap<Integer,Product> list(){
        return products;
}

}




package De.neuefischeSecondFrydayTask;

import java.util.HashMap;

public class Order {
    private String id;
    private HashMap<String,Product>products;

    public String getId() {
        return id;
    }

    public HashMap<String,Product> getProducts() {
        return products;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProducts(HashMap<String, Product> products) {
        this.products = products;
    }
}

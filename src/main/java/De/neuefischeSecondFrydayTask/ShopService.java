package De.neuefischeSecondFrydayTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;


    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {

        this.orderRepo = orderRepo;
        this.productRepo = productRepo;

    }

    public Collection<Product> getAllProducts() {
        return productRepo.list().values();
    }

    public Collection<Order> getAllOrders() {
        return orderRepo.list().values();
    }
public Product getproduct(int id){

        return productRepo.getProduct(id);
}
public Order getOrder (String id){
        return orderRepo.getOrder(id);
}
public void add (Order value){

        orderRepo.add(value);
}
}








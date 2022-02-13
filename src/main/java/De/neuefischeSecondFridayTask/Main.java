package De.neuefischeSecondFrydayTask;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,Product>Products = new HashMap<>();
        Product milch = new Product(9898," Bio Milch");
        Product senf = new Product(8876," Senf");

        Products.put(8876,senf);
        Products.put(9898,milch);


        ProductRepo repo = new ProductRepo(Products);
        OrderRepo orderRepo = new OrderRepo();
        ShopService shopService =new ShopService(repo,orderRepo);

        Order milchi = new Order();
        milchi.setId("9999");



        shopService.add( milchi);


        System.out.println(repo.list());
        System.out.println(shopService.getAllProducts());
        System.out.println(shopService.getproduct(9898));
        System.out.println(shopService.getAllOrders());
        System.out.println(shopService.getOrder("9999"));



    }
}

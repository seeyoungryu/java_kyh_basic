package practiceCode.helloshop.order;


public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}

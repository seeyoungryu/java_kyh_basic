package practiceCode.quiz;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "방울토마토";
        order1.price = 5500;
        order1.quantity = 10;
        orders[0] = order1;


        ProductOrder order2 = new ProductOrder();
        order2.productName = "두부";
        order2.price = 2200;
        order2.quantity = 5;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "유정란 30구";
        order3.price = 15000;
        order3.quantity = 10;
        orders[2] = order3;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " ,가격: " + order.price + " ,주문수량: " + order.quantity);

            totalAmount += order.price * order.quantity;
        }

        System.out.println("총 결제 금액:" + totalAmount);

    }
}

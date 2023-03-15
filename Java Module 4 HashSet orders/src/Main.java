import java.util.*;
import java.lang.*;
class OrdersNumber{
    HashSet<String> orderNumbers;
    public OrdersNumber() {
        orderNumbers = new HashSet<String>();
    }
    public void addOrderNumber(String orderNumber) {
        orderNumbers.add(orderNumber);
    }
    public boolean containsOrderNumber(String orderNumber) {
        return orderNumbers.contains(orderNumber);
    }
    public void removeOrderNumber(String orderNumber) {
        orderNumbers.remove(orderNumber);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersNumber that = (OrdersNumber) o;
        return Objects.equals(orderNumbers, that.orderNumbers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderNumbers);
    }
}
public class Main {
    public static void main(String[] args) {
        OrdersNumber order = new OrdersNumber();
        order.addOrderNumber("123");
        order.addOrderNumber("456");
        order.addOrderNumber("123");
        System.out.println("is order nr 123 in the system? " + order.containsOrderNumber("123"));
        System.out.println("orders: " + order.orderNumbers.size());
        order.removeOrderNumber("123");
        System.out.println("is order nr 123 in the system? " + order.containsOrderNumber("123"));
        }
}
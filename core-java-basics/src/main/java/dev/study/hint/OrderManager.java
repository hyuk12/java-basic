package dev.study.hint;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
  private final List<Order> orders = new ArrayList<>();

  public void addOrder(Order order) {
    orders.add(order);
  }

  public Order searchOrder(int orderNumber) {
    for (Order order : orders) {
      if (order.orderNumber() == orderNumber) {
        return order;
      }
    }
    return null;
  }

  public void printAllOrders() {
    for (Order order : orders) {
      System.out.println("주문 번호: " + order.orderNumber() +
          ", 고객: " + order.customerName() +
          ", 총 가격: " + order.totalPrice());
    }
  }
}

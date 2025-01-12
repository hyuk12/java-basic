package dev.study.answer;

import dev.study.hint.Order;
import dev.study.hint.Product;
import java.util.ArrayList;
import java.util.List;

public class OrderManager {
  private final List<Order> orders = new ArrayList<>();
  private final List<Product> products = new ArrayList<>();

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
      System.out.println("  상품 목록: " + order.products());
    }
  }

  // 상품 추가 메서드
  public void addProduct(Product product) {
    products.add(product);
  }

  // 상품 검색 (이름 기준)
  public Product searchProduct(String name) {
    for (Product product : products) {
      if (product.getName().equals(name)) {
        return product;
      }
    }
    return null;
  }

  // 상품 검색 (이름 및 가격 기준)
  public Product searchProduct(String name, double price) {
    for (Product product : products) {
      if (product.getName().equals(name) && product.getPrice() == price) {
        return product;
      }
    }
    return null;
  }
}

package dev.study.answer;

import dev.study.hint.Order;
import dev.study.hint.Product;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // 상품 생성
    Product laptop = new Product("Laptop", 1200.0);
    Product phone = new Product("Phone", 800.0);
    Product tablet = new Product("Tablet", 500.0);

    // 주문 관리 시스템
    OrderManager orderManager = new OrderManager();
    orderManager.addProduct(laptop);
    orderManager.addProduct(phone);
    orderManager.addProduct(tablet);

    // 주문 생성
    Order order1 = new Order(1, "Alice", List.of(laptop, phone), laptop.getPrice() + phone.getPrice());
    Order order2 = new Order(2, "Bob", List.of(tablet), tablet.getPrice());
    orderManager.addOrder(order1);
    orderManager.addOrder(order2);

    // 모든 주문 출력
    System.out.println("모든 주문 목록:");
    orderManager.printAllOrders();

    // 주문 검색
    System.out.println("\n주문 검색 (주문 번호 1):");
    Order foundOrder = orderManager.searchOrder(1);
    if (foundOrder != null) {
      System.out.println("고객: " + foundOrder.customerName() +
          ", 상품: " + foundOrder.products());
    }

    // 상품 검색
    System.out.println("\n상품 검색 (이름: Laptop):");
    Product foundProduct = orderManager.searchProduct("Laptop");
    if (foundProduct != null) {
      System.out.println("찾은 상품: " + foundProduct);
    }

    System.out.println("\n상품 검색 (이름: Phone, 가격: 800.0):");
    Product foundProduct2 = orderManager.searchProduct("Phone", 800.0);
    if (foundProduct2 != null) {
      System.out.println("찾은 상품: " + foundProduct2);
    }
  }
}

package dev.study.정적팩토리.basic.factory;

public class Main {
  public static void main(String[] args) {
    Product product = Product.create("Laptop", 1500);
    System.out.println(product);
  }
}

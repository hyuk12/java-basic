package dev.study.hint;

import java.util.List;

public record Order(
    int orderNumber,
    String customerName,
    List<Product> products,
    double totalPrice
) {

}

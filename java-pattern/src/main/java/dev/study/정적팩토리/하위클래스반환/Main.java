package dev.study.정적팩토리.하위클래스반환;

/**
 * 하위 클래스 반환
 * - 정적 팩토리 메서드에서 상위 클래스나 인터페이스를 반환
 * 구현 세부 사항을 감추고 객체 생성을 캡슐화
 */
interface Shape {
  void draw();
}

class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drawing a Circle");
  }
}

class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Drawing a Rectangle");
  }
}

class ShapeFactory {
  public static Shape createCircle() {
    return new Circle();
  }

  public static Shape createRectangle() {
    return new Rectangle();
  }
}

// 사용 예제
public class Main {
  public static void main(String[] args) {
    Shape circle = ShapeFactory.createCircle();
    Shape rectangle = ShapeFactory.createRectangle();

    circle.draw(); // Drawing a Circle
    rectangle.draw(); // Drawing a Rectangle
  }
}
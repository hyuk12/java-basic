package dev.study;

/**
 * 메서드의 구성
 * 접근 제어자 -> 메서드의 접근 범위를 지정
 * 접근 제어자	같은 클래스	같은 패키지	자식 클래스	전체(public)
 * public	O	O	O	O
 * protected	O	O	O	X
 * default	O	O	X	X
 * private	O	X	X	X
 * public, private, protected, (default)
 * 반환 타입 -> 메서드가 반환하는 값의 데이터
 *
 * 메서드의 이름 -> 메서드의 고유 이름
 * 파라미터 (매개변수) -> 메서드에 전달되는 값
 *
 * 메서드 오버로딩
 * 같은 이름의 메서드지만, 파라미터의 개수나, 타입이 디른경우
 * 장점 : 직관적이고 유연한 메서드 사용 가능
 *
 * 메서드 오버라이딩
 * 부모 클래스의 메서드를 자식 클래스에서 재정의 하는 것
 * 장점: 다형성을 활용하여 동적 메서드 호출
 */
public class Calculator {
  private final String name;

  public Calculator(String name) {
    this.name = name;
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  // 오버로딩 예제
  public double add(double a, double b) {
    return a + b;
  }

  @Override
  public String toString() {
    return "Calculator{name='" + name + "'}";
  }
}

class Animal {
  public void sound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  @Override
  public void sound() {
    System.out.println("Dog barks");
  }
}

package dev.study;

/**
 *  클래스 -> 객체를 생성하기 위한 틀
 *  예 ) 사람, 자동차, 동물과 같은 개념을 코드로 표현
 *
 *  객체 -> 클래스를 통해서 생성된 실체
 *  예) 홍길동이라는 이름을 가진 사람 객체, 소나타라는 이름을 가진 차 객체
 *
 *
 */
public class Person {
  String name; // 필드
  int age;

  // 생성자
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 메서드
  public void introduce() {
    System.out.println("Hi, my name is " + name + " and I'm " + age + " years old.");
  }
}

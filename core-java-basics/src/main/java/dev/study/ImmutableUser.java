package dev.study;

/**
 * 불변 객체의 중요성
 * 불변 객체란?
 * 생성 후 상태(필드 값)를 변경할 수 없는 객체
 * 모든 필드가 final 로 선언이 되고, 변경 메서드가 존재하지 않음
 *
 * 불변 객체의 장점
 * 1. 데이터 안정성 -> 외부에서 객체 상태를 변경할 수 없으므로 예기치않은 동작 방지
 * 2. 쓰레드 안정성 -> 상태 변경이 없으므로 동시성 문제에서 자유로움
 * 3. 성능 -> 복사가 필요 없거나 최소화 되어 효율적이다.
 *
 * 불변 객체를 만드는 방법
 * 1. 클래스에 final 키워드 추가
 * 2. 모든 필드를 private final 로 선언
 * 3. 필드 값은 생성자를 통해 초기화
 * 4. 변경 메서드(setter) 제공하지 않는다
 * 5. 객체 자체를 반환하는 메서드 제공 시, 새로운 객체를 생성한다.
 */
public final class ImmutableUser {
  private final String name;
  private final int age;

  public ImmutableUser(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

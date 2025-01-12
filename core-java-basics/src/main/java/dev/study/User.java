package dev.study;

/**
 * 레코드란?
 * java 14버전 이후부터 도입된 간결한 데이터 클래스
 * 불변 객체를 간단히 선언 가능
 * 필드, 생성자, equals, hashCode, toString 자동생성
 *
 * 특징
 * 모든 필드는 자동으로 final
 * 변경 불가능(Immutable)
 * 컴파일 시 자동으로 필요한 메서드 생성
 * @param name
 * @param age
 */
public record User(String name, int age) {

}

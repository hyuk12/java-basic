package dev.study.옵저버.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 기본 옵저버 패턴 구현
 * - 뉴스 에이전시(subject)가 구독자 (Observer)들에게 새 뉴스를 알리는 시스템
 */

// Observer 인터페이스
interface Observer {
  void update(String message);
}

// Subject 클래스
class NewsAgency {
  private final List<Observer> observers = new ArrayList<>();

  // 옵저버 등록
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  // 옵저버 제거
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  // 상태 변경 알림
  public void notifyObservers(String message) {
    for (Observer observer : observers) {
      observer.update(message);
    }
  }
}

// Concrete Observer
class NewsSubscriber implements Observer {
  private final String name;

  public NewsSubscriber(String name) {
    this.name = name;
  }

  @Override
  public void update(String message) {
    System.out.println(name + " received news: " + message);
  }
}

// 사용 예제
public class Main {
  public static void main(String[] args) {
    NewsAgency agency = new NewsAgency();

    Observer alice = new NewsSubscriber("Alice");
    Observer bob = new NewsSubscriber("Bob");

    agency.addObserver(alice);
    agency.addObserver(bob);

    agency.notifyObservers("Breaking News: Java 20 Released!");

    agency.removeObserver(alice);

    agency.notifyObservers("Update: Java 20 Tutorials Available!");
  }
}

package dev.study.옵저버.과제.hint;

/**
 * 주식 가격 알림 시스템 설계
 *
 * 주체(Subject): StockMarket
 *
 * 필드: String stockName, double stockPrice
 *
 * 메서드: setStockData(String name, double price)
 *
 * 옵저버(Observer): Investor
 *
 * 관심 있는 주식 이름과 가격 변동 알림을 수신.
 */
interface StockObserver {
  void update(String stockName, double stockPrice);
}

class StockMarket {
  // 구현 내용 추가
}

class Investor implements StockObserver {

  @Override
  public void update(String stockName, double stockPrice) {

  }
  // 구현 내용 추가
}

/**
 * Alice notified: AAPL is now $145.5
 * Bob notified: AAPL is now $145.5
 * Alice notified: GOOG is now $2725.6
 * Bob notified: GOOG is now $2725.6
 */
public class Main {

}

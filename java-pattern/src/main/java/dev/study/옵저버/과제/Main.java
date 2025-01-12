package dev.study.옵저버.과제;

import java.util.ArrayList;
import java.util.List;

interface StockObserver {
  void update(String stockName, double stockPrice);
}

class StockMarket {
  private final List<StockObserver> observers = new ArrayList<>();
  private String stockName;
  private double stockPrice;

  public void addObserver(StockObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(StockObserver observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (StockObserver observer : observers) {
      observer.update(stockName, stockPrice);
    }
  }

  public void setStockData(String stockName, double stockPrice) {
    this.stockName = stockName;
    this.stockPrice = stockPrice;
    notifyObservers();
  }
}

class Investor implements StockObserver {
  private final String name;

  public Investor(String name) {
    this.name = name;
  }

  @Override
  public void update(String stockName, double stockPrice) {
    System.out.println(name + " notified: " + stockName + " is now $" + stockPrice);
  }
}

public class Main {
  public static void main(String[] args) {
    StockMarket market = new StockMarket();

    StockObserver investor1 = new Investor("Alice");
    StockObserver investor2 = new Investor("Bob");

    market.addObserver(investor1);
    market.addObserver(investor2);

    market.setStockData("AAPL", 145.50);
    market.setStockData("GOOG", 2725.60);
  }
}
package dev.study.옵저버.basic2;

import java.util.ArrayList;
import java.util.List;

/**
 * 날씨 정보 알림
 * - 날씨 데이터를 관리하는 WeatherStation(Subject)이 구독자(Observer)들에게 날씨정보를 알림
 */
// Observer 인터페이스
interface WeatherObserver {
  void update(float temperature, float humidity);
}

// Subject 클래스
class WeatherStation {
  private final List<WeatherObserver> observers = new ArrayList<>();
  private float temperature;
  private float humidity;

  // 옵저버 등록
  public void addObserver(WeatherObserver observer) {
    observers.add(observer);
  }

  // 옵저버 제거
  public void removeObserver(WeatherObserver observer) {
    observers.remove(observer);
  }

  // 상태 변경 알림
  public void notifyObservers() {
    for (WeatherObserver observer : observers) {
      observer.update(temperature, humidity);
    }
  }

  // 상태 변경 메서드
  public void setWeatherData(float temperature, float humidity) {
    this.temperature = temperature;
    this.humidity = humidity;
    notifyObservers();
  }
}

// Concrete Observer
class MobileDevice implements WeatherObserver {
  private final String name;

  public MobileDevice(String name) {
    this.name = name;
  }

  @Override
  public void update(float temperature, float humidity) {
    System.out.println(name + " received weather update: Temp = " + temperature + ", Humidity = " + humidity);
  }
}

// 사용 예제
public class Main {
  public static void main(String[] args) {
    WeatherStation station = new WeatherStation();

    WeatherObserver device1 = new MobileDevice("Device1");
    WeatherObserver device2 = new MobileDevice("Device2");

    station.addObserver(device1);
    station.addObserver(device2);

    station.setWeatherData(25.5f, 60.0f);
    station.setWeatherData(28.0f, 65.0f);
  }
}

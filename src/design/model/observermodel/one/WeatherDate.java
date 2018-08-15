package design.model.observermodel.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/7/25.
 */
public class WeatherDate implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if( i != -1){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0;i<observers.size();i++){
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged(){
            notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}

package design.model.observermodel.two;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wei.peng on 2018/7/25.
 */
public class WeatherDateTwo extends Observable{
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDateTwo() {
    }
   /* public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }*/
    public void measurementsChanged(Observer observer){
        setChanged();
        notifyObservers(observer);
    }
    public void setMeasurements(float temperature, float humidity, float pressure,Observer observer){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(observer);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

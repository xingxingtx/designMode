package design.model.observermodel.two;

import com.design.model.observermodel.one.DisplayElement;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2018/7/25.
 */
public class CurrentConditionsDisplayTwo implements Observer,DisplayElement{
    public Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplayTwo(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDateTwo){
            WeatherDateTwo weatherDate = (WeatherDateTwo)o;
            this.temperature = weatherDate.getTemperature();
            this.humidity = weatherDate.getHumidity();
            this.pressure = weatherDate.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplayTwo************************");
        Date date = new Date();
        System.out.println(date);
        System.out.println("温度:" + temperature +"\n" +"湿度:" + humidity +"\n" + "压力:" + pressure);
    }
}

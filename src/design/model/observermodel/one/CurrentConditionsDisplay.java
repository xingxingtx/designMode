package design.model.observermodel.one;

import java.util.Date;

/**
 * Created by Administrator on 2018/7/25.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherDate;

    public CurrentConditionsDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplayTwo************************");
        Date date = new Date();
        System.out.println(date);
        System.out.println("温度:" + temperature +"\n" +"湿度:" + humidity +"\n" + "压力:" + pressure);
    }
}

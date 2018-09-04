package design.model.observermodel.two;

/**
 * Created by wei.peng on 2018/7/25.
 */
public class WeatherStationTwo {

    public static void main(String[] args){
        WeatherDateTwo weatherDate = new WeatherDateTwo();
        CurrentConditionsDisplayTwo display = new CurrentConditionsDisplayTwo(weatherDate);
        weatherDate.setMeasurements(35,30,33.9f,display);
        weatherDate.setMeasurements(40,20,38.5f,display);
        weatherDate.setMeasurements(30,26,40.1f,display);
    }
}

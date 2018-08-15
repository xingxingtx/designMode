package design.model.observermodel.one;

/**
 * Created by Administrator on 2018/7/25.
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherDate weatherDate = new WeatherDate();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherDate);
        weatherDate.setMeasurements(35,30,33.9f);
        weatherDate.setMeasurements(40,20,38.5f);
        weatherDate.setMeasurements(30,26,40.1f);
    }
}

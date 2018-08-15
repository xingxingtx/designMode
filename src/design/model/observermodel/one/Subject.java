package design.model.observermodel.one;

/**
 * Created by Administrator on 2018/7/25.
 */
public interface Subject {

    public void  registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}


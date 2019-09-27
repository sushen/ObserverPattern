package blog.biswas.video.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public int value;
    public List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyValue();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    private void notifyValue(){
        for (Observer observer:observers){
            observer.update();
        }
    }
}

package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer obs){
        observerList.add(obs);
    }

    public void removeObserver(Observer obs){
        observerList.remove(obs);
    }

    public int countObservers(){
        return observerList.size();
    }

    public void notifyObservers(Object[] args){
        observerList.stream().forEach(it-> it.notifyObserver(args));
    }
}

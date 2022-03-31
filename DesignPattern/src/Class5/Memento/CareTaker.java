package Class5.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementoList  = new ArrayList<Memento>();
    public void addMemento (Memento m){
        mementoList.add(m);
    }
    public void getMemento(){
        int index = mementoList.size()-1;
        System.out.println(mementoList.get(index));
    }
}

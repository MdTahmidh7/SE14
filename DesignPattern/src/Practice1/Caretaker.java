package Practice1;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    public List<Memento> listOfMemento = new ArrayList<Memento>();
    public void add(Memento memento){
        listOfMemento.add(memento);
    }
    public Memento get(int index){
        return listOfMemento.get(index);
    }
}

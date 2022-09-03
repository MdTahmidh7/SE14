package FirstCT.Memento;

import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> history;
    private int currentState = -1;

    public Caretaker() {
        this.history = new ArrayList<Memento>();
    }
    public void add(Memento memento){
        history.add(memento);
        currentState = history.size()-1;
    }
    public Memento getMemento(int index){
        return history.get(index);
    }
    public Memento undo(){
        System.out.println("Undoing ...");
        if (currentState <=0){
            currentState =0;
            return getMemento(currentState);
        }
        currentState --;
        return getMemento(currentState);
    }
    public Memento redo(){
        System.out.println("Redoing ...");
        if (currentState >= history.size()-1){
            currentState =history.size()-1;
            return getMemento(currentState);
        }
        currentState ++;
        return getMemento(currentState);
    }
}

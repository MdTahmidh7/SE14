package FirstCT.Memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setArticle("State 1");
        caretaker.add(originator.save());
        printState(originator);
        originator.setArticle("State 2");
        caretaker.add(originator.save());
        printState(originator);
        originator.reStore(caretaker.undo());
        originator.reStore(caretaker.redo());
        printState(originator);


    }
    public static void printState(Originator originator){
        System.out.println("Current State is = "+ originator.getArticle());
    }
}

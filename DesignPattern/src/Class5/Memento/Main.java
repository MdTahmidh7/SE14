package Class5.Memento;

public class Main {
    public static void main(String[] args) {
        Editor e = new Editor();
        e.setText("Mmmm");
        CareTaker c  = new CareTaker();
        c.addMemento(new Memento(e));
        e.setText("NNNN");
        c.addMemento(new Memento(e));
        e.SetColor("White");
        c.addMemento(new Memento(e));

        System.out.println(e);

    }
}

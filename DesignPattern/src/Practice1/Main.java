package Practice1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main Function ");
        Editor editor = new Editor();
        editor.write("hello");
        editor.write("Tahmid");
        editor.write("Hi");
        editor.undo();

       String t = editor.getMainText();
        System.out.println(t);

    }
}


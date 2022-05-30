package Practice1;
import java.util.Deque;
import java.util.LinkedList;


public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.add(textArea.takeSnapShot());
    }
    public String getMainText(){
       return textArea.getText();
    }
    public void undo(){
        textArea.reStore(stateHistory.pop());
    }
}

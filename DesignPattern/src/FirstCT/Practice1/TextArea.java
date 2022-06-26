package FirstCT.Practice1;

public class TextArea {
    private String text;
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public Memento takeSnapShot(){
        return new Memento(this.text);
    }
    public void reStore(Memento memento){
        this.text = memento.getSavedText();
    }

    public static class Memento{
    private final String text;
        private Memento(String textToSave) {
            this.text = textToSave;
        }
        private String getSavedText(){
            return text;
        }

    }
}

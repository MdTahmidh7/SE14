package FirstCT.Class5.Memento;

public class Memento {

    private  Editor editor;
    public Memento (Editor e){
        this.editor = e;
    }

    public String getState (){
        return this.editor.getState();
    }


}

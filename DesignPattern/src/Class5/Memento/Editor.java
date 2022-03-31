package Class5.Memento;
// This is an Originator
public class Editor implements Cloneable{
    private String text ;
    private String color = "Black";

    public void setText (String text){
        this.text = this.text + text;
    }

    public String getState (){
        return "Text : "+this.text+" Color = "+this.color;
    }

    public  void SetColor(String c){
        this.color = color;
    }
    public void save(){

    }
    /*public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }*/
    public Editor clone(){
        Editor e = new Editor();
        e.SetColor(this.color);
        e.setText((this.text));
        return  e;
    }
}

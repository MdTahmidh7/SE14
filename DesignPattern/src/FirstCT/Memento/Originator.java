package FirstCT.Memento;

public class Originator {
    private String article;

    public void setArticle(String article) {
        this.article = article;
    }
    public String getArticle() {
        return article;
    }
    public Memento save(){
        return new Memento(this.article);
    }
    public void reStore(Memento memento){
        this.article = memento.getState();
    }
}

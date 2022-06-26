package FirstCT.ObserverPattern.Practice2;

public class Follower implements IFollower{
    Blogger blogger;
    public String name;
    public Follower(String name){
        this.name = name;
    }
    @Override
    public void update(String title) {
        System.out.println(name+ " New blog uploaded form "+blogger.bloggerName+": "+title);
    }
    public void bloggerName(Blogger blogger){
        this.blogger = blogger;
    }
}

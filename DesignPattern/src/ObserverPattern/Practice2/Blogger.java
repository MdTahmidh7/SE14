package ObserverPattern.Practice2;

import java.util.ArrayList;
import java.util.List;

public class Blogger implements IBlogger{
    public String title;
    public String bloggerName;
    public Blogger (String bloggerName){
        this.bloggerName = bloggerName;
    }
    private List<Follower> followerList = new ArrayList<>();
    @Override
    public void follow(Follower follower) {
        followerList.add(follower);

    }

    @Override
    public void unFollow(Follower follower) {
    followerList.remove(follower);
    }

    @Override
    public void Notify() {
        for (Follower f : followerList) {
            f.update(title);
        }
    }
    public void upload(String newBlog){
        this.title = newBlog;
        Notify();
    }
}

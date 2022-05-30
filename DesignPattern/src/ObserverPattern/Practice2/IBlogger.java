package ObserverPattern.Practice2;

public interface IBlogger {
    void follow(Follower follower);
    void unFollow(Follower follower);
    void Notify();
}

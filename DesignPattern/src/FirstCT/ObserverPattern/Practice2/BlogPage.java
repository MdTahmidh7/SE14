package FirstCT.ObserverPattern.Practice2;

public class BlogPage {
    public static void main(String[] args) {
        Blogger Sakib = new Blogger("Sakib");
        Blogger Rakib = new Blogger("Rakib");


        Follower f1 = new Follower("Saju");
        Follower f2 = new Follower("Raju");
        Follower f3 = new Follower("Bob");

        Sakib.follow(f1);
        Sakib.follow(f3);
        f1.bloggerName(Sakib);
        f3.bloggerName(Sakib);

        Sakib.upload("This is my 1st blog");
        Sakib.unFollow(f1);
        Sakib.follow(f2);
        f2.bloggerName(Sakib);
        Sakib.upload("A Bitter Story");

        System.out.println("------------");
        Rakib.follow(f1);
        f1.bloggerName(Rakib);
        Rakib.upload("This is not a Joke");






    }
}

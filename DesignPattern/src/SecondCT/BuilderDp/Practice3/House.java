package SecondCT.BuilderDp.Practice3;

public class House {
    String roof;
    String basement;
    String wall;

    public House(String roof, String basement, String wall) {
        this.roof = roof;
        this.basement = basement;
        this.wall = wall;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", basement='" + basement + '\'' +
                ", wall='" + wall + '\'' +
                '}';
    }
}

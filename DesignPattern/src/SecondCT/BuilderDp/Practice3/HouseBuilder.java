package SecondCT.BuilderDp.Practice3;

public class HouseBuilder implements Builder{
    String roof;
    String basement;
    String wall;
    @Override
    public HouseBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    @Override
    public HouseBuilder setBasement(String basement) {
    this.basement = basement;
    return this;
    }

    @Override
    public HouseBuilder setWall(String wall) {
    this.wall = wall;
    return this;
    }
    public House getHouse(){
        return new House(roof, basement, wall);
    }
}

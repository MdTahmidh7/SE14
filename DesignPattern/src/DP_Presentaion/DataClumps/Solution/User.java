package DataClumps.Solution;

public class User {

    private String hobby;
    private Address address = new Address();
    private  Name name = new Name();

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }



    public String getInformation(){
        return name.getInformation()+" Hobby = "+hobby+address.getInformation();
    }
}

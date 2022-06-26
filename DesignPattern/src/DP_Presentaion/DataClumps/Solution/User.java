package DP_Presentaion.DataClumps.Solution;

public class User {
    private String hobby;
    private Address address = new Address();
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getInformation(){
        return " Hobby = "+hobby+address.getInformation();
    }
}

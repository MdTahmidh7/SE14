package DataClumps.Problem;

public class User {
    private String firstName;
    private String lastName;
    private String hobby;
    private String houseNo;
    private String roadNo;
    private String block;
    private String areaName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getInformation(){
        return "First Name = "+firstName+" Last Name = "+lastName+" Hobby = "+hobby+
                " House no. = "+houseNo+" Road no. = "+roadNo+" Block = "+block+" Area = "+areaName;
    }
}

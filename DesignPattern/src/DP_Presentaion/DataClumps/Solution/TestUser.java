package DataClumps.Solution;

public class TestUser {
    public static void main(String[] args) {
        User user = new User();
        Address address = new Address();
        Name name = new Name();
        user.setName(name);
        name.setFirstName("Md.");
        name.setLastName("Saju");
        user.setHobby("Playing cricket");
        address.setHouseNo("07");
        address.setRoadNo("02");
        address.setBlock("F");
        address.setAreaName("Mirpur");

        System.out.println(user.getInformation());

    }
}

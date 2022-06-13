package DataClumps.Problem;

public class TestUser {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Md.");
        user.setLastName("Saju");
        user.setHobby("Playing cricket");
        user.setHouseNo("07");
        user.setRoadNo("02");
        user.setBlock("F");
        user.setAreaName("Mirpur");

        System.out.println(user.getInformation());

    }
}

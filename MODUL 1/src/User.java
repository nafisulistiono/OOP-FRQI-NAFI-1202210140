public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name;
    int phoneNumber;
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void register() {
        System.out.println("Berhasil!");

    }
}

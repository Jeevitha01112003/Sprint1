public class Admin extends User {

    public Admin() {

    }

    public Admin(String userId, String password, String name) {
        super(userId, password, name, "ADMIN");
    }

}
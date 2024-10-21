import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        m();
    }

    public static void m(){
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler
                .setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService service = new AuthService(handler);

        service.login("user_username", "admin_password");
    }
}
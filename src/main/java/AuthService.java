public class AuthService {
    private Handler handler;

    public AuthService(Handler handler){
        this.handler = handler;
    }

    public boolean login(String username, String password){
        if(handler.handle(username,password)){
            System.out.println("Authorization Succesful");
            return true;
        }
        return false;
    }
}

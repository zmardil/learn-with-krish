import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
       Database database = new Database();
       Handler handler =  new UserExistsHandler(database);
       handler.setNextHandler(new ValidPasswordHandler(database)).setNextHandler(new RoleCheckHandler());
       AuthService service = new AuthService(handler);
       service.LogIn("user_username", "user_password");
    }
    
}

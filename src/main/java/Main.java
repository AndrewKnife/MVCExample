import controller.UserController;
import model.User;
import view.Console;

public class Main {

    private static String FILE_USERS = "./src/files/text.txt";

    public static void main(String[] args) {
        //Model
        //View
        //Controller
        User user = new User("Ponas", "Jonas", "jo", 19);
        Console view = new Console();
        UserController controller = new UserController(user, view);
        //Atspauzdinti vartotojo amziu
        controller.Print();
        controller.Write(FILE_USERS);
    }
}
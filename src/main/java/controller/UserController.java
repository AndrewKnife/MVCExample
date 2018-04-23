package controller;

import model.User;
import view.Console;

public class UserController {
    private User vartotojas;
    private Console view;

    public UserController(User vartotojas, Console view) {
        this.vartotojas = vartotojas;
        this.view = view;
    }

    public void Print(){
        view.printUser(vartotojas);
    }

    public void Write(String file){
        vartotojas.writeToFile(file);
    }
}

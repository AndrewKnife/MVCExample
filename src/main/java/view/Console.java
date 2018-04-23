package view;

import model.User;

import java.util.List;
import java.util.Scanner;

public class Console {
    private Scanner scan;

    public Console() {
        this.scan = new Scanner(System.in);
    }

    public void printUser(User user){
        System.out.println(user.getName());
        System.out.println(user.getLastname());
        System.out.println(user.getJo());
        System.out.println(user.getAmzius());
    }

    public void printAdults(List<User> users){
        for(User user : users){
            if(user.isAdult()){
                System.out.println(user.getName()+" Suaugęs");
            }
        }
    }
}

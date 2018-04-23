package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class User {
    private String name;
    private String lastname;
    private String jo;
    private int amzius;

    public User(String name, String lastname, String jo, int amzius) {
        this.name = name;
        this.lastname = lastname;
        this.jo = jo;
        this.amzius = amzius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJo() {
        return jo;
    }

    public void setJo(String jo) {
        this.jo = jo;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public boolean isAdult() {
        boolean adult;
        if (this.amzius >= 18) {
            adult = true;
        } else {
            adult = false;
        }
        return adult;
    }

    public void writeToFile(String filename){
        try{
            BufferedWriter write = new BufferedWriter(new FileWriter(filename));
            write.write(toString());
            write.flush();
            write.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }

    public String toString(){
        String eilute;
        eilute = name + " " + lastname + " " + jo + " " + amzius;
        return eilute;
    }
}

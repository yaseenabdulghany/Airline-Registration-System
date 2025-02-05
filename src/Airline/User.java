package Airline;

import java.util.Date;

public class User {
    public int user_id;
    public int user_role_id;
    public String user_name;
    public String user_email;
    public Date user_dob ;
    public String user_address;

    public User(int user_id,  int user_role_id, String user_name, String user_email, Date user_dob, String user_address) {
        this.user_id = user_id;
        this.user_role_id = user_role_id;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_dob = user_dob;
        this.user_address = user_address;
    }

    public void addUser(){
        System.out.println("User added: " + user_name);
    }
    public void editUser() {
        System.out.println("User edited: " + user_name);
    }
    public void deleteUser() {
        System.out.println("User deleted: " + user_name);
    }
    public void searchUser() {
        System.out.println("searching for User: " + user_name);
    }
}
package Airline;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger(1, "John Doe", "john.doe@example.com", "123456789", "password123", "johndoe", "123 Main St");
        passenger1.addPassenger();
        passenger1.editPassenger();
        passenger1.deletePassenger();
        passenger1.searchPassenger();

        Date dob = new Date(1998 - 1900, 5 - 1, 25);
        User user1 = new User(1, 2, "Alice Smith", "alice.smith@example.com", dob, "456 Oak St");
        user1.addUser();
        user1.editUser();
        user1.deleteUser();
        user1.searchUser();
    }
}

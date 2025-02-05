package Airline;

public class Passenger {
    public int passenger_id;
    public String passenger_name;
    public String passenger_email;
    public String passenger_mobile;
    public String passenger_password;
    public String passenger_username;
    public String passenger_address;

    public Passenger(int passenger_id, String passenger_name, String passenger_email, String passenger_mobile, String passenger_password, String passenger_username, String passenger_address) {
        this.passenger_id = passenger_id;
        this.passenger_name = passenger_name;
        this.passenger_email = passenger_email;
        this.passenger_mobile = passenger_mobile;
        this.passenger_password = passenger_password;
        this.passenger_username = passenger_username;
        this.passenger_address = passenger_address;
    }

    public void addPassenger(){
        System.out.println("Passenger added: " + passenger_name);
    }
    public void editPassenger() {
        System.out.println("Passenger edited: " + passenger_name);
    }
    public void deletePassenger() {
        System.out.println("Passenger deleted: " + passenger_name);

    }
    public void searchPassenger() {
        System.out.println("searching for passenger: " + passenger_name);

    }

}

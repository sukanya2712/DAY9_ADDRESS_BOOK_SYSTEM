package com.addresssystem;



import java.util.Scanner;

public class AddressBook {
    private String firstname,lastname,address,state,city,email;
    private int zip;
    private long phonenumber;
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }


    public static void Details(){
        AddressBook a = new AddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First name:-");
        a.firstname=sc.next();
        a.setFirstname(a.firstname);

        System.out.println("Enter Your last name:-");
        a.lastname=sc.next();
        a.setLastname(a.lastname);

        System.out.println("Enter your Phone Number:-");
        a.phonenumber=sc.nextLong();
        a.setPhonenumber(a.phonenumber);

        System.out.println("Enter your address:- ");
        a.address=sc.next();
        a.setAddress(a.address);

        System.out.println("Enter your State:-");
        a.state=sc.next();
        a.setState(a.state);

        System.out.println("Enter Your city:-");
        a.city=sc.next();
        a.setCity(a.city);

        System.out.println("Enter zip code:- ");
        a.zip=sc.nextInt();
        a.setZip(a.zip);

        System.out.println("Enter your email:- ");
        a.email=sc.next();
        a.setEmail(a.email);

        System.out.println("First Name: " +a.getFirstname());
        System.out.println("Last Name : " +a.getLastname());
        System.out.println("Phonenumber : " +a.getPhonenumber());
        System.out.println("Address : " +a.getAddress());
        System.out.println("City : " +a.getCity());
        System.out.println("State Name : " +a.getState());
        System.out.println("Zip Code : " +a.getZip());
        System.out.println("Email Id : " +a.getEmail());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");
        System.out.println("Enter Contact details of the person");
        Details();
        System.out.println("Do you want to add more contacts ?? \t 1)Yes (Y) \t2) No (N)");
        String input=sc.next();
        String yes = "Y";
        if (input.equals(yes)) {
            Details();
        } else {
            System.exit(0);
        }
    }
}

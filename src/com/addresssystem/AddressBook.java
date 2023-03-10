package com.addresssystem;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> cD =new ArrayList<>();
    Scanner sc =new Scanner(System.in);
    public void addDetails(){
        Contacts D=new Contacts();
        System.out.println("Sukanya ");
        D.setFirstname(D.getFirstname());

        System.out.println("NAIK ");
        D.setLastname(D.getLastname());
        System.out.println("5677888");
        D.setMobilenumber(D.getMobilenumber());
        System.out.println("DFGF");
        D.setAddress(D.getAddress());
        System.out.println("MUMBAI");
        D.setCity(D.getCity());
        System.out.println("MAHARASHTRA");
        D.setState(D.getState());
        System.out.println("456789");
        D.setZip(D.getZip());
        System.out.println("xyz@gmail.com");
        D.setEmail(D.getEmail());
        cD.add(D);
    }
    public void dispalyContacts(){
        System.out.println(cD);
    }


    public static void main(String[] args) {
        System.out.println(" Welcome to the Address Based System");
        AddressBook person1=new AddressBook();
        person1.addDetails();
        person1.dispalyContacts();
    }

}

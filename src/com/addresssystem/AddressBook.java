package com.addresssystem;



import java.util.Scanner;

public class AddressBook {
    private String firstname,lastname,address,state,city,email;
    private int zip;
    private long phonenumber;
    static int count=0;

    static long[] StorePhoneNumber = new long[20];
    static int[] StoreZip = new int[20];
    static String[] StoreFirstName = new String[20];
    static String[] StoreLastName = new String[20];
    static String[] StoreAddress = new String[20];
    static String[] StoreState = new String[20];
    static String[] StoreCity = new String[20];
    static String[] StoreEmail = new String[20];



    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        StoreFirstName[count]=this.firstname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        StoreLastName[count]=this.lastname;
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        StoreAddress[count]=this.address;
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        StoreState[count]=this.state;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        StoreCity[count]=this.city;
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        StoreEmail[count]=this.email;
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        StoreZip[count]=this.zip;
        this.zip = zip;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        StorePhoneNumber[0]=this.phonenumber;
        this.phonenumber = phonenumber;
    }
    public static void Details(){
        count++;
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

        ask();
    }

    public static void ask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to do anything else ???");
        //   char continueEdit = sc.next().charAt(0);
        char a = sc.next().charAt(0);
        if(a=='y')
        {
            start();
        }
        else {
            System.exit(0);
        }
    }
    public static void displaydata(){
        ////// enter 1 for the 1st person as a sr
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter sr the number of the contact");
        int sr = sc.nextInt();
        System.out.println("first name is "+StoreFirstName[sr]);
        System.out.println("laste name is"+ StoreLastName[sr]);
        System.out.println("Phone number is "+StorePhoneNumber[sr]);
        System.out.println("Address is"+StoreAddress[sr]);
        System.out.println("State is"+StoreState[sr]);
        System.out.println("city is "+StoreCity[sr]);
        System.out.println("Zip code is "+StoreZip[sr]);
        System.out.println("Email is "+StoreEmail[sr]);
        ask();
    }
    public static void Delete(){
        ////// enter 1 for the 1st person as a sr
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter sr the number of the contact which you want to delete");
        int sr = sc.nextInt();
        StoreFirstName[sr]=" ";
        StoreLastName[sr]=" ";
        StorePhoneNumber[sr]=0;
        StoreAddress[sr]=" ";
        StoreState[sr]=" ";
        StoreCity[sr]=" ";
        StoreZip[sr]=0;
        StoreEmail[sr]=" ";
        System.out.println("Contatc deleted!!!!!");
        ask();
    }
    public static void edit(){
        // enter 1 to edit 1st person as a sr no enter 2 to edit 2nd person
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sr no of the person");
        int serial= sc.nextInt();
        System.out.println("what you want to update");
        System.out.println("1)name \n 2)lastname \n 3)phonenumber \n 4)address \n 5)state \n 6)city \n 7)zipcode \n 8)Email");
        int update = sc.nextInt();
        if(update==1)
        {
            System.out.println("Enter updated name");
            String UpdatedName=sc.next();
            StoreFirstName[serial]=UpdatedName;
            System.out.println("data updated!!!!!");
        }
        else if(update==2)
        {
            System.out.println("Enter updated lastname");
            String UpdatedLastName=sc.next();
            StoreLastName[serial]=UpdatedLastName;
            System.out.println("data updated!!!!!");
        } else if (update==3) {
            System.out.println("Enter updated phonenumber");
            long UpdatedPhonenumber=sc.nextLong();
            StorePhoneNumber[serial]=UpdatedPhonenumber;
            System.out.println("data updated!!!!!");
        } else if (update==4) {
            System.out.println("Enter updated Address");
            String UpdatedAddress=sc.next();
            StoreAddress[serial]=UpdatedAddress;
            System.out.println("data updated!!!!!");
        } else if (update==5) {
            System.out.println("Enter updated State");
            String Updatedstate=sc.next();
            StoreState[serial]=Updatedstate;
            System.out.println("data updated!!!!!");
        } else if (update==6) {
            System.out.println("Enter updated city");
            String Updatedcity=sc.next();
            StoreCity[serial]=Updatedcity;
            System.out.println("data updated!!!!!");
        } else if (update==7) {
            System.out.println("Enter updated ZipCode");
            int UpdatedZipCode=sc.nextInt();
            StoreZip[serial]=UpdatedZipCode;
            System.out.println("data updated!!!!!");
        } else if (update==8) {
            System.out.println("Enter updated lastname");
            String UpdatedEmail=sc.next();
            StoreEmail[serial]=UpdatedEmail;
            System.out.println("data updated!!!!!");
        }
        ask();
    }
    public static void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("which operation you want to perform \n 1) Create new contact \n 2) display details \n 3)Edit any contact \n 4)Delete any contact \n 5)Exit");
        int takeip=sc.nextInt();
        if(takeip==1)
        {
            Details();
        } else if (takeip==2) {
            displaydata();
        }
        else if(takeip==3){
            edit();
        } else if (takeip==4) {
            Delete();
        } else {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        start();
    }
}

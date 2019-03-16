package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Customers{
    private int id;
    private String name;
    private String email;
    private String address;
    private String birthday;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customers(int id, String name, String email, String address, String birthday, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
        this.phone = phone;
    }

    public ArrayList add_customers(ArrayList c){

        System.out.print("Please enter to add NAME of the customer:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().toUpperCase();
        System.out.print("EMAIL: ");
        String email = scanner.nextLine();

        System.out.print("ADDRESS: ");
        String address = scanner.nextLine().toLowerCase();
        System.out.print("BIRTHDAY: ");
        String birthday = scanner.nextLine();
        System.out.print("PHONE: ");
        String phone = scanner.nextLine();
        Customers s = new Customers();
        s.setName(name);
        s.setEmail(email);
        s.setAddress(address);
        s.setBirthday(birthday);
        s.setPhone(phone);
        c.add(s);
        return c;


    }

    public ArrayList edit_customers(ArrayList c) {
        System.out.print("Enter ID of customer to edit: ");
        Scanner scanner = new Scanner(System.in);
        int idtoedit = scanner.nextInt() - 1;
        scanner.nextLine();
        Customers c1 = (Customers) c.get(idtoedit);

        System.out.print("Please enter to add NAME of the customer:");

        String name = scanner.nextLine().toUpperCase();
        System.out.print("EMAIL: ");
        String email = scanner.nextLine();

        System.out.print("ADDRESS: ");
        String address = scanner.nextLine().toLowerCase();
        System.out.print("BIRTHDAY: ");
        String birthday = scanner.nextLine();
        System.out.print("PHONE: ");
        String phone = scanner.nextLine();

        c1.setName(name);
        c1.setEmail(email);
        c1.setAddress(address);
        c1.setBirthday(birthday);
        c1.setPhone(phone);


        return c;
    }
    public void view_customers(ArrayList c) {
        int id = 0;
        System.out.println("List of customers: ");
        Iterator cus=c.iterator();
        while(cus.hasNext()) {
            Object obj=cus.next();
            if(obj instanceof Customers) {
                id++;
                Customers st=(Customers) obj;
                System.out.print ("ID: "+ id + " ");
                System.out.print ("Name: "+ st.getName() + " ");
                System.out.print ("Email: "+ st.getEmail()+ " ");
                System.out.print ("Address: "+ st.getAddress()+ " ");
                System.out.print ("Birthday: "+ st.getBirthday()+ " ");
                System.out.println ("Phone: "+ st.getPhone());


            }
        }
    }
    public ArrayList delete_customers(ArrayList c){
        System.out.print("Enter ID of customer to delete: ");
        Scanner scanner = new Scanner(System.in);
        int idtodelete = scanner.nextInt() - 1;
        scanner.nextLine();
        c.remove(idtodelete);
        return c;

    }
    public Customers() {
        super();
    }
}


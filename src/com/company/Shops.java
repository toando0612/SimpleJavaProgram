package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Shops {
//    code, address, owner, phone, email, account balance
    private String code;
    private String address;
    private String owner;
    private String phone;
    private String email;
    private String account_balance;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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

    public String getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(String account_balance) {
        this.account_balance = account_balance;
    }

    public Shops(String code, String address, String owner, String phone, String email, String account_balance) {
        this.code = code;
        this.address = address;
        this.owner = owner;
        this.phone = phone;
        this.email = email;
        this.account_balance = account_balance;
    }
    public ArrayList add_shops(ArrayList c){
        System.out.print("Please enter to add CODE of the shop:");
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine().toUpperCase();
        System.out.print("ADDRESS: ");
        String address = scanner.nextLine().toLowerCase();
        System.out.print("OWNER: ");
        String owner = scanner.nextLine().toUpperCase();
        System.out.print("PHONE: ");
        String phone = scanner.nextLine();
        System.out.print("EMAIL: ");
        String email = scanner.nextLine();
        System.out.print("ACCOUNT BALANCE: ");
        String account_balance = scanner.nextLine();

        Shops s = new Shops();
        s.setCode(code);
        s.setAddress(address);
        s.setOwner(owner);
        s.setPhone(phone);
        s.setEmail(email);
        s.setAccount_balance(account_balance);
        c.add(s);
        return c;

    }

    public ArrayList edit_shops(ArrayList c){
        System.out.print("Enter ID of shop to edit: ");
        Scanner scanner = new Scanner(System.in);
        int idtoedit = scanner.nextInt() - 1;
        scanner.nextLine();
        Shops s1 = (Shops) c.get(idtoedit);

        System.out.print("Please enter to add CODE of the shops:");
        code = scanner.nextLine().toUpperCase();

        System.out.print("ADDRESS: ");
        address = scanner.nextLine();

        System.out.print("OWNER: ");
        owner = scanner.nextLine().toUpperCase();

        System.out.print("PHONE: ");
        phone = scanner.nextLine();

        System.out.print("EMAIL: ");
        email = scanner.nextLine().toLowerCase();

        System.out.print("ACCOUNT BALANCE: ");
        account_balance = scanner.nextLine();

        s1.setCode(code);
        s1.setAddress(address);
        s1.setOwner(owner);
        s1.setPhone(phone);
        s1.setEmail(email);
        s1.setAccount_balance(account_balance);


        return c;
    }

    public void view_shops(ArrayList c){
        int id = 0;
        System.out.println("List of Shops: ");
        Iterator sh =c.iterator();
        while(sh.hasNext()) {
            Object obj=sh.next();
            if(obj instanceof Shops) {
                id++;
                Shops st=(Shops) obj;
                System.out.print ("ID: "+ id + " ");
                System.out.print ("Code: "+ st.getCode() + " ");
                System.out.print ("Address: "+ st.getAddress() + " ");
                System.out.print ("Owner: "+ st.getOwner()+ " ");
                System.out.print ("Phone: "+ st.getPhone()+ " ");
                System.out.print ("Email: "+ st.getEmail()+ " ");
                System.out.println ("Account Balance: "+ st.getAccount_balance());


            }
        }
    }

    public ArrayList delete_shops(ArrayList c){
        System.out.print("Enter ID of Shop to delete: ");
        Scanner scanner = new Scanner(System.in);
        int idtodelete = scanner.nextInt() - 1;
        scanner.nextLine();
        c.remove(idtodelete);
        return c;
    }

    public Shops(){
        super();
    }
}


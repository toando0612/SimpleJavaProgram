package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void choice1(){
        ArrayList<Customers> customers = new ArrayList();
        while (true){
            Customers cus = new Customers();
            String[] array = {"1-Add_customers", "2-Edit_customers", "3-View_customers", "4-Delete_customers", "5-Back"};
            System.out.println();
            for (String anArray : array) {
                System.out.println(anArray);
            }

            System.out.print("Please enter your option:");
            Scanner scanner = new Scanner(System.in);
            int cus_choice = scanner.nextInt();

            if (cus_choice == 1) {
                customers = cus.add_customers(customers);
            }

            else if (cus_choice == 2) {
                cus.view_customers(customers);
                customers = cus.edit_customers(customers);
            }

            else if (cus_choice == 3) {
                cus.view_customers(customers);
            }

            else if (cus_choice == 4) {
                cus.view_customers(customers);
                customers = cus.delete_customers(customers);
            }

            else if (cus_choice ==5){
                break;
            }

            else{
                System.out.println("Option Undefine");
                break;
            }

        }
    }
    public static void choice2(){

        ArrayList<Shops> shops = new ArrayList<>();
        while(true){
            Shops sh = new Shops();
            String[] array = {"1-Add_shops", "2-Edit_shops", "3-View_shops", "4-Delete_shops", "5-Back"};
            System.out.println();
            for (String anArray : array) {
                System.out.println(anArray);
            }
            System.out.print("Please enter your option:");
            Scanner scanner = new Scanner(System.in);
            int sh_choice = scanner.nextInt();

            if (sh_choice == 1) {
                shops = sh.add_shops(shops);
            }
            else if (sh_choice == 2) {
                sh.view_shops(shops);
                shops = sh.edit_shops(shops);
            }
            else if (sh_choice == 3) {
                sh.view_shops(shops);
            }
            else if (sh_choice == 4) {
                sh.view_shops(shops);
                shops = sh.delete_shops(shops);
            }
            else if (sh_choice ==5){
                break;
            }
            else{
                System.out.println("Option Undefine");
                break;
            }
        }

    }
    public static void choice3(){
        {
            Draw dr = new Draw();
            int[] vietlott = dr.setLucky();
            System.out.print("Draw: ");
            for (int i = 0; i < vietlott.length ; i++) {
                System.out.print(String.format("%02d", vietlott[i]) + " ");
            }
            System.out.println();
        }
    }
    public static void choice4(){
        int[] av = new int[5];
        for (int i = 1; i <= 5 ; i++) {
            Draw dr = new Draw();
            int vietlott[] = dr.setLucky();
            System.out.print("Draw " + i + ": ");
            for (int j = 0; j < vietlott.length ; j++) {
                System.out.print(String.format("%02d ", vietlott[j]));
            }
            Arrays.sort(vietlott);
            int times = 1;
            dr = new Draw();
            int trymatch[] =dr.setLucky();
            Arrays.sort(trymatch);
            while (!Arrays.equals(vietlott,trymatch)){
                dr = new Draw();
                trymatch = dr.setLucky();
                times++;
                Arrays.sort(trymatch);
            }
            av[i-1] = times;
            System.out.println("Number of times to match " + i + ": " + times);
        }
        int sum = 0;
        for (int i = 0; i < av.length ; i++) {
            sum += av[i];
        }
        int average = sum/av.length;
        System.out.println("To win you need to keep on " + average + " times :D !");
    }
    public static void main(String[] args) {
        while(true) {
            String[] general_array = {"1-Customers", "2-Vietlott Shops", "3-Vietlott Draw", "4-Vietlott Probability", "5-Exit"};
            for (String aGeneral_array : general_array) {
                System.out.println(aGeneral_array);
            }

            System.out.print("What do you want to work with?");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 1) choice1();

            else if (choice ==2) choice2();
            else if (choice == 3)choice3();
            else if (choice ==4) choice4();
            else if (choice ==5){
                break;
            }
            else {
                System.out.println("Option Undefine");
                break;
            }
        }

    }
}

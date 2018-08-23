package com.company;

//import java.util.Calendar;
import java.lang.invoke.SwitchPoint;
import java.util.Calendar;
import java.util.Scanner;
//import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
        String takeyear, takeday, first_name, last_name, getGender,  id, takeMonth, concart9, concart20 = "";



        Scanner Sc = new Scanner(System.in);
        System.out.print("Please enter your first name:");
        first_name = Sc.nextLine();
        System.out.print("Please enter your last name:");
        last_name = Sc.nextLine();

        do {
            System.out.println(" Please enter id");
            id = Sc.next();
        }
        while (id.length() != 13);
        {
            takeyear = id.substring(0, 2);
            takeday = id.substring(4, 6);
            takeMonth = id.substring(2, 4);
            getGender = id.substring(6, 7);
            concart9 = "19" + takeyear;
            concart20 = "20" + takeyear;

            int year = Calendar.getInstance().get(Calendar.YEAR);
            int parse20 = Integer.parseInt(concart20);
            int parse9 = Integer.parseInt(concart9);

            int Age19 = year - parse9;
            int Age20 = year - parse20;

            int forceGender = Integer.parseInt(getGender);

            if (id.startsWith("1") || id.startsWith("0")) //2013 and 2000
            {
                System.out.println("You were born on " + takeday + "/" + takeMonth + "/" + parse20);
                System.out.println("You are " + Age20 + " years old");

                if (forceGender >= 0 && forceGender <= 4) {

                    System.out.println("you are Female");
                    System.out.println("This is the record of "+ first_name+ " "+ last_name+  " She was born on the "+ takeday + "/" + takeMonth + "/" + parse20);

                }

                 else if (forceGender >= 5 && forceGender <= 9) {
                    System.out.println("you are Male");
                    System.out.println("This is the record of "+first_name+ " "+ last_name+  " He was born on the " + takeday +"/"+ takeMonth +"/"+ parse20);

                } else {
                    System.out.println("Gender Unknown!!!!!!!!!!!!!! ");
                }

            } else if (id.startsWith("9")) {
                concart9 = "19" + takeyear;

                System.out.println("You were born on " + takeday + "/" + takeMonth + "/" + concart9);
                System.out.println("You are " + Age19 + " years old");

                if (forceGender >= 0 && forceGender <= 4) {

                    System.out.println("This is the record of " + first_name + " " + last_name + " She was born on the " + takeday + "/" + takeMonth + "/" + parse9);
                } else if (forceGender >= 5 && forceGender <= 9) {
                    System.out.println("This is the record of " + first_name + " " + last_name + " He was born on the " + takeday + "/" + takeMonth + "/" + parse9);
                }
            } else {
                System.out.println("Gender Unknown!!!!!! ");
            }

        }
    }
}
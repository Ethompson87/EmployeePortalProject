package org.ThompsonEmployeeMainPortal;

import org.ThompsonEmployeeDatabase.CheckEmployeePassword;
import org.ThompsonEmployeeDatabase.EmployeeDatabaseEntry;
import org.ThompsonEmployeeDatabase.EmployeePassword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dataEntry = new Scanner(System.in);
        String[] emailExtensions = {"@gmail.com", "@yahoo.com", "@aol.com"};


        System.out.println("WELCOME TO THE EMPLOYEE PORTAL");
        System.out.println("----------------------------------");
        System.out.println("LOGIN PORTAL");
        while(true) {

            System.out.print("Email: ");
            String emailUsername = dataEntry.nextLine();

            for(String i: emailExtensions) {

                if (!(emailUsername.contains(i))) {
                    System.out.println("Your username must be an email address.");

                }
                else {
                    System.out.print("Password: ");
                    String passwordEntry = dataEntry.nextLine();

                    EmployeePassword empDatabaseEntry = new EmployeePassword(emailUsername, passwordEntry);

                    System.out.println(empDatabaseEntry.emailUserName());
                    System.out.println(empDatabaseEntry.password());

                }
                break;
            }
            break;
        }




    }
}
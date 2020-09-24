package com.itsalwaysaskar;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ticket buying system
        int i = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Welcome to Ticket buying System");
        System.out.println("------------------------------------------------------------");
        System.out.println("Enter \"Domestic\" for local journey");
        System.out.println("Enter \"International\" for international journey");
        System.out.println("Enter \"Exit\" for Exiting the Program");
        System.out.print("Enter the Choice:");

        do {

            String Journey = input.next();
            System.out.println("");

            if (Journey.equalsIgnoreCase("Domestic")) {

                Domestic domestic = new Domestic(Journey);


            }
            else if (Journey.equalsIgnoreCase("international")) {

                International international = new International(Journey);

            }
            else if (Journey.equalsIgnoreCase("Exit")) {

                System.err.println(" application will exit  ");
                System.exit(0);

            }
            else {
                i = 1 ; // repeat options
                System.err.println("Wrong Selection of Journey Type! , please try again");
                System.out.print("Enter the Choice:");


            }

        } while (i != 0);

    }
}

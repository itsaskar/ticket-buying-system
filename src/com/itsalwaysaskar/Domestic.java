package com.itsalwaysaskar;
import java.util.Scanner;

public class Domestic {

    Scanner input = new Scanner(System.in);


    public Domestic(String Journey){

        this.showDomesticMenu(Journey);

    }


    public void showDomesticMenu(String Journey)
    {
        System.out.println("Press A or a for Airplane");
        System.out.println("Press T or t for Train");
        System.out.println("Press B or b for Bus");
        System.out.println("Press O or o for Other Type");
        System.out.print("Enter the Choice:");
        System.out.println("   ");
        String transportation1 = input.next();
        char firstchar1 = transportation1.charAt(0);
        switch (transportation1) {
            case "A":
            case "a": {
                System.out.println("Press 1 for Al-Madina");
                System.out.println("Press 2 for Al-Riyadh");
                System.out.println("Press 3 for Tabouk");
                System.out.print("Enter the Choice:");
                int DestA = input.nextInt();
                switch (DestA) {
                    case 1: {
                        final int AlMadinaA = 300;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf = input.nextInt();
                        System.out.println("Enter the name (first and last):");
                        String name = input.next();
                        String namelast = input.next();
                        System.out.println("Enter Your Identity or Passport Number:");
                        int Id = input.nextInt();
                        System.out.println("Enter Your Contact Number:");
                        String CN = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name + namelast + "             Identity Number         :" + Id + "    Contact Number:     " + CN);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Airplane");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            : Al-Madina");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInf + "     Ticket Fare       :" + (NuInf * AlMadinaA * (0.2)));
                        System.out.println("# Children               :" + NuChil + "     Ticket Fare       :" + (NuChil * AlMadinaA * (0.5)));
                        System.out.println("# Adults               :" + NuAdu + "     Ticket Fare       :" + (AlMadinaA * NuAdu));
                        System.out.println("Discount          :0.00");
                        double Taxes = (((NuInf * AlMadinaA * (0.2)) + (NuChil * AlMadinaA * (0.5)) + (AlMadinaA * NuAdu) * (0.07)));
                        System.out.println("Taxes             :" + Taxes);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("# Passengers            :" + (NuInf + NuChil + NuAdu) + "    Total Ticket Fare :" + ((Taxes) + ((NuInf * AlMadinaA * (20 / 100)) + (NuChil * AlMadinaA * (50 / 100)) + (AlMadinaA * NuAdu))));
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 2: {
                        final int AlRiyadhA = 600;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf = input.nextInt();
                        System.out.println("Enter the name (first and last):");
                        String name = input.next();
                        String namelast = input.next();
                        System.out.println("Enter Your Identity or Passport Number:");
                        int Id = input.nextInt();
                        System.out.println("Enter Your Contact Number:");
                        String CN = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name + namelast + "             Identity Number         :" + Id + "    Contact Number:     " + CN);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Airplane");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            : Al-Madina");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInf + "     Ticket Fare       :" + (NuInf * AlRiyadhA * (0.2)));
                        System.out.println("# Children               :" + NuChil + "     Ticket Fare       :" + (NuChil * AlRiyadhA * (0.5)));
                        System.out.println("# Adults               :" + NuAdu + "     Ticket Fare       :" + (AlRiyadhA * NuAdu));
                        System.out.println("Discount          :0.00");
                        double Taxes = (((NuInf * AlRiyadhA * (0.2)) + (NuChil * AlRiyadhA * (0.5)) + (AlRiyadhA * NuAdu)) * (0.07));
                        System.out.println("Taxes             :" + Taxes);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("# Passengers            :" + (NuInf + NuChil + NuAdu) + "    Total Ticket Fare :" + ((Taxes) + ((NuInf * AlRiyadhA * (20 / 100)) + (NuChil * AlRiyadhA * (50 / 100)) + (AlRiyadhA * NuAdu))));
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 3: {
                        final int TaboukA = 1000;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf = input.nextInt();
                        System.out.println("Enter the name (first and last):");
                        String name = input.next();
                        String namelast = input.next();
                        System.out.println("Enter Your Identity or Passport Number:");
                        int Id = input.nextInt();
                        System.out.println("Enter Your Contact Number:");
                        String CN = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name + namelast + "             Identity Number         :" + Id + "    Contact Number:     " + CN);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Airplane");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            : Al-Madina");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInf + "     Ticket Fare       :" + (NuInf * TaboukA * (0.2)));
                        System.out.println("# Children               :" + NuChil + "     Ticket Fare       :" + (NuChil * TaboukA * (0.5)));
                        System.out.println("# Adults               :" + NuAdu + "     Ticket Fare       :" + (TaboukA * NuAdu));
                        System.out.println("Discount          :0.00");
                        double Taxes = (((NuInf * TaboukA * (0.2)) + (NuChil * TaboukA * (0.5)) + (TaboukA * NuAdu)) * (0.07));
                        System.out.println("Taxes             :" + Taxes);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("# Passengers            :" + (NuInf + NuChil + NuAdu) + "    Total Ticket Fare :" + ((Taxes) + (((NuInf * TaboukA * (20 / 100)) + (NuChil * TaboukA * (50 / 100)) + (TaboukA * NuAdu)) * (7 / 100))));
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;

                    }
                    default: {
                        System.out.println("Wrong Selection of Destination!");
                    }
                }
                break;
            }
            case "T":
            case "t": {
                System.out.println("Press 1 for Al-Madina");
                System.out.println("Press 2 for Al-Riyadh");
                System.out.println("Press 3 for Tabouk");
                System.out.print("Enter the Choice:");
                int DestT = input.nextInt();
                switch (DestT) {
                    case 1: {
                        final int AlMadinaT = 200;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu1 = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil1 = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf1 = input.nextInt();
                        System.out.println("Enter the name (first and last):");
                        String name4 = input.next();
                        String namelast4 = input.next();
                        System.out.println("Enter Your Identity or Passport Number:");
                        int Id4 = input.nextInt();
                        System.out.println("Enter Your Contact Number:");
                        String CN4 = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name4 + namelast4 + "             Identity Number         :" + Id4 + "    Contact Number:     " + CN4);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Train");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Al-Madina");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInf1 + "     Ticket Fare       :" + (NuInf1 * AlMadinaT * (0.15)));
                        System.out.println("# Children               :" + NuChil1 + "     Ticket Fare       :" + (NuChil1 * AlMadinaT * (0.4)));
                        System.out.println("# Adults               :" + NuAdu1 + "     Ticket Fare       :" + (NuAdu1 * AlMadinaT));
                        System.out.println("Discount          :0.00");
                        double Taxes = (((NuInf1 * AlMadinaT * (0.15)) + (NuChil1 * AlMadinaT * (0.4)) + (AlMadinaT * NuAdu1)) * (0.05));
                        System.out.println("Taxes             :" + Taxes);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("# Passengers            :" + (NuInf1 + NuChil1 + NuAdu1) + "    Total Ticket Fare :" + (((NuInf1 * AlMadinaT * (15 / 100)) + (NuChil1 * AlMadinaT * (40 / 100)) + (AlMadinaT * NuAdu1)) + Taxes));
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 2: {
                        final int AlRiyadhT = 500;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu1 = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil1 = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf1 = input.nextInt();
                        System.out.println("Enter the name (first and last):");
                        String name4 = input.next();
                        String namelast4 = input.next();
                        System.out.println("Enter Your Identity or Passport Number:");
                        int Id4 = input.nextInt();
                        System.out.println("Enter Your Contact Number:");
                        String CN4 = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name4 + namelast4 + "             Identity Number         :" + Id4 + "    Contact Number:     " + CN4);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Train");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Al-Riyadh");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInf1 + "     Ticket Fare       :" + (NuInf1 * AlRiyadhT * (0.15)));
                        System.out.println("# Children               :" + NuChil1 + "     Ticket Fare       :" + (NuChil1 * AlRiyadhT * (0.4)));
                        System.out.println("# Adults               :" + NuAdu1 + "     Ticket Fare       :" + (NuAdu1 * AlRiyadhT));
                        System.out.println("Discount          :0.00");
                        double Taxes = (((NuInf1 * AlRiyadhT * (0.15)) + (NuChil1 * AlRiyadhT * (0.4)) + (AlRiyadhT * NuAdu1)) * (0.05));
                        System.out.println("Taxes             :" + Taxes);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("# Passengers            :" + (NuInf1 + NuChil1 + NuAdu1) + "    Total Ticket Fare :" + (((NuInf1 * AlRiyadhT * (15 / 100)) + (NuChil1 * AlRiyadhT * (40 / 100)) + (AlRiyadhT * NuAdu1)) + Taxes));
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 3: {
                        final int TaboukT = 700;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu1 = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil1 = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf1 = input.nextInt();
                        System.out.println("Enter the name (first and last):");
                        String name4 = input.next();
                        String namelast4 = input.next();
                        System.out.println("Enter Your Identity or Passport Number:");
                        int Id4 = input.nextInt();
                        System.out.println("Enter Your Contact Number:");
                        String CN4 = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name4 + namelast4 + "             Identity Number         :" + Id4 + "    Contact Number:     " + CN4);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Train");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Tabouk");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInf1 + "     Ticket Fare       :" + (NuInf1 * TaboukT * (0.15)));
                        System.out.println("# Children               :" + NuChil1 + "     Ticket Fare       :" + (NuChil1 * TaboukT * (0.4)));
                        System.out.println("# Adults               :" + NuAdu1 + "     Ticket Fare       :" + (NuAdu1 * TaboukT));
                        System.out.println("Discount          :0.00");
                        double Taxes = (((NuInf1 * TaboukT * (0.15)) + (NuChil1 * TaboukT * (0.4)) + (TaboukT * NuAdu1)) * (0.05));
                        System.out.println("Taxes             :" + Taxes);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("# Passengers            :" + (NuInf1 + NuChil1 + NuAdu1) + "    Total Ticket Fare :" + (((NuInf1 * TaboukT * (15 / 100)) + (NuChil1 * TaboukT * (40 / 100)) + (TaboukT * NuAdu1)) + Taxes));
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    default: {
                        System.out.println("Wrong Selection of Destination!");
                    }
                }
                break;
            }
            case "B":
            case "b": {
                System.out.println("Press 1 for Al-Madina");
                System.out.println("Press 2 for Al-Riyadh");
                System.out.println("Press 3 for Tabouk");
                System.out.print("Enter the Choice:");
                int DestB = input.nextInt();
                switch (DestB) {
                    case 1: {
                        final int AlMadinaB = 150;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu2 = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil2 = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf2 = input.nextInt();
                        System.out.println("Enter the name (first and last):");
                        String name1 = input.next();
                        String namelast1 = input.next();
                        System.out.println("Enter Your Identity or Passport Number:");
                        int Id1 = input.nextInt();
                        System.out.println("Enter Your Contact Number:");
                        String CN1 = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name1 + namelast1 + "             Identity Number         :" + Id1 + "    Contact Number:     " + CN1);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     :Bus");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Al-Madina");
                        System.out.println("    ");
                        System.out.println("    ");
                        if (NuInf2 == 1 || NuInf2 == 0) {
                            System.out.println("# Infants               :" + NuInf2 + "     Ticket Fare       :" + ("0.00"));
                            System.out.println("# Children               :" + NuChil2 + "     Ticket Fare       :" + (NuChil2 * AlMadinaB * (0.5)));
                            System.out.println("# Adults               :" + NuAdu2 + "     Ticket Fare       :" + (NuAdu2 * AlMadinaB));
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuChil2 * AlMadinaB * (0.5)) + (NuAdu2 * AlMadinaB)) * (0.02));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInf2 + NuChil2 + NuAdu2) + "    Total Ticket Fare :" + (Taxes + (((NuChil2 * AlMadinaB * (0.5)) + (NuAdu2 * AlMadinaB)))));
                        } else if (NuInf2 > 1) {
                            System.out.println("# Infants               :" + NuInf2 + "     Ticket Fare       :" + ((NuInf2 - 1) * AlMadinaB * (0.1)));
                            System.out.println("# Children               :" + NuChil2 + "     Ticket Fare       :" + (NuChil2 * AlMadinaB * (0.5)));
                            System.out.println("# Adults               :" + NuAdu2 + "     Ticket Fare       :" + (NuAdu2 * AlMadinaB));
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuInf2 - 1) * AlMadinaB * (0.1)) + (NuChil2 * AlMadinaB * (0.5)) + (NuAdu2 * AlMadinaB) * (0.02));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInf2 + NuChil2 + NuAdu2) + "    Total Ticket Fare :" + (Taxes + (((NuInf2 - 1) * AlMadinaB * (0.1)) + (NuChil2 * AlMadinaB * (0.5)) + (NuAdu2 * AlMadinaB))));
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 2: {
                        final int AlRiyadhB = 150;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu2 = input.nextInt();
                        final int TaboukB = 150;
                        System.out.print("Enter number of Children:");
                        int NuChil2 = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf2 = input.nextInt();
                        System.out.println("Enter the name (first and last):");
                        String name1 = input.next();
                        String namelast1 = input.next();
                        System.out.println("Enter Your Identity or Passport Number:");
                        int Id1 = input.nextInt();
                        System.out.println("Enter Your Contact Number:");
                        String CN1 = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name1 + namelast1 + "             Identity Number         :" + Id1 + "    Contact Number:     " + CN1);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     :Bus");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Al-Riyadh");
                        System.out.println("    ");
                        System.out.println("    ");
                        if (NuInf2 == 1 || NuInf2 == 0) {
                            System.out.println("# Infants               :" + NuInf2 + "     Ticket Fare       :" + ("0.00"));
                            System.out.println("# Children               :" + NuChil2 + "     Ticket Fare       :" + (NuChil2 * AlRiyadhB * (0.5)));
                            System.out.println("# Adults               :" + NuAdu2 + "     Ticket Fare       :" + (NuAdu2 * AlRiyadhB));
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuChil2 * AlRiyadhB * (0.5)) + (NuAdu2 * AlRiyadhB)) * (0.2));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInf2 + NuChil2 + NuAdu2) + "    Total Ticket Fare :" + (Taxes + (((NuChil2 * AlRiyadhB * (0.5)) + (NuAdu2 * AlRiyadhB)))));
                        } else if (NuInf2 > 1) {
                            System.out.println("# Infants               :" + NuInf2 + "     Ticket Fare       :" + ((NuInf2 - 1) * AlRiyadhB * (0.1)));
                            System.out.println("# Children               :" + NuChil2 + "     Ticket Fare       :" + (NuChil2 * AlRiyadhB * (0.5)));
                            System.out.println("# Adults               :" + NuAdu2 + "     Ticket Fare       :" + (NuAdu2 * AlRiyadhB));
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuInf2 - 1) * AlRiyadhB * (0.1)) + (NuChil2 * AlRiyadhB * (0.5)) + (NuAdu2 * AlRiyadhB) * (0.02));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInf2 + NuChil2 + NuAdu2) + "    Total Ticket Fare :" + (Taxes + (((NuInf2 - 1) * AlRiyadhB * (0.51)) + (NuChil2 * AlRiyadhB * (0.5)) + (NuAdu2 * AlRiyadhB))));
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 3: {
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu2 = input.nextInt();
                        final int TaboukB = 150;
                        System.out.print("Enter number of Children:");
                        int NuChil2 = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf2 = input.nextInt();
                        System.out.println("Enter the name (first and last):");
                        String name1 = input.next();
                        String namelast1 = input.next();
                        System.out.println("Enter Your Identity or Passport Number:");
                        int Id1 = input.nextInt();
                        System.out.println("Enter Your Contact Number:");
                        String CN1 = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name1 + namelast1 + "             Identity Number         :" + Id1 + "    Contact Number:     " + CN1);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     :Bus");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Tabouk");
                        System.out.println("    ");
                        System.out.println("    ");
                        if (NuInf2 == 1 || NuInf2 == 0) {
                            System.out.println("# Infants               :" + NuInf2 + "     Ticket Fare       :" + ("0.00"));
                            System.out.println("# Children               :" + NuChil2 + "     Ticket Fare       :" + (NuChil2 * TaboukB * (50 / 100)));
                            System.out.println("# Adults               :" + NuAdu2 + "     Ticket Fare       :" + (NuAdu2 * TaboukB));
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuChil2 * TaboukB * (0.5)) + (NuAdu2 * TaboukB)) * (2 / 100));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInf2 + NuChil2 + NuAdu2) + "    Total Ticket Fare :" + (Taxes + (((NuChil2 * TaboukB * (0.5)) + (NuAdu2 * TaboukB)))));
                        } else if (NuInf2 > 1) {
                            System.out.println("# Infants               :" + NuInf2 + "     Ticket Fare       :" + ((NuInf2 - 1) * TaboukB * (0.1)));
                            System.out.println("# Children               :" + NuChil2 + "     Ticket Fare       :" + (NuChil2 * TaboukB * (0.5)));
                            System.out.println("# Adults               :" + NuAdu2 + "     Ticket Fare       :" + (NuAdu2 * TaboukB));
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuInf2 - 1) * TaboukB * (0.1)) + (NuChil2 * TaboukB * (0.5)) + (NuAdu2 * TaboukB) * (0.02));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInf2 + NuChil2 + NuAdu2) + "    Total Ticket Fare :" + (Taxes + (((NuInf2 - 1) * TaboukB * (0.1)) + (NuChil2 * TaboukB * (0.5)) + (NuAdu2 * TaboukB))));
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    default: {
                        System.out.println("Wrong Selection of Destination!");
                    }
                }
                break;
            }
            case "O":
            case "o":
                System.out.println("Press 1 for Al-Madina");
                System.out.println("Press 2 for Al-Riyadh");
                System.out.println("Press 3 for Tabouk");
                System.out.print("Enter the Choice:");
                int DestO = input.nextInt();
                switch (DestO) {
                    case 1: {
                        final int AlMadina = 150;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu3 = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil3 = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf3 = input.nextInt();
                        System.out.println("   ");
                        System.out.print("Enter Trasportaion Type:");
                        String trans = input.next();
                        System.out.print("Enter Taxes amount:");
                        double taxes = input.nextDouble();
                        System.out.print("Enter Adult Ticket Fare:");
                        int adFar = input.nextInt();
                        System.out.print("Enter Child Ticket Fare:");
                        int chilFar = input.nextInt();
                        System.out.print("Enter Infant Ticket Fare:");
                        int infFar = input.nextInt();
                        System.out.println("   ");
                        System.out.print("Enter the name (first and last):");
                        String name2 = input.next();
                        String namelast2 = input.next();
                        System.out.print("Enter Your Identity or Passport Number:");
                        int Id2 = input.nextInt();
                        System.out.print("Enter Your Contact Number:");
                        String CN2 = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name2 + namelast2 + "             Identity Number         :" + Id2 + "    Contact Number:     " + CN2);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     :" + trans);
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Al-Madina");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInf3 + "     Ticket Fare       :" + (infFar * NuInf3));
                        System.out.println("# Children               :" + NuChil3 + "     Ticket Fare       :" + (chilFar * NuChil3));
                        System.out.println("# Adults               :" + NuAdu3 + "     Ticket Fare       :" + (adFar * NuAdu3));
                        System.out.println("Discount          :0.00");
                        System.out.println("Taxes             :" + taxes);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("# Passengers            :" + (NuInf3 + NuChil3 + NuAdu3) + "    Total Ticket Fare :" + (taxes + (infFar * NuInf3) + (chilFar * NuChil3) + (adFar * NuAdu3)));
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 2: {
                        final int AlRiyadh = 150;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu3 = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil3 = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf3 = input.nextInt();
                        System.out.println("   ");
                        System.out.print("Enter Trasportaion Type:");
                        String trans = input.next();
                        System.out.print("Enter Taxes amount:");
                        double taxes = input.nextDouble();
                        System.out.print("Enter Adult Ticket Fare:");
                        int adFar = input.nextInt();
                        System.out.print("Enter Child Ticket Fare:");
                        int chilFar = input.nextInt();
                        System.out.print("Enter Infant Ticket Fare:");
                        int infFar = input.nextInt();
                        System.out.println("   ");
                        System.out.print("Enter the name (first and last):");
                        String name2 = input.next();
                        String namelast2 = input.next();
                        System.out.print("Enter Your Identity or Passport Number:");
                        int Id2 = input.nextInt();
                        System.out.print("Enter Your Contact Number:");
                        String CN2 = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name2 + namelast2 + "             Identity Number         :" + Id2 + "    Contact Number:     " + CN2);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     :" + trans);
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Al-Riyadh");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInf3 + "     Ticket Fare       :" + (infFar * NuInf3));
                        System.out.println("# Children               :" + NuChil3 + "     Ticket Fare       :" + (chilFar * NuChil3));
                        System.out.println("# Adults               :" + NuAdu3 + "     Ticket Fare       :" + (adFar * NuAdu3));
                        System.out.println("Discount          :0.00");
                        System.out.println("Taxes             :" + taxes);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("# Passengers            :" + (NuInf3 + NuChil3 + NuAdu3) + "    Total Ticket Fare :" + (taxes + (infFar * NuInf3) + (chilFar * NuChil3) + (adFar * NuAdu3)));
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 3: {
                        final int Tabouk = 150;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAdu3 = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChil3 = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInf3 = input.nextInt();
                        System.out.println("   ");
                        System.out.print("Enter Trasportaion Type:");
                        String trans = input.next();
                        System.out.print("Enter Taxes amount:");
                        double taxes = input.nextDouble();
                        System.out.print("Enter Adult Ticket Fare:");
                        int adFar = input.nextInt();
                        System.out.print("Enter Child Ticket Fare:");
                        int chilFar = input.nextInt();
                        System.out.print("Enter Infant Ticket Fare:");
                        int infFar = input.nextInt();
                        System.out.println("   ");
                        System.out.print("Enter the name (first and last):");
                        String name2 = input.next();
                        String namelast2 = input.next();
                        System.out.print("Enter Your Identity or Passport Number:");
                        int Id2 = input.nextInt();
                        System.out.print("Enter Your Contact Number:");
                        String CN2 = input.next();
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("*** Thank you for Buying Tickets  ***");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("Information Details of Applying for DOMESTIC Journey");
                        System.out.println("         ---------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("===========================================================================================================================");
                        System.out.println("Name                    :" + name2 + namelast2 + "             Identity Number         :" + Id2 + "    Contact Number:     " + CN2);
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     :" + trans);
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInf3 + "     Ticket Fare       :" + (infFar * NuInf3));
                        System.out.println("# Children               :" + NuChil3 + "     Ticket Fare       :" + (chilFar * NuChil3));
                        System.out.println("# Adults               :" + NuAdu3 + "     Ticket Fare       :" + (adFar * NuAdu3));
                        System.out.println("Discount          :0.00");
                        System.out.println("Taxes             :" + taxes);
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("    ");
                        System.out.println("# Passengers            :" + (NuInf3 + NuChil3 + NuAdu3) + "    Total Ticket Fare :" + (taxes + (infFar * NuInf3) + (chilFar * NuChil3) + (adFar * NuAdu3)));
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    default: {
                        System.out.println("Wrong Selection of Destination!");
                    }
                }
            default: {
                System.out.println("Wrong Selection of Destination!");
            }
        }
    }
}

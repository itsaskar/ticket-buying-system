package com.itsalwaysaskar;
import java.util.Scanner;

public class International {

    Scanner input = new Scanner(System.in);

    public International(String Journey) {

        showInternationalMenu(Journey);

    }


    public void showInternationalMenu(String Journey)
    {
        System.out.println("Press A or a for Airplane");
        System.out.println("Press T or t for Train");
        System.out.print("Enter the Choice: ");
        String transportation2 = input.next();
        char firstchar2 = transportation2.charAt(0);
        switch (transportation2) {
            case "A":
            case "a":
                System.out.println("Press 1 for Dubai ");
                System.out.println("Press 2 for Cairo");
                System.out.println("Press 3 for London");
                System.out.println("Press 4 for Paris");
                System.out.print("Enter the Choice:");
                int DestAI = input.nextInt();
                switch (DestAI) {
                    case 1: {
                        final int Dubai = 3000;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAduI = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChilI = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInfI = input.nextInt();
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
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Dubai");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + (NuInfI * Dubai * (0.3)));
                        System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * Dubai * (0.7)));
                        System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * Dubai));
                        double total = ((NuInfI * Dubai * (0.3)) + (NuChilI * Dubai * (0.7)) + (NuAduI * Dubai));
                        if (total < 6000 || total == 6000) {
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuInfI * Dubai * (0.3)) + (NuChilI * Dubai * (0.7)) + (NuAduI * Dubai)) * (0.15));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (Taxes + total));
                        } else if (total > 6000) {
                            double Discount = (total * 0.15);
                            System.out.println("Discount          :" + Discount);
                            double Taxes = (((NuInfI * Dubai * (0.3)) + (NuChilI * Dubai * (0.7)) + (NuAduI * Dubai)) * (0.15));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (Taxes + total - Discount));
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 2: {
                        final int Cairo = 3500;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAduI = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChilI = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInfI = input.nextInt();
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
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Cairo");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + (NuInfI * Cairo * (0.3)));
                        System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * Cairo * (0.7)));
                        System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * Cairo));
                        double total = ((NuInfI * Cairo * (0.3)) + (NuChilI * Cairo * (0.7)) + (NuAduI * Cairo));
                        if (total < 6000 || total == 6000) {
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuInfI * Cairo * (0.3)) + (NuChilI * Cairo * (0.7)) + (NuAduI * Cairo)) * (0.15));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (Taxes + total));
                        } else if (total > 6000) {
                            double Discount = (total * 0.15);
                            System.out.println("Discount          :" + Discount);
                            double Taxes = (((NuInfI * Cairo * (0.3)) + (NuChilI * Cairo * (0.7)) + (NuAduI * Cairo)) * (0.15));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (Taxes + total - Discount));
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 3: {
                        final int London = 4000;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAduI = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChilI = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInfI = input.nextInt();
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
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :London");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + (NuInfI * London * (0.3)));
                        System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * London * (0.7)));
                        System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * London));
                        double total = ((NuInfI * London * (0.3)) + (NuChilI * London * (0.7)) + (NuAduI * London));
                        if (total < 6000 || total == 6000) {
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuInfI * London * (0.3)) + (NuChilI * London * (0.7)) + (NuAduI * London)) * (0.15));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (Taxes + total));
                        } else if (total > 6000) {
                            double Discount = (total * 0.15);
                            System.out.println("Discount          :" + Discount);
                            double Taxes = (((NuInfI * London * (0.3)) + (NuChilI * London * (0.7)) + (NuAduI * London)) * (0.15));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (Taxes + total - Discount));
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 4: {
                        final int Paris = 5000;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAduI = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChilI = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInfI = input.nextInt();
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
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Paris");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + (NuInfI * Paris * (0.3)));
                        System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * Paris * (0.7)));
                        System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * Paris));
                        double total = ((NuInfI * Paris * (0.3)) + (NuChilI * Paris * (0.7)) + (NuAduI * Paris));
                        if (total < 6000 || total == 6000) {
                            System.out.println("Discount          :0.00");
                            double Taxes = (((NuInfI * Paris * (0.3)) + (NuChilI * Paris * (0.7)) + (NuAduI * Paris)) * (0.15));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (Taxes + total));
                        } else if (total > 6000) {
                            double Discount = (total * 0.15);
                            System.out.println("Discount          :" + Discount);
                            double Taxes = (((NuInfI * Paris * (0.3)) + (NuChilI * Paris * (0.7)) + (NuAduI * Paris)) * (0.15));
                            System.out.println("Taxes             :" + Taxes);
                            System.out.println("--------------------------------------------------------------------------------------------");
                            System.out.println("    ");
                            System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (Taxes + total - Discount));
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                }
                break;
            case "T":
            case "t":
                System.out.println("Press 1 for Dubai ");
                System.out.println("Press 2 for Cairo");
                System.out.println("Press 3 for London");
                System.out.println("Press 4 for Paris");
                System.out.print("Enter the Choice:");
                int DestTI = input.nextInt();
                switch (DestTI) {
                    case 1: {
                        final int DubaiT = 2000;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAduI = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChilI = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInfI = input.nextInt();
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
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Train");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Dubai");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        if (NuInfI == 1 || NuInfI == 0) {
                            System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + ("0.00"));
                            System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * DubaiT * (0.5)));
                            System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * DubaiT));
                            double total = ((NuChilI * DubaiT * (0.5)) + (NuAduI * DubaiT));
                            if (total < 4000 || total == 4000) {
                                double Discount = 0.00;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuChilI * DubaiT * (0.5)) + (NuAduI * DubaiT)) * 0.1);
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            } else if (total > 4000) {
                                double Discount = total * 0.1;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuChilI * DubaiT * (0.5)) + (NuAduI * DubaiT)) * 0.1);
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            }
                        } else if (NuInfI > 1) {
                            System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + ((NuInfI - 1) * DubaiT * (0.2)));
                            System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * DubaiT * (0.5)));
                            System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * DubaiT));
                            double total = (((NuInfI - 1) * DubaiT * (0.2)) + (NuChilI * DubaiT * (0.5)) + (NuAduI * DubaiT));
                            if (total < 4000 || total == 4000) {
                                double Discount = 0.00;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuInfI - 1) * DubaiT * (0.2)) + (NuChilI * DubaiT * (0.5)) + (NuAduI * DubaiT) * (0.1));
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            } else if (total > 4000) {
                                double Discount = total * 0.1;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuInfI - 1) * DubaiT * (0.2)) + (NuChilI * DubaiT * (0.5)) + (NuAduI * DubaiT) * (0.1));
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            }
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 2: {
                        final int CairoT = 2500;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAduI = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChilI = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInfI = input.nextInt();
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
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Train");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Cairo");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        if (NuInfI == 1 || NuInfI == 0) {
                            System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + ("0.00"));
                            System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * CairoT * (0.5)));
                            System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * CairoT));
                            double total = (NuChilI * CairoT * (0.5)) + (NuAduI * CairoT);
                            if (total < 4000 || total == 4000) {
                                double Discount = 0.00;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuChilI * CairoT * (0.5)) + (NuAduI * CairoT)) * 0.1);
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            } else if (total > 4000) {
                                double Discount = total * 0.1;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuChilI * CairoT * (0.5)) + (NuAduI * CairoT)) * 0.1);
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            }
                        } else if (NuInfI > 1) {
                            System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + ((NuInfI - 1) * CairoT * (0.2)));
                            System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * CairoT * (0.5)));
                            System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * CairoT));
                            double total = ((NuInfI - 1) * CairoT * (0.2)) + (NuChilI * CairoT * (0.5)) + (NuAduI * CairoT);
                            if (total < 4000 || total == 4000) {
                                double Discount = 0.00;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuInfI - 1) * CairoT * (0.2)) + (NuChilI * CairoT * (0.5)) + (NuAduI * CairoT) * (0.1));
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            } else if (total > 4000) {
                                double Discount = total * 0.1;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuInfI - 1) * CairoT * (0.2)) + (NuChilI * CairoT * (0.5)) + (NuAduI * CairoT) * (0.1));
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            }
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                    case 3: {
                        final int LondonT = 3000;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAduI = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChilI = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInfI = input.nextInt();
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
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Train");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :London");
                        System.out.println("    ");
                        System.out.println("    ");
                        if (NuInfI == 1 || NuInfI == 0) {
                            System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + ("0.00"));
                            System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * LondonT * (0.5)));
                            System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * LondonT));
                            double total = (NuChilI * LondonT * (0.5)) + (NuAduI * LondonT);
                            if (total < 4000 || total == 4000) {
                                double Discount = 0.00;
                                System.out.println("Discount          :0.00");
                                double Taxes = (((NuChilI * LondonT * (0.5)) + (NuAduI * LondonT)) * 0.1);
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            } else if (total > 4000) {
                                double Discount = total * 0.1;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuChilI * LondonT * (0.5)) + (NuAduI * LondonT)) * 0.1);
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            }
                        } else if (NuInfI > 1) {
                            System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + ((NuInfI - 1) * LondonT * (0.2)));
                            System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * LondonT * (0.5)));
                            System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * LondonT));
                            double total = (((NuInfI - 1) * LondonT * (0.2)) + (NuChilI * LondonT * (0.5)) + (NuAduI * LondonT));
                            if (total < 4000 || total == 4000) {
                                double Discount = 0.00;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuInfI - 1) * LondonT * (0.2)) + (NuChilI * LondonT * (0.5)) + (NuAduI * LondonT) * (0.1));
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            } else if (total > 4000) {
                                double Discount = total * 0.1;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuInfI - 1) * LondonT * (0.2)) + (NuChilI * LondonT * (0.5)) + (NuAduI * LondonT) * (0.1));
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            }
                            System.out.println("    ");
                            System.out.println("    ");
                            System.out.println("    ");
                            System.out.println("==========================================================================================================================");
                            break;
                        }
                    }
                    case 4: {
                        final int ParisT = 3500;
                        System.out.println("   ");
                        System.out.print("Enter number of adults:");
                        int NuAduI = input.nextInt();
                        System.out.print("Enter number of Children:");
                        int NuChilI = input.nextInt();
                        System.out.print("Enter number of Infants:");
                        int NuInfI = input.nextInt();
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
                        System.out.println("Journey Type            :" + Journey + "                   Transportation Type     : Train");
                        System.out.println("Departure City          : JEDDAH                      Arrival City            :Paris");
                        System.out.println("    ");
                        System.out.println("    ");
                        if (NuInfI == 1 || NuInfI == 0) {
                            System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + ("0.00"));
                            System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * ParisT * (50 / 100)));
                            System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * ParisT));
                            double total = (NuChilI * ParisT * (0.5)) + (NuAduI * ParisT);
                            if (total < 4000 || total == 4000) {
                                double Discount = 0.00;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuChilI * ParisT * (0.5)) + (NuAduI * ParisT)) * 0.1);
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            } else if (total > 4000) {
                                double Discount = total * 0.1;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuChilI * ParisT * (0.5)) + (NuAduI * ParisT)) * 0.1);
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            }
                        } else if (NuInfI > 1) {
                            System.out.println("# Infants               :" + NuInfI + "     Ticket Fare       :" + ((NuInfI - 1) * ParisT * (0.2)));
                            System.out.println("# Children               :" + NuChilI + "     Ticket Fare       :" + (NuChilI * ParisT * (0.5)));
                            System.out.println("# Adults               :" + NuAduI + "     Ticket Fare       :" + (NuAduI * ParisT));
                            double total = ((NuInfI - 1) * ParisT * (0.2)) + (NuChilI * ParisT * (0.5)) + (NuAduI * ParisT);
                            if (total < 4000 || total == 4000) {
                                double Discount = 0.00;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuInfI - 1) * ParisT * (0.2)) + (NuChilI * ParisT * (0.5)) + (NuAduI * ParisT) * (0.1));
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            } else if (total > 4000) {
                                double Discount = total * 0.1;
                                System.out.println("Discount          :" + Discount);
                                double Taxes = (((NuInfI - 1) * ParisT * (0.2)) + (NuChilI * ParisT * (0.5)) + (NuAduI * ParisT) * (0.1));
                                System.out.println("Taxes             :" + Taxes);
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("    ");
                                System.out.println("# Passengers            :" + (NuInfI + NuChilI + NuAduI) + "    Total Ticket Fare :" + (total + Taxes - Discount));
                            }
                        }
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("    ");
                        System.out.println("==========================================================================================================================");
                        break;
                    }
                }
            default: {
                System.out.println("Wrong Selection of Destination!");
            }
        }

    }
}

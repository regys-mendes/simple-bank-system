package main;

import services.OperationsBalance;
import exceptions.ValorInvalido;
import entities.CurrentAccount;
import entities.SavingsAccount;


import java.util.Scanner;

public class Application {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("------Welcome the bank------");

            System.out.println("Account Type: ");
            System.out.println("1- [Current Account]");
            System.out.println("2- [Savings Account]");
            System.out.print("Choose: ");
            int typeAccount = sc.nextInt();
            sc.nextLine();


            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Password: ");
            String password = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            if (balance < 0) {
                throw new ValorInvalido("Balance cannot be negative");
            }

            //CREATE ACCOUNT
            OperationsBalance operations = null;

            if (typeAccount == 1) {
                operations = new OperationsBalance(name, password, email, new CurrentAccount(), balance);
                System.out.println("\n  ✅Current Account created successfully! ");
            } else if (typeAccount == 2) {
                operations = new OperationsBalance(name, password, email, new SavingsAccount(), balance);
                System.out.println("\n  ✅Savings Account created successfully! ");
            } else {
                System.out.println("Invalid account type. Please choose 1 for Current Account or 2 for Savings Account.");
            }

            //LOOP FOR USING ACCOUNT
            boolean continuar = true;

            while (continuar) {
                System.out.println("\n========== OPERATIONS ==========");
                System.out.println("1 - Deposit");
                System.out.println("2 - Withdraw");
                System.out.println("3 - View Balance");
                System.out.println("4 - Exit");
                System.out.print("Choose an option: ");

                int option = sc.nextInt();
                sc.nextLine();

                switch (option) {

                    case 1:
                        System.out.println("Amount to deposit: ");
                        double amountDeposit = sc.nextDouble();

                        if (amountDeposit < 0) {
                            throw new ValorInvalido("Deposit amount must be positive");
                        }
                        operations.deposit(amountDeposit);
                        System.out.println("Deposit successfully! ");
                        break;

                    case 2:
                        System.out.println("Amount to withdraw: ");
                        double amountWithdraw = sc.nextDouble();

                        if (amountWithdraw > balance) {
                            throw new ValorInvalido("Amount withdraw higher than balance!");
                        }
                        operations.withDraw(amountWithdraw);
                        System.out.println("Withdraw successfully! ");
                        break;

                    case 3:
                        System.out.print(operations);
                        break;

                    case 4:
                        continuar = false;
                        System.out.println();
                        System.out.println("Thank you for using our bank!!!");
                        break;

                    default:
                        System.out.println("Invalid Option!");
                }
                System.out.println(operations);
            }
        }
        catch (ValorInvalido e) {
            System.out.println("Error: " + e.getMessage());
        }
       finally {
            sc.close();
        }
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;
        double balance = 0;
        double depositedMoney;
        double withdrawMoney;

        do{
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            if(choice == 1){
                System.out.print("Your current balance is ");
                System.out.print(showBalance(balance));
                System.out.println();
            }
            else if(choice == 2){
                System.out.print("Enter an amount to be deposited: ");
                depositedMoney = scanner.nextDouble();

                if(depositedMoney < 0){
                    System.out.print("You must deposit greater than 0!");
                }
                else{
                    balance = deposit(balance, depositedMoney);
                    System.out.print("Your current balance: " + balance);
                }
            }
            else if(choice == 3){
                System.out.print("Enter an amount to withdraw: ");
                withdrawMoney = scanner.nextDouble();

                if(withdrawMoney < 0){
                    System.out.println("You cannot draw less than 0");
                }
                else if(withdrawMoney > balance){
                    System.out.print("You don't enough money for withdraw");
                }
                else{
                    balance = withdraw(balance, withdrawMoney);
                    System.out.print("Your current balance: " + balance);
                }
            }
            else if(choice == 4){
                System.out.print("Have a nice day!");
            }
            else{
                System.out.print("Please enter 1-4");
            }

        }while(choice != 4);

    }
        static double showBalance(double balance){
            return balance;
        }
        static double deposit(double balance, double depositedMoney){
            return balance += depositedMoney;
        }
        static double withdraw(double balance, double withdrawMoney){
            return balance -= withdrawMoney;
        }


    }

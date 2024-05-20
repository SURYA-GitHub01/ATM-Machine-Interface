import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("ATM Machine");
        System.out.println();


        int Withdraw;
        int Deposit;
        int Balance=10000;

        System.out.println("Balance: "+ Balance);
        System.out.println();



        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for EXIT");

        System.out.println();

        System.out.println("Choose the Operation: ");
        int Operation= input.nextInt();

        System.out.println();


        if(Operation==1){
            System.out.println("Enter the Amount to be Withdraw: ");
            Withdraw= input.nextInt();
            if(Withdraw<=Balance) {
                Balance = Balance - Withdraw;
                System.out.println();
                System.out.println("Your Amount Withdraw Successfully...");
            }
            else{
                System.out.println();
                System.out.println("Insufficient Amount");
            }
        }
        else if(Operation==2){
            System.out.println("Enter the Amount to be Deposit");
            Deposit= input.nextInt();
            Balance=Balance+Deposit;
            System.out.println();
            System.out.println("Your Amount Deposited Successfully...");
        }
        else if(Operation==3){
            System.out.println("Your Current Balance: "+ Balance);
            System.out.println("           EXIT");
            System.out.println();
            System.out.println("!!Thank You For Banking With As!!");
        }
        else if (Operation==4){
            System.out.println("Your Current Balance: " + Balance);
            System.out.println();
            System.out.println("           EXIT");
            System.out.println();
            System.out.println("!!Thank You For Banking With As!!");
        }
        else{
            System.out.println("!!!Enter the Correct Operation!!!");
        }

        if(Operation!=3 && Operation!=4) {
            System.out.println();
            System.out.println("Your Current Balance: " + Balance);
            System.out.println();
            System.out.println("           EXIT");
            System.out.println();
            System.out.println("!!Thank You For Banking With As!!");
        }


    }
}
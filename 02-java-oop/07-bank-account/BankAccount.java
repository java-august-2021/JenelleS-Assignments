import java.util.Random;
import java.util.ArrayList;

public class BankAccount {

    private double checkingBal;
    private double savingsBal;
    private String accountNumber;
    private static int numOfAccts = 0;
    private static int totalMoneyStored = 0; //in every account created
    
    //constructor
    public BankAccount() {
        numOfAccts++;
        this.accountNumber= accountNumber();
    }

    public String accountNumber(){
        //need an string with 10 spots
        //loop into and populate string w/ 10 random numbers

        String acctNumber = new String();
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            acctNumber += Integer.toString(r.nextInt(9));
            //Do not store in a variable it will store one random number
        }
        System.out.println(acctNumber);
        return acctNumber;
    }

    public double depositChecking(double deposit){
        checkingBal += deposit;
        System.out.println(deposit + " was added to your checkings. Total in Checkings is " + checkingBal);
        totalMoneyStored += deposit;
        return checkingBal;
    }

    public double depositSaving(double deposit){
        savingsBal += deposit;
        System.out.println(deposit + " was added to your savings. Total in Savings is " + savingsBal);
        totalMoneyStored += deposit;
        return savingsBal;
    }

    public double withdrawlChecking(double withdrawl){
        if(checkingBal < withdrawl){
            System.out.println("Insufficient funds.");
        } else {
            checkingBal -= withdrawl;
            System.out.println(withdrawl + " was withdrawn from your checking. Total in Checking is " + checkingBal);
            totalMoneyStored -= withdrawl;
        }
            return checkingBal;
    }

    public double withdrawlSaving(double withdrawl){
        if(savingsBal < withdrawl){
            System.out.println("Insufficient funds.");
        } else {
            savingsBal -= withdrawl;
            System.out.println(withdrawl + " was withdrawn from your savings. Total in Savings is " + savingsBal);
            totalMoneyStored -= withdrawl;
        }
        return savingsBal;
    }

    public void accountDetails(){
        System.out.println( checkingBal + " in Checking and " + savingsBal + " in Savings. ");
        System.out.println("Total money in the entire bank " + totalMoneyStored);
        System.out.println(accountNumber);
    }


    //getters and setters
    public double getCheckingBal() {
        return checkingBal;
    }

    public double getSavingsBal() {
        return savingsBal;
    }

    public static int getNumOfAccts() {
        return numOfAccts;
    }
    
    public static int getTotalMoneyStored() {
        return totalMoneyStored;
    }
    
}

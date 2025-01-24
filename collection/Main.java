import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "AYHAN KURT", 1500.0);
        BankAccount a2 = new BankAccount(102, "ALİ BRAVO", 2000.0);
        BankAccount a3 = new BankAccount(103, "CEMRE KIRAN", 1200.0);
        BankAccount a4 = new BankAccount(104, "DAMLA YAĞAN", 1800.0);


        ArrayList<BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);


        Collections.sort(myAccounts);


        for (BankAccount account : myAccounts) {
            account.balanceChange(500);
        }


        for (BankAccount account : myAccounts) {
            System.out.println(account);
        }
    }
}


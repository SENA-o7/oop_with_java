public class BankAccount implements Comparable<BankAccount> {
    private int accountNo;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

   
    public void balanceChange(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for account: " + accountNo);
        }
    }

    
    public String getHolderName() {
        return holderName;
    }

    
    @Override
    public String toString() {
        return "Hesap NO: " + accountNo + ", HesapAdı: " + holderName + ", Bütçe " + balance;
    }
    
    @Override
    public int compareTo(BankAccount other) {
        return this.holderName.compareTo(other.holderName);
    }
}

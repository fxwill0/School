//Superclass
public class bank_Account {
    //Fields
    public String firstName;
    public String lastName;
    public int accountID;
    public double balance;

    //Methods

    //Constructor
    public bank_Account (String firstName, String lastName, int accountID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0.00;
    }
    //Deposit
    public void deposit(double amount) {
        balance += amount;
    }
    //Withdrawal
    public void withdrawal (double amount) {
        if (amount <= balance){
            balance -= amount;
        }
       else{
            System.out.println("Insufficient Funds");
        }
    }
    //Setters

    //firstName
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
   //lastName
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //accountID
    public void setAccountID(int accountID){
        this.accountID = accountID;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    //Getters

    //firstName
    public String getFirstName() {
        return firstName;
    }
    //lastName
    public String getLastName() {
        return lastName;
    }
    //accountID
    public int getAccountID(){
        return accountID;
    }

    //getbalance
    public double get_balance(){
        return balance;
    }

    //accountSummary
    public void accountSummary(){
        System.out.println("Account Holder First Name: " + firstName);
        System.out.println("Account Holder Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Account Balance: " + balance);

    }
















}

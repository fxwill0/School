public class checking_Account extends bank_Account{

    double interestRate;
    public static final double overdraft_Fee = 30.00;
    //Constructor
    public checking_Account(String firstName, String lastName, int accountID, double interestRate){
        super(firstName,lastName,accountID);
        this.interestRate = interestRate;
    }

    //processWithdrawal
    @Override
    public void withdrawal (double amount){

        if(amount <= get_balance()){
          super.withdrawal(amount);
        }
        else {
            super.setBalance(balance -= amount + 30);
            System.out.println("Insufficient Funds: A 30$ OD Fee has been applied to your account");
        }
        }
   //accountSummarywithinterestrate
    @Override
       public void accountSummary(){
        System.out.println("Account Holder First Name: " + firstName);
        System.out.println("Account Holder Last Name: " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Account Balance: " + balance);
        System.out.println("Account Interest Rate: " + interestRate + " %");

    }
    }

class callClass {

    public static void main(String[] args) {
   checking_Account test = new checking_Account("Vilius", "Stankevicius", 88888888,10);
       test.accountSummary();
       test.withdrawal(101.00);
       test.accountSummary();
       test.deposit(31.00);
       test.accountSummary();
       test.withdrawal(101.00);
       test.accountSummary();
       test.withdrawal(101.00);
       test.accountSummary();



    }



}
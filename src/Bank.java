public class Bank {
    private int balance =10000;
    public void withdrawl(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Cannot withdraw the amount insufficient balance!!!");

        }
        else{
            balance= balance-amount;
            System.out.println("The amount is wihdrawl successfully and the remaining balance is : "+balance);

        }

    }
}

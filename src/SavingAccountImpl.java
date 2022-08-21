public class SavingAccountImpl {
    public static void main(String[] args) {
    SavingAccount object = new SavingAccount(123654789,"12/02/2005","self","yes",50000.56,50000.56,5.1,5.2);
    recurringDepositAccount object1 = new recurringDepositAccount(147852369,"23/05/2000","joint","no",60000.00, 60000.00,10.1,"01/01/2025",50);
    object.display();
    object.deposit(5000);
    object.withdraw(1000);
    System.out.println(" ");
    object1.display();
    }
}

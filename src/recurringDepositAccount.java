public class recurringDepositAccount extends BankAccount{

    private String closingDate;
    private double duration;

    public recurringDepositAccount(int accountNumber, String accountOpeningDate, String modeOfOperation, String ifInternetBankingIsAvailable, double totalBalance, double availableBalance, double rateOfInterest, String closingDate, double duration) {
        super(accountNumber, accountOpeningDate, modeOfOperation, ifInternetBankingIsAvailable, totalBalance, availableBalance, rateOfInterest);
        this.closingDate = closingDate;
        this.duration = duration;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public  void display(){

        System.out.println("Account Number = " + getAccountNumber());
        System.out.println("Account Opening date = " + getAccountOpeningDate());
        System.out.println("Mode of Operation = " + getModeOfOperation());
        System.out.println("Internet Banking Is Available or Not = " + getIfInternetBankingIsAvailable());
        System.out.println("Total balance = " + getTotalBalance());
        System.out.println("Available Balance = " + getAvailableBalance());
        System.out.println("Rate of Interest = " + getRateOfInterest());
        System.out.println("Closing Date = " + getClosingDate());
        System.out.println("Duration = " + getDuration());
    }
}

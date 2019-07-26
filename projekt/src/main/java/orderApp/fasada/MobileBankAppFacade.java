package orderApp.fasada;

public class MobileBankAppFacade {
    private MobileBankApp mobileBankApp;
    private BankSystem bankSystem;

    public MobileBankAppFacade() {
        mobileBankApp = new MobileBankApp();
        bankSystem = new BankSystem();
    }

    public void makePayment() {
        mobileBankApp.enterPin();
        if (bankSystem.validatePin() && bankSystem.validateTransaction()) {
            mobileBankApp.makePayment();
        }
    }
}

package entities;

public class SavingsAccount extends Account{

    private Double interestRate;

    //MÉTODO CONSTRUTOR SEM ARGUMENTOS
    public SavingsAccount() {
        super();
    }

    //MÉTODO CONSTRUTORE COM ARGUMENTOS
   public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    //MÉTODO FUNÇÃO
    public void updateBalance() {
        balance += balance * interestRate;
    }
}

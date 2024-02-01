package entities;

public class Account {

    //DECLARAÇÃO DOS ATRIBUTOS DA CLASSE
    private Integer number;
    private String holder;
    protected Double balance;

    //MÉTODO CONSTRUTOR SEM ARGUMENTOS
    public Account() {

    }

    //MÉTODO CONSTRUTOR COM ARGUMENTOS
    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    //MÉTODOS GETTERS AND SETTERS

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    //MÉTODOS FUNÇÃO

    public void withDraw(double amount) {
        balance -= amount;
    }

    public void deposit (double amount) {
        balance += amount;
    }
}

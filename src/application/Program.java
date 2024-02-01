package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        //INSTANCIANDO O OBJETO ACCOUNT
        Account acc = new Account(1001, "Alex", 0.0);

        //INSTANCIANDO O OBJEO BUSINESSACCOUNT
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //EXEMPLOS DE UPCASTING
        //converter um objeto da subclass para a superclasse
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 0.01);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //EXEMPLOS DE DOWNCASTING
        //converter um objeto da superclasse para a subclasse
        /*
        Exemplo 01:
         # criar uma variável do tipo BusinessAccount acc4
         recebendo o valor da variável acc2
                - mesmo tendo instanciado a variável Account acc2 recebendo o valor de new Business
                o tipo da variável acc2 ainda é Account
                - não há conversão de tipos de variáveis
                - é necessário fazer um casting manual
                - colocar o tipo da subclasse () antes da variavel
          */
        //RESOLUÇÃO EXEMPLO 01
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        /*
        Exemplo 02:
         # criar uma variável acc5 recebendo o valor da variável acc3
                - ao tentar realizar o casting manual BussinessAccount acc5
                recebendo acc3, ocasionará em um erro ao executar o programa,
                pois a variável acc3 é do tipo SavingsAccount

                BusinessAccount acc5 = (BusinessAccount) acc3; -> GERA ERRO AO EXECUTAR

                - necessário criar um teste para saber se o objeto acc3
                é do tipo BusinessAccount ou do tipo SavingsAccount com instaceof
         */
        //RESOLUÇÃO EXEMPLO 02
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}

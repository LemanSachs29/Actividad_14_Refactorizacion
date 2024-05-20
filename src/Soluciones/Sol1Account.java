/*
 * Este es un caso claro en el que la técnica de refactorización debe ser la de encapsular
 * atributos. Encontramos un código con dos atributos con acceso público. Lo que debemos
 * hacer es cambiar el acceso a privado, y crear métodos get y set para poder acceder a los
 * mismos
 */
package Soluciones;public class Sol1Account {

     private String accountNumber;
     private double balance;

    public Sol1Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

   
}

/**
 *
 * @author Juan Blanco Moyano
 */


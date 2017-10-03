/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.clientmanagement;

/**
 *
 * @author user
 */
public class PaymentHistory {
    
    private String payment;
    private String status;
    private Person personPayment;

    /**
     * @return the payment
     */
    
    
    public PaymentHistory(String payment, String status, Person personPayment) {
        this.payment = payment;
        this.status = status;
        this.personPayment = personPayment;
    }

    public String getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(String payment) {
        this.payment = payment;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the personPayment
     */
    public Person getPersonPayment() {
        return personPayment;
    }

    /**
     * @param personPayment the personPayment to set
     */
    public void setPersonPayment(Person personPayment) {
        this.personPayment = personPayment;
    }
    
    
    
}

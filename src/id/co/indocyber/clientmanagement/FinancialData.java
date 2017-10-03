/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.clientmanagement;

import java.util.Date;

/**
 *
 * @author user
 */
public class FinancialData {

    private double gaji;
    private double bonus;
    private double loanLimit;
    private int tenor;
    private Date loanDueDate;
    private Person person;

    public FinancialData() {
    }

    public FinancialData(double gaji, double bonus, double loanLimit, int tenor, Date loanDueDate) {
        this.gaji = gaji;
        this.bonus = bonus;
        this.loanLimit = loanLimit;
        this.tenor = tenor;
        this.loanDueDate = loanDueDate;
    }


    /**
     * @return the gaji
     */
    public double getGaji() {
        return gaji;
    }

    /**
     * @param gaji the gaji to set
     */
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * @return the loanLimit
     */
    public double getLoanLimit() {
        return loanLimit;
    }

    /**
     * @param loanLimit the loanLimit to set
     */
    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    /**
     * @return the tenor
     */
    public int getTenor() {
        return tenor;
    }

    /**
     * @param tenor the tenor to set
     */
    public void setTenor(int tenor) {
        this.tenor = tenor;
    }

    /**
     * @return the loanDueDate
     */
    public Date getLoanDueDate() {
        return loanDueDate;
    }

    /**
     * @param loanDueDate the loanDueDate to set
     */
    public void setLoanDueDate(Date loanDueDate) {
        this.loanDueDate = loanDueDate;
    }

}

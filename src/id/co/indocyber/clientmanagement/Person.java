/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.clientmanagement;

import java.util.Date;
import java.util.List;

/**
 *
 * @author user
 */
public class Person {
    private String nama;
    private String gender;
    private Boolean married;
    private Integer age;
    private Date tglLahir;
    private String alamat;
    private String noHandphone;
    private String pekerjaan;
    private FinancialData personFD;
    private List<PaymentHistory> paymentH;

    public Person(String nama, String gender, Boolean married, Integer age, Date tglLahir, String alamat, String noHandphone, String pekerjaan, FinancialData personFD) {
        this.nama = nama;
        this.gender = gender;
        this.married = married;
        this.age = age;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.noHandphone = noHandphone;
        this.pekerjaan = pekerjaan;
        this.personFD = personFD;
    }
    
    

    public Person() {
    }

    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the married
     */
    public Boolean getMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(Boolean married) {
        this.married = married;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the tglLahir
     */
    public Date getTglLahir() {
        return tglLahir;
    }

    /**
     * @param tglLahir the tglLahir to set
     */
    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the noHandphone
     */
    public String getNoHandphone() {
        return noHandphone;
    }

    /**
     * @param noHandphone the noHandphone to set
     */
    public void setNoHandphone(String noHandphone) {
        this.noHandphone = noHandphone;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the personFD
     */
    public FinancialData getPersonFD() {
        return personFD;
    }

    /**
     * @param personFD the personFD to set
     */
    public void setPersonFD(FinancialData personFD) {
        this.personFD = personFD;
    }

    /**
     * @return the paymentH
     */
    public List<PaymentHistory> getPaymentH() {
        return paymentH;
    }

    /**
     * @param paymentH the paymentH to set
     */
    public void setPaymentH(List<PaymentHistory> paymentH) {
        this.paymentH = paymentH;
    }
}

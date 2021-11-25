package com.example.demo.domain;

import com.example.demo.dto.FeeType;
import com.example.demo.dto.PaymentMode;

import javax.persistence.*;
import java.util.Objects;

@Entity(name="Fee_Detail")
public class FeeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long id;

    @Column(name="Loan_Id")
    private String loanId;
    @Column(name="Fee_Type")
    private FeeType feeType;
    @Column(name="Payment_Mode")
    private PaymentMode paymentMode;
    @Column(name="Amount")
    private double amount;
    @Column(name="CGST")
    private double cgst;
    @Column(name="SGST")
    private double sgst;
    @Column(name="IGST")
    private double igst;
    @Column(name="CESS")
    private double cess;
    @Column(name="Total_Amount")
    private double totalAmount;

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCgst() {
        return cgst;
    }

    public void setCgst(double cgst) {
        this.cgst = cgst;
    }

    public double getSgst() {
        return sgst;
    }

    public void setSgst(double sgst) {
        this.sgst = sgst;
    }

    public double getIgst() {
        return igst;
    }

    public void setIgst(double igst) {
        this.igst = igst;
    }

    public double getCess() {
        return cess;
    }

    public void setCess(double cess) {
        this.cess = cess;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeeDetail feeDetail = (FeeDetail) o;
        return id == feeDetail.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}









/*   table x
    sno     codevalue       description     auth level

    table y
    sno     deviation

    Not accepted

 */


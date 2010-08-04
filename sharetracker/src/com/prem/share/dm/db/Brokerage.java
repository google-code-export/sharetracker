package com.prem.share.dm.db;

import java.io.Serializable;
import java.math.BigDecimal;

public class Brokerage implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column brokerage.id
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private Integer id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column brokerage.security_type
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private String securityType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column brokerage.transaction_type
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private String transactionType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column brokerage.trade_type
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private String tradeType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column brokerage.brokerage_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private BigDecimal brokerageCharge;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column brokerage.service_tax_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private BigDecimal serviceTaxCharge;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column brokerage.stt_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private BigDecimal sttCharge;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column brokerage.stamp_duty_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private BigDecimal stampDutyCharge;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column brokerage.transaction_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private BigDecimal transactionCharge;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table brokerage
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column brokerage.id
     *
     * @return the value of brokerage.id
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column brokerage.id
     *
     * @param id the value for brokerage.id
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column brokerage.security_type
     *
     * @return the value of brokerage.security_type
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public String getSecurityType() {
        return securityType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column brokerage.security_type
     *
     * @param securityType the value for brokerage.security_type
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public void setSecurityType(String securityType) {
        this.securityType = securityType == null ? null : securityType.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column brokerage.transaction_type
     *
     * @return the value of brokerage.transaction_type
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column brokerage.transaction_type
     *
     * @param transactionType the value for brokerage.transaction_type
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType == null ? null : transactionType.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column brokerage.trade_type
     *
     * @return the value of brokerage.trade_type
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column brokerage.trade_type
     *
     * @param tradeType the value for brokerage.trade_type
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column brokerage.brokerage_charge
     *
     * @return the value of brokerage.brokerage_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public BigDecimal getBrokerageCharge() {
        return brokerageCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column brokerage.brokerage_charge
     *
     * @param brokerageCharge the value for brokerage.brokerage_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public void setBrokerageCharge(BigDecimal brokerageCharge) {
        this.brokerageCharge = brokerageCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column brokerage.service_tax_charge
     *
     * @return the value of brokerage.service_tax_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public BigDecimal getServiceTaxCharge() {
        return serviceTaxCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column brokerage.service_tax_charge
     *
     * @param serviceTaxCharge the value for brokerage.service_tax_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public void setServiceTaxCharge(BigDecimal serviceTaxCharge) {
        this.serviceTaxCharge = serviceTaxCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column brokerage.stt_charge
     *
     * @return the value of brokerage.stt_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public BigDecimal getSttCharge() {
        return sttCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column brokerage.stt_charge
     *
     * @param sttCharge the value for brokerage.stt_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public void setSttCharge(BigDecimal sttCharge) {
        this.sttCharge = sttCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column brokerage.stamp_duty_charge
     *
     * @return the value of brokerage.stamp_duty_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public BigDecimal getStampDutyCharge() {
        return stampDutyCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column brokerage.stamp_duty_charge
     *
     * @param stampDutyCharge the value for brokerage.stamp_duty_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public void setStampDutyCharge(BigDecimal stampDutyCharge) {
        this.stampDutyCharge = stampDutyCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column brokerage.transaction_charge
     *
     * @return the value of brokerage.transaction_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public BigDecimal getTransactionCharge() {
        return transactionCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column brokerage.transaction_charge
     *
     * @param transactionCharge the value for brokerage.transaction_charge
     *
     * @ibatorgenerated Wed Aug 04 18:25:48 GMT+05:30 2010
     */
    public void setTransactionCharge(BigDecimal transactionCharge) {
        this.transactionCharge = transactionCharge;
    }
}
//package com.organization.entity;
//
//
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "cards")
//public class Card {
//
//    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
//    private Long id;
//
//    @Column(name = "card_number")
//    private String cardNumber;
//
//    @OneToOne(mappedBy = "bank_accounts", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private BankAccount bankAccount;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    private Customer customer;
//
//    public Card(){
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getCardNumber() {
//        return cardNumber;
//    }
//
//    public void setCardNumber(String cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    public BankAccount getBankAccount() {
//        return bankAccount;
//    }
//
//    public void setBankAccount(BankAccount bankAccount) {
//        this.bankAccount = bankAccount;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//}

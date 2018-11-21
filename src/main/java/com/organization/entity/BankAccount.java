//package com.organization.entity;
//
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.math.BigDecimal;
//
//@Entity
//@Table(name = "bank_accounts")
//public class BankAccount {
//
//    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
//    private Long id;
//
//    @Column(name = "account", nullable = false, unique = true)
//    private String account;
//
//    @Column(name = "deposit", nullable = false)
//    private BigDecimal deposit;
//
//    @Column(name = "credit", nullable = false)
//    private BigDecimal credit;
//
//    @Column(name = "state", nullable = false)
//    private Boolean state;
//
//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private Card card;
//
//    public BankAccount() {
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
//    public String getAccount() {
//        return account;
//    }
//
//    public void setAccount(String account) {
//        this.account = account;
//    }
//
//    public BigDecimal getDeposit() {
//        return deposit;
//    }
//
//    public void setDeposit(BigDecimal deposit) {
//        this.deposit = deposit;
//    }
//
//    public BigDecimal getCredit() {
//        return credit;
//    }
//
//    public void setCredit(BigDecimal credit) {
//        this.credit = credit;
//    }
//
//    public Boolean getState() {
//        return state;
//    }
//
//    public void setState(Boolean state) {
//        this.state = state;
//    }
//
//    public Card getCard() {
//        return card;
//    }
//
//    public void setCard(Card card) {
//        this.card = card;
//    }
//}

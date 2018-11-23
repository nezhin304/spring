package com.organization.entity;


import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @Column(name = "card_number")
    private String cardNumber;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

//    @OneToOne(mappedBy = "bank_accounts", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private BankAccount bankAccount;

    public Card(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

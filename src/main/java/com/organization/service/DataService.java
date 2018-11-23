package com.organization.service;

import com.organization.entity.Card;
import com.organization.entity.Customer;
import com.organization.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;


@Service
public class DataService {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    public void createCustomer(String name, String surname, String phone, String cardNumber) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setSurname(surname);
        customer.setPhone(phone);
        Card card = new Card();
        card.setCardNumber(cardNumber);
        card.setCustomer(customer);
        customer.setCard(card);

        this.customerRepository.save(customer);
    }

    @Transactional
    public Collection<Customer> getAll() {

        return new ArrayList<>(this.customerRepository.findAll());
    }

}

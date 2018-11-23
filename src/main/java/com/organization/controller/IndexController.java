package com.organization.controller;

import com.organization.entity.Card;
import com.organization.entity.Customer;
import com.organization.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    DataService dataService;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("action", "/customers");
        return mav;
    }

    @RequestMapping(value="/customers", method = RequestMethod.POST)
    public ModelAndView createCustomer(
              @RequestParam("name") String name
            , @RequestParam("surname") String surname
            , @RequestParam("phone") String phone
            , @RequestParam("cardNumber") String cardNumber){

       this.dataService.createCustomer(name, surname, phone, cardNumber);
       ModelAndView mav = new ModelAndView();
       mav.setViewName("ok");
       return mav;
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public ModelAndView getCustomers() {
        Collection<Customer> customers = this.dataService.getAll();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("answer");
        mav.addObject("list", customers);
        return mav;
    }

}
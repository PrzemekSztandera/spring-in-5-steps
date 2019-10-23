package com.in28minutes.springbasics.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    @Inject
    SomeCdiDAO someCdiDAO;

    public SomeCdiDAO getSomeCdiDAO() {
        return someCdiDAO;
    }

    public void setSomeCdiDAO(SomeCdiDAO someCdiDAO) {
        this.someCdiDAO = someCdiDAO;
    }

    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[] data = someCdiDAO.getData();

        for (int datum : data) {
            if(datum > greatest) {
                greatest = datum;
            }
        }
        return greatest;
    }

}

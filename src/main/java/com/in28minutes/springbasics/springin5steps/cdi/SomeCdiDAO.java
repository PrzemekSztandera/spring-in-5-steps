package com.in28minutes.springbasics.springin5steps.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class SomeCdiDAO {

    public int[] getData() {
        return new int[] {5, 89, 100};
    }
}

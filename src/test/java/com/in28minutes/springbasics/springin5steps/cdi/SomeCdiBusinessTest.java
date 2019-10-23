package com.in28minutes.springbasics.springin5steps.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    // Create mock
    @Mock
    SomeCdiDAO someCdiDAO;

    // Inject mock
    @InjectMocks
    SomeCdiBusiness someCdiBusiness;



    @Test
    public void testBasicScenario() {
        // when daoMock.getData() method is called return int[]{2,4}
        when(someCdiDAO.getData()).thenReturn(new int[]{2, 4});
        assertEquals(4, someCdiBusiness.findGreatest());
    }
}
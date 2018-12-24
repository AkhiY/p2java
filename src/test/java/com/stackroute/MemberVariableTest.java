package com.stackroute.unittest.testp2assign;

import com.stackroute.unittest.p2assign.MemberVariable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable memberVariable=null;
    @Before
    public void setUp() throws Exception {
        memberVariable = new MemberVariable("Kalpesh",22,24000);
    }

    @Test
    public void test1()
    {
        assertEquals("Member name: Kalpesh"/n "Mamber age: 22"/n"Member salary: 24000",mamberVariable.display());
    }

}

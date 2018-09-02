package com.vartoksoma.codecool.stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    void testGetMaxSize(){
        Stack stack = new Stack(3);
        assertEquals(3, (int)stack.getMaxStackSize());
    }

    @Test
    void testGetFreeSpace(){
        Stack stack = new Stack(2);
        stack.push(2);
        assertEquals(1, (int)stack.getFreeSpace());
    }

    @Test
    void testAdd(){
        Stack stack = new Stack(2);
        stack.push(2);
        assertEquals(2, (int) stack.peek());
    }

    @Test
    void testPop(){
        Stack stack = new Stack(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        assertEquals(2, (int)stack.getFreeSpace());
    }
}

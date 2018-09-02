package com.vartoksoma.codecool.stack;

import com.vartoksoma.codecool.stack.exception.StackOverflowException;
import com.vartoksoma.codecool.stack.exception.StackUnderflowException;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stack;
    private Integer maxSize;

    public Stack(Integer size) {
        this.stack = new ArrayList<>(size);
        this.maxSize = size;
    }

    public void push(Integer element){
        try {
            if (stack.size() < maxSize) {
                stack.add(0, element);
            }else{
                throw new StackOverflowException("stack is full");
            }
        }catch (StackOverflowException e){
            e.printStackTrace();
        }

    }
}

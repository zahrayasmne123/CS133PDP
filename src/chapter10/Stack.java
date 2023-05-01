package chapter10;

import java.util.NoSuchElementException;

public class Stack {
    public int[] elements;
    public int size;
    public static final int DEFAULT_CAPACITY = 16;

    public Stack(){
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity){
        elements = new int[capacity];
    }

    public void push(int value){
        if (size >= elements.length){
            int[] temp = new int[elements.length*2];
            for (int i=0; i<elements.length;i++){
                temp[i]=elements[i];
            }
            elements = temp;
        }
        //adds value to index of size +1
        elements[size++] = value;
    }

    //returns removed element  (not remaining array!)
    public int pop(){
        if (size!=0)
            return elements[--size];
        else
            throw new NoSuchElementException("Stack is empty");

    }

    //returns top element from stack (size - 1 because it is an array)
    public int peek(){
        return elements[size -1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString(){
        String string = "[";
        for (int i=0;i<size;i++){
            string+=elements[i];
        }
        string+="]";
        return string;
    }
}


package chapter10;

public class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Queue(){
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity){
        elements = new int[capacity];
        size = 0;
    }

    public void enqueue(int v){
        if (size == elements.length){
            int[] temp = new int[elements.length*2];
            for (int i=0; i<elements.length;i++){
                temp[i]=elements[i];
            }
            elements = temp;
        }
        elements[size++] = v;
    }

    public int deqeueue(){
       return elements[--size];
    }

    public boolean isEmpty(){
        return (size ==0);
    }

    public int getSize(){
        return size;
    }

    public String toString(){
        String string = "[";
        for(int i=0;i<size;i++){
            string+=elements[i];
        }
        string +="]";
        return string;
    }



}

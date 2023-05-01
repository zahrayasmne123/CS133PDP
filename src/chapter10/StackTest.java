package chapter10;

public class StackTest {
    public static void main(String[] args){

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        System.out.println(stack);
    }

}

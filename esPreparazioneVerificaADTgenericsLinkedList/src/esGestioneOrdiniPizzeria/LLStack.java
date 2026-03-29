package esGestioneOrdiniPizzeria;

import java.util.LinkedList;

public class LLStack<T> implements Stack<T> {

    private LinkedList<T> stack;

    LLStack() {
        stack = new LinkedList<>();
    }

    @Override
    public T pop() {
        return stack.removeFirst(); // delete head
    }

    @Override
    public void push(T element) {
        stack.addFirst(element);
    }

    @Override
    public T peek() {
        return stack.getFirst(); // get head
    }

    @Override
    public int count() {
        return stack.size();
    }
    @Override
    public String show(){
        return "";
    }
}

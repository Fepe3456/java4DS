public class LLStack<T> implements Stack<T>{

    private LinkedList stack ;
    private int dl;

    LLStack(){
        stack = new LinkedList();
        dl = 0;
    }

    @Override
    public void pop() {
        stack.deleteHead();
        dl--;
    }

    @Override
    public void push(T element) {
        stack.prepend(element);
        dl++;
    }

    @Override
    public Node<T> peek() {
        return stack.getHead().getNext();
    }

    @Override
    public int count() {
        return dl;
    }
}

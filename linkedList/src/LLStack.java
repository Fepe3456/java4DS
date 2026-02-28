public class LLStack<T> implements Stack<T>{

    private LinkedList<T> stack ;
    private int dl;

    LLStack(){
        stack = new LinkedList<>();
        dl = 0;
    }

    @Override
    public T pop() {
        dl--;
        return stack.deleteHead();
    }

    @Override
    public void push(T element) {
        stack.prepend(element);
        dl++;
    }

    @Override
    public T peek() {
        return stack.getHead().getData();
    }

    @Override
    public int count() {
        return dl;
    }

    public String toString(){
        Node<T> current = stack.getHead();
        String str = "";

        while (current != null ) {
            str += current.getData() + " ";
            current = current.getNext();
        }
        return str;
    }
}

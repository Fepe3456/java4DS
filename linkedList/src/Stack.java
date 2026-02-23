public interface Stack<T> {
    void pop();
    void push(T element);
    Node<T> peek();
    int count();
}

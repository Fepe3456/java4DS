package esGestioneOrdiniPizzeria;

public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();
    int count();
    String show();
}

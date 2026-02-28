public class Node<T> {

    private Node<T> next;
    private T data;

    Node(T data){
        this.data = data;
        this.next = null;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
    public Node<T> getNext(){
        return this.next;
    }

}
public class Node<T> {

    private Node<T> next;
    private T data;

    Node(T data) {
        this.data = data;
        next = null;
    }

    public Node getNext(){
        return next;
    }
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }

}

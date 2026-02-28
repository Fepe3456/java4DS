public class LinkedList<T> {

    private Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void prepend(T value){
        Node<T> newHead = new Node(value);
        newHead.setNext(head);
        head = newHead;
    }

    public void append(T element){
        Node<T> node = new Node(element);
        if( head == null ){ //If it's the first element
            head = node;
        }
        else{
            Node<T> current = head;
            while( current.getNext() != null ){
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public void deleteWithValue(T value){
        if( head != null ){
            if( head.getData().equals(value) ){
                head = head.getNext();
            }
            else {
                Node current = head;
                while (current.getNext() != null) {
                    if (current.getNext().getData().equals(value)) {
                        current.setNext(current.getNext().getNext());
                        current = null;
                    }
                    current = current.getNext();
                }
            }
        }
    }

    public T deleteHead() throws LinkedListException{
        T data = null;
        if( head != null ){
            data = head.getData();
            head = head.getNext();
            return data;
        }
        return data;
    }

    public Node<T> getHead(){
        return this.head;
    }

    public String toString(){
        String str = "LinkedList {";
        if( head==null ){
            str = "The LinkedList is empty!";
        }
        else{
            Node<T> current = head;
            while( current != null ){
                str += "\n     Data: " + current.getData();
                current = current.getNext();
            }
            str += "\n}";
        }
        return str;
    }

}
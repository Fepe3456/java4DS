public class LinkedList {

    private Node head;

    LinkedList(){
        head = new Node(-1);
        head.setNext( null );
    }

    public <T> void append(T element){
        if( head.getNext() == null ){ //If the list is empty
            Node node = new Node(element);
            node.setNext( null );
            head.setNext( node );
        }
        else{
            Node current = head.getNext();
            while( current.getNext() != null ){
                current = current.getNext();
            }
            Node newNode = new Node(element);
            newNode.setNext( current.getNext() );
            current.setNext( newNode );
        }
    }

    public <T> void prepend(T element){
        if( head.getNext() == null ){ //If the list is empty
            Node node = new Node(element);
            node.setNext( null );
            head.setNext( node );
        }
        else{ //If the list is not empty
            Node node = new Node(element);
            node.setNext( head.getNext() );
            head.setNext( node );
        }
    }

    public void deleteHead(){
        Node first = head.getNext();
        head.setNext( first.getNext() );
    }

    public <T> void deleteWithValue(T value) throws LinkedListException{
        if( head.getNext() != null ){ //If the list is not empty
            Node current = head.getNext();
            Node next = current.getNext();
            while( current.getNext() != null ){
                if( next.getData() == value ){
                    current.setNext( next.getNext() );
                }
                current = current.getNext();
                next = current.getNext();
            }
        }
        else{
            throw new LinkedListException("The list is empty and there is no elements to remove!");
        }
    }

    public Node getHead(){
        return head;
    }
    public void setHead(Node head){
        this.head = head;
    }

    public String toString(){
        String str = "LinkedList: ";
        if( head.getNext() == null ) { //If the list is empty
            str = "The LinkedList is empty";
        }
        else{
            Node current = head.getNext();
            while( current.getNext() != null ){
                str += "\n   " + current.getData();
                current = current.getNext();
            }
        }
        return str;
    }

}

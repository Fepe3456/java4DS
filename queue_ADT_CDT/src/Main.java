public class Main {
    public static void main(String[] args) {

        Queue<Integer> q = new ArrayQueue<>();

        try{
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);

            System.out.println( q.show() );
            q.dequeue();
            System.out.println( q.show() );
            System.out.println( q.count() );
        }catch(Exception e){
            System.out.println( e.getMessage() );
        }

    }
}
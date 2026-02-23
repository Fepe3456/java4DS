public class Main {
    public static void main(String[] args) {

        ArrayQueueEfficiente<Integer> queue = new ArrayQueueEfficiente<>(5);

        try{
            queue.enqueue(1);
            System.out.println( queue.show() );
            queue.enqueue(2);
            System.out.println( queue.show() );
            queue.enqueue(3);
            System.out.println( queue.show() );
            queue.enqueue(4);
            System.out.println( queue.show() );
            queue.enqueue(5);
            System.out.println( queue.show() );
            queue.dequeue();
            System.out.println( queue.show() );
            queue.enqueue(6);
            System.out.println( queue.show() );
            queue.dequeue();
            System.out.println( queue.show() );
            queue.dequeue();
            System.out.println( queue.show() );
            queue.dequeue();
            System.out.println( queue.show() );
            queue.dequeue();
            System.out.println( queue.show() );
            queue.dequeue();
        }catch(Exception e){
            System.out.println( e.getMessage() );
        }


        /*

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
         */

    }
}
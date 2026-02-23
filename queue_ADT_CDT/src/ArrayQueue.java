public class ArrayQueue<T> implements Queue<T> {

    private T[] queue;
    private int df, dl;

    ArrayQueue(){
        df = 10; //Established 10 as the df value
        dl = 0;
        queue = (T[]) new Object[df];
    }

    @Override
    public void enqueue(T element) {
        if( dl == df ){
            doubleArray();
        }
        queue[dl] = element;
        dl++;
    }

    @Override
    public T dequeue() throws Exception{
        if( dl==0 ){ //If the queue is empty
            throw new Exception("Queue is empty!");
        }
        T element = queue[0];
        for(int i=0; i<dl-1; i++){ //Left shift
            queue[i] = queue[i+1];
        }
        dl--;
        return element;
    }

    @Override
    public int count() {
        return dl;
    }

    @Override
    public String show() {
        String str="";
        if( dl==df ){
            str = "Queue is empty!";
        }
        else{
            for(int i=0; i<dl; i++){
                str += "   " + queue[i];
            }
        }
        return str;
    }

    private void doubleArray(){
        T[] newArray = (T[]) new Object[ df*2 ];
        for(int i=0; i<dl; i++){
            newArray[i] = queue[i];
        }
        df = df*2;
        queue = newArray;
    }

}

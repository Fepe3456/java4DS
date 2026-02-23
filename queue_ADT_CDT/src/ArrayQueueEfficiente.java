public class ArrayQueueEfficiente<T> implements Queue<T> {

    private T[] queue;
    private int df, dl, head, tail;

    ArrayQueueEfficiente(int df){
        this.df = df;
        dl = 0;
        head = -1;
        tail = -1;
        queue = (T[]) new Object[ this.df ];
    }

    public void enqueue(T element){
        if( tail == df ){
            if( head==0 ){
                doubleArray();
            }
            tail = 0;
        }
        else if( tail==head-1 ){
            doubleArray();
            tail++;
        }
        else if( dl==0 ){
            head = 0;
            tail = 0;
        }
        queue[ tail ] = element;
        dl++;
        tail++;
    }

    public T dequeue() throws EmptyQueueException {
        T ris;
        if( dl>0 ){
            ris = queue[ head ];
            queue[ head ] = null;
            if( head==df-1 ){
                head = 0;
            }
            else{
                head++;
            }
            dl--;
        }
        else{
            throw new EmptyQueueException("The queue is empty!");
        }
        return ris;
    }

    public int count(){
        return dl;
    }

    public String show(){
        String str = "Queue: ";
        int count = 0;
        for(int i=0; count<dl; count++){
            if( queue[i] == null ){
                str += "   " + "N";
            }
            else{
                str += "   " + queue[i].toString();
            }
            i++;
        }
        return str;
    }

    private void doubleArray(){
        T[] newArray = (T[]) new Object[ df*2 ];
        int index = 0;
        while( index<=tail ){
            newArray[index] = queue[index];
            index++;
        }
        index = df-1+index;
        while( index<df ){
            newArray[index] = queue[index];
            index++;
        }
        df = df*2;
        queue = newArray;
    }


}

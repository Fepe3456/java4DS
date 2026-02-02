public class Archivio<T> {

    private int maxElements;
    private T[] elements;
    private int dl;

    Archivio(int maxElements){
        this.maxElements = maxElements;
        this.dl = 0;
        elements = (T[]) new Object[ maxElements ];
    }

    public int getMaxElements(){
        return maxElements;
    }
    public int getDl(){
        return dl;
    }

    public int getNullElements(){
        return maxElements-dl;
    }

    public void addElement(T element){
        if( dl>maxElements ){
            raddoppiaArray();
        }
        elements[dl] = element;
        dl++;
    }

    public T findElementByIndex(int index) throws IndexOutOfBoundsException, Exception{
        T e;
        if( index>=0 && index<maxElements ){
            if( elements[index] != null ){
                e = elements[index];
            }
            else{
                throw new Exception("Nessun valore presente nella posizione " + index);
            }
        }
        else{
            throw new IndexOutOfBoundsException("Indice '" + index + "' non valido!");
        }
        return e;
    }

    public void removeElement(T element){
        int index = 0;
        boolean trovato = false;
        while( index<dl && !trovato){
            if( elements[index]==element ){
                trovato = true;
                for(int i=index; i<dl-1; i++){
                    elements[i] = elements[i+1];
                }
                dl--; 
            }
            else{
                index++;
            }
        }
    }

    private void raddoppiaArray(){
        T[] newArray = (T[]) new Object[ maxElements*2 ];
        for(int i=0; i<maxElements; i++){
            newArray[i] = elements[i];
        }
        maxElements *= 2;
        elements = newArray;
    }

    public String toString(){
        String str = "\nArchivio: ";
        for(int i=0; i<dl; i++){
            str += "\n   " + elements[i];
        }
        return str;
    }

}

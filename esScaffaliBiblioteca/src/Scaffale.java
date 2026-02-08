public class Scaffale {

    private int maxElements;
    private int dl;
    private Shelfable[] elements;

    Scaffale(int maxElements){
        this.maxElements = maxElements;
        dl = 0;
        elements = new Shelfable[ maxElements ];
    }

    public <T extends Shelfable> void add(T object){
        if( dl==maxElements ){
            doubleArray();
        }
        elements[dl] = object;
        dl++;
    }

    private void doubleArray(){
        Shelfable[] newArray = new Shelfable[ maxElements*2 ];
        for(int i=0; i<maxElements; i++){
            newArray[i] = elements[i];
        }
        maxElements = maxElements*2;
        elements = newArray;
    }

    public <T extends Shelfable> void remove(T object) throws ScaffaleException{
        if( dl!=0 ){
            boolean found = false;
            int index = 0;
            while( index<dl && !found ){
                if( elements[index] == object ){
                    found = true;
                }
                else{
                    index++;
                }
            }
            if( found ){
                leftShift(index);
                dl--;
            }
            else{
                throw new ScaffaleException("L'oggetto non è sullo scaffale!");
            }
        }
        else{
            throw new ScaffaleException("Non è presente nessun elemento da rimuovere sullo scaffale!");
        }
    }

    private void leftShift(int index){
        for(int i=1; i<dl; i++){
            elements[i-1] = elements[i];
        }
    }

}

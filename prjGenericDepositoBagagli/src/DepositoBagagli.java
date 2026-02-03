public class DepositoBagagli {

    private OggettoDepositabile[] elements;
    private int maxElements;
    private int dl;

    DepositoBagagli(int maxElements){
        this.maxElements = maxElements;
        dl = 0;
        elements = new OggettoDepositabile[ maxElements ];
    }

    public int getMaxElements(){
        return maxElements;
    }
    public int getDl(){
        return dl;
    }

    public <T extends OggettoDepositabile> void addElement(T object){
        if( dl>maxElements ){
            raddoppiaArray();
        }
        elements[dl] = object;
        dl++;
    }

    public <T extends OggettoDepositabile> T findElementByIndex(int index) throws IndexOutOfBoundsException, Exception{
        T e;
        if( index>=0 && index<maxElements ){
            if( elements[index] != null ){
                e = (T) elements[index];
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

    public <T extends OggettoDepositabile> void removeElement(T element){
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
        OggettoDepositabile[] newArray = new OggettoDepositabile[ maxElements*2 ];
        for(int i=0; i<maxElements; i++){
            newArray[i] = elements[i];
        }
        maxElements *= 2;
        elements = newArray;
    }

    public String toString() {
        String str = "Deposito: ";
        if (dl == 0) {
            str = "Deposito vuoto!";
        } else {
            for (int i = 0; i < dl; i++) {
                str += "\n   " + elements[i].toString();
            }
        }
        return str;
    }

}

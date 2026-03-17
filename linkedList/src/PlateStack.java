public class PlateStack {
    private LLStack<Plate> stack;

    PlateStack(){
        stack = new LLStack<>();
    }
    public void addPlate(String id){
        Plate plate = new Plate(id);
        stack.push( plate );
    }
    public Plate takePlate(){
        return stack.pop();
    }
    public Plate peekPlate(){
        return stack.peek();
    }
}

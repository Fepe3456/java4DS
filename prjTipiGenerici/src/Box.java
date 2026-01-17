public class Box<T> {

    private T content;

    Box(T content){
        setContent(content);
    }
    public void setContent(T content){
        this.content = content;
    }
    public T getContent(){
        return content;
    }

    public String toString(){
        return ( "Box content: " + getContent() );
    }

}

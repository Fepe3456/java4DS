public class Browser {
    private Page currentPage;
    private LLStack<Page> backStack;
    private LLStack<Page> forwardStack;

    Browser(Page currentPage){
        this.currentPage = currentPage;
        backStack = new LLStack<>();
        forwardStack = new LLStack<>();
    }

    public void back(){
        forwardStack.push( currentPage );
        currentPage = backStack.pop();
    }
    public void forward(){
        backStack.push( currentPage );
        currentPage = forwardStack.pop();
    }
    public Page getCurrentPage(){
        return currentPage;
    }

    public void visit(Page page){
        backStack.push(currentPage);
        currentPage = page;
        forwardStack = new LLStack<>();
    }
}

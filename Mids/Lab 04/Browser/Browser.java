package Browser;

public class Browser {
    private String[] backwardStack;
    private String[] forwardStack;
    private int backwardTop;
    private int forwardTop;

    Browser(int size){
        backwardStack=new String[size];
        forwardStack=new String[size];
        backwardTop = forwardTop = -1;
    }

    public void visitPage(String site){
        if(backwardTop<backwardStack.length-1){
            backwardStack[++backwardTop] = site;
            forwardTop = -1;
            System.out.println(site);
        }else {
            System.out.println("History full");
        }
    }
    public void back(){
        if(backwardTop>=1){
            String currSite = backwardStack[backwardTop--];
            forwardStack[++forwardTop]=currSite;
            System.out.println("Navigating back to "+backwardStack[backwardTop]);
        }else
            System.out.println("No history available");
    }
    public void forward(){
        if(forwardTop>=0){
            String nextPage = forwardStack[forwardTop--];
            backwardStack[++backwardTop]=nextPage;
            System.out.println("Navigating forward to "+nextPage);
        }else System.out.println("Can't go forward");
    }
}

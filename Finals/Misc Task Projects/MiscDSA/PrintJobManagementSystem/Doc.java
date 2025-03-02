package MiscDSA.PrintJobManagementSystem;

public class Doc{
    String title;
    String owner;
    String content;
    Doc(String title, String owner, String content){
        this.title = title;
        this.owner = owner;
        this.content = content;
    }
    Doc(){

    }
    public String toString(){
        return "Title: "+title+"\nOwner: "+owner+"\nContent: "+content+"\n";
    }
}
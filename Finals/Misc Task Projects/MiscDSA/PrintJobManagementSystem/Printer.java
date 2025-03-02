package MiscDSA.PrintJobManagementSystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Printer {
    Queue<Doc> queue;
    Printer(){
        queue = new LinkedList<>();
    }
    public void getStarted(){
        while(true){
            System.out.println("Enter 0 to display all the docs and quit");
            System.out.println("Enter 1 to add a new doc");
            System.out.println("Enter 2 to retrieve and remove the doc");
            System.out.println("Enter 3 to display all the docs");
            Scanner sc = new Scanner(System.in);
            int prompt = sc.nextInt();
            switch (prompt){
                case 0: {
//                    quit();
                    break;
                }
                case 1: {
                    add();
                    break;
                }
                case 2:{
                    dequeue();
                    break;
                }
                case 3:{
                    display();
                    break;
                }
            }
        }
    }
    public void enqueue(String title, String owner, String content){
        Doc doc = new Doc(title, owner, content);
        enqueue(doc);
    }
    private void enqueue(Doc doc){
        queue.add(doc);
    }
    private void add(){
        Doc doc = new Doc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Doc title: ");
        doc.title = sc.next();
        System.out.println("Doc owner: ");
        doc.owner = sc.next();
        sc = new Scanner(System.in);
        System.out.println("Doc content: ");
        doc.content = sc.nextLine();
        enqueue(doc);
    }
    public void dequeue(){
        queue.remove();
    }
    public void display(){
        for(Doc doc : queue)
            System.out.println(doc);
    }

}

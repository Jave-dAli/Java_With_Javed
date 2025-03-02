package MiscDSA.TaskManagement;

import java.util.Scanner;

public class TaskManagement{
    private class Task{
        String title, desc, status;
        Task(){}
        Task(String title, String desc, String status){
            this.title = title;
            this.desc = desc;
            this.status = status;
        }
        public String toString(){
            return "Title: "+title+"\nDesc: "+desc+"\nStatus: "+status;
        }
    }
    private Task[] list;
    private int idx = 0;
    TaskManagement(){
    }
    TaskManagement(int capacity){
        list = new Task[capacity];
    }
    public void getStarted(){
        boolean flag = true;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 to add a new task");
            System.out.println("Enter 2 to get list of tasks");
            System.out.println("Enter 3 to change status of a task");
            System.out.println("Enter 4 to remove a task");
            System.out.println("Enter 0 to quit");
            int choice = sc.nextInt();
            switch (choice){
                case 0:{
                    System.out.println("Thank you...");
                    System.exit(1);
                }
                case 1: {
                    add();
                    break;
                }
                case 2:{
                    print();
                    break;
                }
                case 3:{
                    changeStatusOf();
                    break;
                }
                case 4:{
                    delete();
                    flag = false;
                }
            }

        }while(flag);
    }
    private int getIdx(){
        return idx;
    }
    public void add(String title, String desc, String status){
        var task = new Task(title, desc, status);
        list[idx++] = task;
    }
    private void add(){
        Scanner sc = new Scanner(System.in);
        Task task = new Task();
        System.out.print("Enter the Title for the task: ");
        task.title = sc.next();
        sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the description for the task: ");
        task.desc = sc.nextLine();
        System.out.println();
        System.out.println("Enter the status for the task: ");
        task.status = sc.nextLine();
        System.out.println();
        list[idx++] = task;
    }
    public Task delete(String title){
        Task task = null; int j=0; boolean found = false;
        for(int i=0; i<idx; i++){
            if(list[i].title.equalsIgnoreCase(title)) {
                found = true;
                j = i;
                task = list[i];
                idx--;
                break;
            }
        }
        if(found){
            for(int i=j; i<idx; i++){
                list[i] = list[i+1];
            }
        }else System.out.println("Task "+title+" not found");
        return task;
    }
    private void delete(){
        System.out.println("Enter the title of the tast to be removed: ");
        Scanner sc = new Scanner(System.in);
        String title = sc.next();
        for(int i=0; i<idx; i++){
            if(list[i].title.equalsIgnoreCase(title)) {
                idx--;
                for(int j=i; j<idx; j++)
                    list[j] = list[j+1];
                break;
            }
        }
        System.out.println("Tast with title "+title+" not found");
    }
    private void changeStatusOf(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title of the task to revert its status: ");
        changeStatusOf(sc.next());
        System.out.println("Status has been reverted.");
    }
    public void changeStatusOf(String title){
        for(int i=0; i<idx; i++){
            if(list[i].title.equalsIgnoreCase(title)) {
                if(list[i].status.equalsIgnoreCase("done"))
                    list[i].status = "not done";
                else list[i].status = "done";
            }
        }
    }
    public int getIDX(String title) {
        for (int i = 0; i < idx; i++) {
            if (list[i].title.equalsIgnoreCase(title))
                return i;
        }
        return -1;
    }
    private void shuffule(int j){
        for(int i=j; i<idx; i++){
            list[i] = list[i+1];
        }
    }
    public void print(){
        for(int i=0; i<idx; i++){
            var obj = list[i];
            System.out.println("\nTitle: "+obj.title);
            System.out.println("Description: "+obj.desc);
            System.out.println("Status: "+obj.status+"\n");
        }
    }
    public String toString(){
        String str = "";
        for(int i=0; i<idx; i++){
            str+="Title: "+list[i].title+"\nDesc: "+list[i].desc+"\nStatus: "+list[i].status+"\n\n";
        }
        return str;
    }
}


package GetMin;

public class Main {
    public static void main(String[] args) {
        GetMin getMin = new GetMin();
        getMin.push(5);
        getMin.push(3);
        getMin.push(8);
        System.out.println(getMin.min);
        System.out.println(getMin.top());
        System.out.println(getMin.pop());
        System.out.println(getMin.top());
    }
}

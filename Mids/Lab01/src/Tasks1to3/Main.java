package Tasks1to3;

import java.io.IOException;

public class Main {
    static void displayResult(String[] result){
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
    public static void main(String[] args) throws IOException {
        NLArray nlArray=new NLArray();

        System.out.println("Task One part (a)");
        String[] result=nlArray.wordTokenize("workfile.txt");
        displayResult(result);

        System.out.println("Task One part (b)");
        nlArray.ExtractEmails("mails.txt");


        int[][] image={
                {1, 2, 3, 13},
                {4, 5, 6, 16},
                {7, 7, 7, 7},
                {10, 11, 12, 13}
        };
                System.out.println("Task Two part (a)");
        nlArray.extractBoundaries(image);
                System.out.println("Task Two part (b)");
        nlArray.cropCenterPart(image);

        System.out.println("Task Three");
        boolean output=nlArray.NConRep(image);
        System.out.println(output);



    }
}
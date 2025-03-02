package Lab01.TaskOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NLArray {

    private String newLine="";

     public String[] wordTokenize(String filename) throws IOException {
        BufferedReader file= getFile(filename);
        while(file.ready()){
            String line;
            while((line=file.readLine())!=null) {
                removeExtraCharacters(line);
                newLine += " ";
            }
        }
        return newLine.split(" ");
    }
    public void ExtractEmails(String filename) throws IOException {
        FileReader fr=new FileReader(filename);
        BufferedReader br=new BufferedReader(fr);
        while(br.ready()){
            String line;
            while((line=br.readLine())!=null){
                splitToWords(line);
            }
        }
    }

    public void cropCenterPart(int arr[][]){
        System.out.println("Cropping center part.");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if((i==0 && j<arr.length) || ((i>0 && i<arr.length-1 && j==0) || (i>0 && i<arr.length-1 && j==arr.length-1)) || (i==arr.length-1))
                    System.out.print("  ");
                else
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void extractBoundaries(int arr[][]){
        System.out.println("Extracting outer boundaries.");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){

                if((i==0 && j<arr.length) || ((i>0 && i<arr.length-1 && j==0) || (i>0 && i<arr.length-1 && j==arr.length-1)) || (i==arr.length-1))
                    System.out.print(arr[i][j]+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public boolean NConRep(int[][] arr){
        int first;

        outer:
        for (int[] ints : arr) {
            first = ints[0];
            for (int j = 0; j < arr.length; j++) {
                if (ints[j] != first) {
                    continue outer;
                }
            }
            return true;
        }
        return false;
    }

    // ####################### Backend Side ##################################
    private BufferedReader getFile(String filename) throws FileNotFoundException {
        FileReader fr=new FileReader(filename);
        BufferedReader br=new BufferedReader(fr);
        return br;
    }
    private void removeExtraCharacters(String line){
        for(int i=0; i<line.length(); i++){
            if(line.charAt(i)!=','&&line.charAt(i)!=':'&&line.charAt(i)!='.'){
                newLine+=line.charAt(i);
            }
        }
    }
    private void splitToWords(String line){
        String[] words=line.split(" ");
        for(String word:words){
            verifyWords(word);
        }
    }
    private static void verifyWords(String word){
        if(word.contains("@")&&word.contains(".")){
            System.out.println(word);
        }
    }
}

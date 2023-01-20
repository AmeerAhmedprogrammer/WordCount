import java.io.*;
//Ameer Ahmed - Get word count

public class Main {

    public static int countWords(String s) {
		
        //" " is the amount of whitespace
        String[] result = s.split(" ");

        for(int i = 0; i < result.length; i++) {
            System.out.println("Element: " + i + " equals: " + result[i]);
        }

        if(result.length == 0) {
            System.out.println("The string is empty.");
        }
        //length is the size of the array
        System.out.println("The word count for this sentence is: " + result.length);
        
        return result.length;
}

    public static void main(String[] args) {
        countWords("This is a test"); 
    }
}
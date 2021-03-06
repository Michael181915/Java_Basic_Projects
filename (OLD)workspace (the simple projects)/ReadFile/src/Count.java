import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Count {
	    public static void main(String[] args) throws FileNotFoundException{
	        getWordCount("res//1.txt");
	    }
    
    public static void getWordCount(String filename) throws FileNotFoundException{
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int words = 0;
        int lines = 0;
        //int rowws = 0;

        while (scanner.hasNextLine()) {
            lines++;
            String[] array = scanner.nextLine().split(" ");
            //words = words + array.length;
            words = array.length;
        }
        //rowws = words/lines;

        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + lines);
        //System.out.println("Number of rows: " + rowws);
        scanner.close();
    }
}
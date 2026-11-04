
/**
 * Write a description of class TextInspector here.
 *
 * @author Ansh Tewatia
 * @version 10/5/2026
 */
import java.util.Scanner;
public class TextInspector
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("=== Text Inspector ===");
        System.out.print("Please enter a word or phrase: ");
        String text= scan.nextLine();
        
        // Determine the length of the word/phrase
        System.out.println("Total length: "+ text.length());
        
        //Count the vowels in the word/phrase
        int count=0;
        String vowels= "aeiou";
        
        for (int i=0; i< text.length(); i++) {
            //Exclude a single character using substring 
            String ch= text.substring(i, i+1);
            
            //The indexOf method checks if a string is within another string
            if (vowels.indexOf(ch.toLowerCase()) !=-1)
                count++;
                
                    
        }
        System.out.println("Vowel count: "+count);
        
        //Search our word/phrase for a give word/phrase 
        System.out.print("Please enter a search term: ");
        String searchTerm= scan.nextLine();
        
        int foundIndex = text.indexOf(searchTerm);
        
        if (foundIndex != -1) {
            //Extract from foundIndex to the end of the string
            String remainingText= text.substring(foundIndex);
            System.out.println("Substring from match to end: "+remainingText);
        }
        
        System.out.print("Please enter a second word/phrase to compare: ");
        String secondWord= scan.nextLine();
        
        // Test if the strings are equal
        if (text.equals(secondWord)) {
            System.out.println("The two words/phrases are equal.");
        }
        else {
            //Test alphabetical ordering using compareTo
            int cmp= text.compareTo(secondWord);
            if (cmp<0) {
              System.out.println(text+" comes BEFORE "+secondWord);  
                
        }
        else if (cmp >0) {
            System.out.println(text+" comes AFTER "+secondWord);
        }
        
    }
}
}
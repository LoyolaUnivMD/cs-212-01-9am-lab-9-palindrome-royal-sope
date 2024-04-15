import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Palindrome { 
    boolean isPalindrome(String word, int start, int end) {
        if (start == end) { 
            return true;
        }
        //Checks if two characters equidistant from the center are the same
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        //Returns the word with the next index to be checked
        return isPalindrome(word, start + 1, end - 1);
    } 

    void writeToFile(String filename, ArrayList<String> palindromeList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String palindrome : palindromeList) {
                writer.write(palindrome);
                writer.newLine(); // Add newline after each palindrome
            }
            // Output success message
            System.out.println("Data has been written to " + filename);
        } catch (IOException e) {
            // Outputs error message if there is an IOException error
            System.err.println("Error writing to " + filename + ": " + e.getMessage());
        } // end of Catch block
    }
}

class Main {
    public static void main(String[] args) {
        //Declare the class
        Palindrome palindrome = new Palindrome();
        //Create scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to CS 212 Palindrome! ");
        System.out.println("Please enter a word.");
        String word = in.next();
        ArrayList<String> palindromeList = new ArrayList<>();
        while (!word.equals("exit")) {
            boolean palindromeCheck;
            //Check if word is palindrome
            if (word.length() == 0) { 
                palindromeCheck = true;
            } else {
                palindromeCheck = palindrome.isPalindrome(word, 0, word.length() - 1);
            }
            //Add word to palindrome list
            if (palindromeCheck) {
                palindromeList.add(word);
            }
            System.out.println("Please enter another word or type 'exit' to quit.");
            word = in.next();
        }
        System.out.println("Please enter the file name you want to write all of your palindromes into.");
        //Name the file
        String filename = in.next();
        //Write to named file
        palindrome.writeToFile(filename, palindromeList);
    }
}

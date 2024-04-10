// Read the README.md
// Read it again
// Your code here
// R these 4 lines of comments

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

class Main {
    public static void main(String[] args) {
        //Array list that contains all palindromes
        ArrayList<String> palindromeList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String word;

        // repeats code until user chooses to exit
        do {
            System.out.println("Enter a word(type exit to stop)");
            word = in.nextLine();
            if (!word.equals("exit") && check(word)) {
                palindromeList.add(word);
            }
        }while(!word.equals("exit"));

        System.out.println("Input your filename: ");
        String filename = in.nextLine();

            try {
                FileWriter wr = new FileWriter(filename);
                for(String palindrome:palindromeList) {
                    wr.write(palindrome);
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }


            }

        //checks if word is a palindrome
        public static boolean check(String word){
        if (word.length()>=1) {
            return true;
        }
         else if(word.charAt(0)==(word.charAt(word.length()-1))){
             return check(word.substring(1,word.length()-1));

         }
         else{
             return false;
         }
        }


        
    }


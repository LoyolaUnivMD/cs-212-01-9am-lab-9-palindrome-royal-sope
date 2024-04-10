# Lab 9 -- Palindrome emordnilaP

* Due: Monday Apr 15, 2024
			

## Purpose:  

In this lab, students will practice:
1. Recursive functions.
2. Array Lists
3. Writing Files

## Description

As you were browsing YouTube, you came accross [Bob by Weird Al](https://www.youtube.com/watch?v=JUQDzj6R3p4). Naturally, this has gotten you interested in other palindromes and so you have decided to write a program to help you.

## Details

You are going to write a program to do the following:
1. Ask the user for a word.
2. If the word is not "exit"  
    1. If the word is a palindrome  
        1. Store the word to a list of palindromes  
3. Ask the user for a file name
4. Open the file
5. For each word in the palindrome list  
    a. write the word to the file
6. Close the file

## Requirements

Your program should follow the algorithm above.

You do not need any classes in this program aside from the main class. You should still use methods, but they should be static.

A word is a palindrome if it satisfies the following recursive definition. Otherwise it is not.  
1. The word is either 0 OR 1 character long.  
2. The first and last letters are the same AND the rest of the word is a palindrome.  

Your palindrome checking code should follow this algorithm (i.e., it should be recursive).

You may assume that there are no spaces or punctuation in the word and that the word is all uppper case.

### Extra Credit
Do not assume that there are no spaces or punctuation in the word and that the word is all uppper case. Instead, ignore all spaces, punctuation and capitalization. For instance, "A dog, a panic, in a pagoda" should return true.

## Testing help
Here are some palindromes:
* racecar
* deed
* rotor
* madam
* deified
* civic
* noon
* eye
* kayak
* tattarrattat

## Quick note:
Just a quick reminder for labs and PAs, following good programming practices is part of your grade. They include filling out the header of your code (comments on top about the assignment, input, output), commenting throughout your code, using white spaces to make your code more readable and lastly being consistent and considerate on naming your variables.

## What to Submit:

## Submit:
* To Github
    * Your completed algorithm (algorithm.txt)
    * All .java files needed to run your code.

* To Moodle
    * A Link to your GitHub Repo
    * A individual reflection (typed inside the moodle submission box) using the following format and addressing the following questions:

        * 1. Objective: 
                - What were you supposed to learn/accomplish?
        * 2. Procedure:
                - What steps were followed and what techniques did you use to solve the problem?
                - What were the Key concepts explored?
        * 3. Results:
               - How do you feel about recursion now that you have gotten a chance to work with it a bit?
               - What's your favorite palindrome?
        * 4. Reflection:
                - What challenges did you encounter?
                - Did you overcome them, and how?
                - Any key takeaways?
                - Do you think you learned what you were supposed to learn for this lab?
                - What was it like working with your partner?









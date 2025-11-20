package LEVEL1;
import java.util.*;

public class Task2 {
    public void palindromeChecker(String word){
        int start=0;
        int end=word.length()-1;
        while(start<=end){
            if(word.charAt(start)==word.charAt(end)){
                start++;
                end--;

            }
            else{
                System.out.println("The given word is not a palindrome");
            }
        }
        System.out.println("The given word is a palindrome");


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Task2 obj=new Task2();
        System.out.println("Enter Any Word");
        String word=sc.nextLine();
        obj.palindromeChecker(word);
    }
    
}

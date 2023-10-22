import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) throws Exception {
      
        String kata;
        String kataPalindrome="";
        int panjangkata;
         
        System.out.println("\t Menentukan Kata palindrome \n");
        System.out.println("masukan kata:");
        kata= userinput.nextline();

        panjangkata = kata.length();

        for(int i = panjangkata -1; i >= 0;i--){
        kataPalindrome = kataPalindrome + kata.charAt(i);
        }
        if(kata.equals(kataPalindrome)){
            System.out.println("\n kata "+ kata + " palindrome");
        }
        else{
            System.out.println("\n kata "+ kata + "palindrome");
            userinput.close();
        }
     }
}    
    

import java.io.*;
import java.util.*;
public class Vowel{
public static void main(String[] args)
{
        
        Scanner scan=new Scanner(System.in);
        char s1=scan.next().charAt(0);
        if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }
        
  }
    }

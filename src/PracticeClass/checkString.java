package PracticeClass;
import java.util.Scanner;
public class checkString {
    public static void main(String[] args) {

        Scanner x= new Scanner(System.in);
        System.out.println("enter a string");
        String a=x.next();
        boolean hex=false;

        for(int i=0; i<5; i++){

                if(a.charAt(i)=='A'||a.charAt(i)=='B'){
               hex=true;
                    // System.out.println("hexadecimal");
            }

                else {
                    System.out.println("not hexadecimal");
                }
        }
    }
}
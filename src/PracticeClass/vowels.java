package PracticeClass;
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter a string:");
        String a =x.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'i'||a.charAt(i) == 'a'||a.charAt(i) =='o'||a.charAt(i)== 'u'||a.charAt(i) =='e') {
                System.out.print(a.charAt(i));
            }
            else
            {
                System.out.print("");
            }
        }
    }}
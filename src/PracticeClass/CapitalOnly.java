package PracticeClass;
import java.util.Scanner;
public class CapitalOnly {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter a sentence with Capital letters and lowercase letters");
        String enterence=x.nextLine();
        for(int i=0; i<enterence.length();i++){
            if(enterence.charAt(i)=='A'||enterence.charAt(i)=='B'||enterence.charAt(i)=='C'||enterence.charAt(i)=='D'||enterence.charAt(i)=='E'||enterence.charAt(i)=='F'||enterence.charAt(i)=='G'||enterence.charAt(i)=='H'||enterence.charAt(i)=='I'||enterence.charAt(i)=='J'||enterence.charAt(i)=='K'||enterence.charAt(i)=='L'||enterence.charAt(i)=='M'||enterence.charAt(i)=='N'||enterence.charAt(i)=='O'||enterence.charAt(i)=='P'||enterence.charAt(i)=='Q'||enterence.charAt(i)=='R'||enterence.charAt(i)=='S'||enterence.charAt(i)=='T'||enterence.charAt(i)=='U'||enterence.charAt(i)=='V'||enterence.charAt(i)=='W'||enterence.charAt(i)=='X'||enterence.charAt(i)=='Y'||enterence.charAt(i)=='Z'){
                System.out.print(enterence.charAt(i));
            }
            else{
                System.out.print("");
            }
        }
    }
}

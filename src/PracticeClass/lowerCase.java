package PracticeClass;

public class lowerCase {
    public static void main(String[] args) {
        String sentence="BootCamp Attendees Rocks";
        char letter;
        System.out.println("BootCamp Attendees Rocks' lowercase:");
        for (int i=0; i<sentence.length();i++){
            letter=sentence.charAt(i);
            if(letter>=97 && letter<=122){
                System.out.print((sentence.charAt(i)));
            }
    }
}}

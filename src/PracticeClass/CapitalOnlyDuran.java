package PracticeClass;

public class CapitalOnlyDuran {
    public static void main(String[] args) {
        String sentence="BootCamp Attendees Rocks";
        char letter;
        System.out.println("BootCamp Attendees Rocks' capitals:");
        for (int i=0; i<sentence.length();i++){
            letter=sentence.charAt(i);
            if(letter>=65 && letter<=90){
                System.out.print((sentence.charAt(i)));
            }
        }
    }
}

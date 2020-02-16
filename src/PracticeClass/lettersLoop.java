package PracticeClass;

public class lettersLoop {
    public static void main(String[] args) {
        char letter='A';

        for(int i=1; i<6;i++){

            System.out.print(i+"\t");
            for(int j=0; j<5; j++){
                System.out.print(letter+"\t");

            }
            System.out.println("");
            letter++;
        }
    }
}

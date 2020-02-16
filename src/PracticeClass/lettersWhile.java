package PracticeClass;

public class lettersWhile {
    public static void main(String[] args) {
      int i=1;
              int j=0;
              char letter='a';
        while(i<6){
            System.out.print((i)+"\t");

            j=0;
            while(j<4){
                System.out.print(letter+"\t");
                letter++;
                j++;

            }

            System.out.println("");
           i++;
        }

    }
}

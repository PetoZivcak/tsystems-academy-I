/*
  TODO: Expected output from the program for size = 10
             *
            ***
           *****
          *******
         *********
        ***********
       *************
      ***************
     *****************
    *******************
*/
public class PrintTriangleReverse1 {
    public static void main(String[] args) {
        int size = 10;
        int i = size;

        while(i-- > 0) {
            
            printChars(size - i , ' ');
            printChars((2 * (i ))-1, '*');
            System.out.println();
        }
    }

    private static final void printChars(int length, char c) {
        for(int i = 0;  i< length; i++) {
            System.out.print(c);
        }
    }
}

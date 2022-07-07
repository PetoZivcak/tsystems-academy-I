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
public class PrintTriangleRight {
    public static void main(String[] args) {
        int size = 10;
        int i = 0;
        int mySpace=size+1;
        while(i++ < size+1) {
             mySpace=mySpace-1;
            
            printChars( mySpace, ' ' );
            printChars1(( (i ))-1, '*',' ');
            
            System.out.println();
        }
    }

    private static final void printChars1(int length, char c, char d) {
        for(int i = 0;  i< length; i++) {
            System.out.print(c);
            System.out.print(d);
        }
    }
    private static final void printChars(int length, char c) {
        for(int i = 0;  i< length; i++) {
            System.out.print(c);
            
        }
    }
}

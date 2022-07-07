//Test on inputs 234 and 2132
public class NumberToTextPzi {
   
   
    public static void main(String[] args) {
        int myNumber;
        int myNrOfChars;
        
     myNumber=66120;
    while(myNumber>0){
     myNrOfChars= calculateNrOfChars(myNumber);
    switch(myNrOfChars){
        case 9: 
        case 8:
        case 7: System.out.println("million");
        case 6: 
        case 5:
        case 4: 
        int myValue=calculateHowMany(myNumber, 1000);
        myNumber=myNumber-(myValue*1000);
        System.out.println(myValue);
        break;
        case 3: 
        myValue=calculateHowMany(myNumber, 100);
        myNumber=myNumber-(myValue*100);
        System.out.println(myValue);
        break;
        case 2:
        myValue=calculateHowMany(myNumber, 10);
        myNumber=myNumber-(myValue*10);
        System.out.println(myValue);
        case 1: 

        case 0: 
    }
}

    }

    public static int calculateHowMany(int myNumberInt, int nrForDivide){
        int myCount;
        myCount=myNumberInt/nrForDivide;
        return myCount;
    
    }
   
   public static int calculateNrOfChars(int myValue){
    int nrOfCharsInt;
    String nrOfCharsString;
    nrOfCharsString=Integer.toString(myValue);
    nrOfCharsInt=nrOfCharsString.length();
    return nrOfCharsInt;
   }

  
}
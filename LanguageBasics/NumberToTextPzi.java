//Test on inputs 234 and 2132
public class NumberToTextPzi {
    public static void main(String[] args) {
        String myResult;
        int number;
        number = 125;
        myResult = myMillions(number);
        System.out.println(myResult);
    }
    public static String myMillions(int myWholeNumber) {
        String myWholeSentence = "";
        String whichPartOfNr = "";
        for (int i = 1000000000; i > 1; ) {
            i = i / 1000;
            if (i == 1000000) {
                whichPartOfNr = "million ";
            }
            if (i == 1000) {
                whichPartOfNr = "thousand ";
            }
            if (i == 1) {
                whichPartOfNr = "";
            }
            if (myWholeNumber / i > 1) {
                myWholeSentence = myWholeSentence + howMany(myWholeNumber / i) + whichPartOfNr;
                myWholeNumber %= i;
            }
        }
        return myWholeSentence;
    }
    public static String howMany(int myNr) {

        String myMany;
        myMany = "";
        if (myNr >= 100) {
            myMany = myMany + writeNumber(myNr / 100);
            myMany = myMany + writeNumber(100);

            myNr %= 100;
        }
        if (myNr <= 20) {
            myMany = myMany + writeNumber(myNr);
        } else if (myNr < 100) {
            myMany = myMany + writeNumber(myNr / 10 * 10);
            myNr %= 10;
            myMany = myMany + writeNumber(myNr);
        }
        return myMany;
    }
    private static String writeNumber(int number) {
        String mySentence;
        mySentence = "";
        switch (number) {
            case 1:
                mySentence = "one";
                break;
            case 2:
                mySentence = "two";
                break;
            case 3:
                mySentence = "three";
                break;
            case 4:
                mySentence = "four";
                break;
            case 5:
                mySentence = "five";
                break;
            case 6:
                mySentence = "six";
                break;
            case 7:
                mySentence = "seven";
                break;
            case 8:
                mySentence = "eight";
                break;
            case 9:
                mySentence = "nine";
                break;
            case 10:
                mySentence = "ten";
                break;
            case 11:
                mySentence = "eleven";
                break;
            case 12:
                mySentence = "twelve";
                break;
            case 13:
                mySentence = "thirteen";
                break;
            case 14:
                mySentence = "fourteen";
                break;
            case 15:
                mySentence = "fifteen";
                break;
            case 16:
                mySentence = "sixteen";
                break;
            case 17:
                mySentence = "seventeen";
                break;
            case 18:
                mySentence = "eighteen";
                break;
            case 19:
                mySentence = "nineteen";
                break;
            case 20:
                mySentence = "twenty";
                break;
            case 30:
                mySentence = "thirty";
                break;
            case 40:
                mySentence = "forty";
                break;
            case 50:
                mySentence = "fifty";
                break;
            case 60:
                mySentence = "sixty";
                break;
            case 70:
                mySentence = "seventy";
                break;
            case 80:
                mySentence = "eighty";
                break;
            case 90:
                mySentence = "ninety";
                break;
            case 100:
                mySentence = "hundred";
                break;
        }
        return mySentence;
    }
}
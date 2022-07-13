public class MySquare extends MyShape {
    int size=5;

    public MySquare(char color) {
        super(color);
    }
    public MySquare(char color, int size) {
        super(color);
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        int i = 0;
        String finalSquareString = "";
        StringBuilder tempString=new StringBuilder();
        while (i++ < size) {
            //finalSquareString = finalSquareString+saveChars(this.size, this.color);
            tempString=tempString.append(saveChars(this.size,this.color));
        }

        return tempString.toString();
    }


    private static final String saveChars(int size, char c) {
        String myString = "";
        StringBuilder myTempString=new StringBuilder();
        for (int i = 0; i < size; i++) {
          //  myString = myString + Character.toString(c);
            myTempString.append(c).append("  ");
        }
      //  myString = myString + System.lineSeparator();
        myTempString.append(System.lineSeparator());

        return  myTempString.toString();
    }
}

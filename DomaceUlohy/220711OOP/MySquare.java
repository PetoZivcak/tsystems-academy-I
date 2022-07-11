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
        while (i++ < size) {
            finalSquareString = finalSquareString+saveChars(this.size, this.color);
        }
        return finalSquareString;
    }


    private static final String saveChars(int size, char c) {
        String myString = "";
        for (int i = 0; i < size; i++) {
            myString = myString + Character.toString(c);
        }
        myString = myString + System.lineSeparator();
        return myString;
    }
}

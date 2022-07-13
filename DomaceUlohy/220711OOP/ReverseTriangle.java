public class ReverseTriangle extends MyShape {
    int height;

    public ReverseTriangle(char color) {
        super(color);
    }

    public ReverseTriangle(char color, int height) {
        super(color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        int i = this.height;
        String myFinalStirg = "";
        while (i-- > 0) {
            myFinalStirg = myFinalStirg +
                    saveCharsReverseTriangle(this.height - i, ' ') + saveCharsReverseTriangle((2 * (i)) - 1, this.color)+System.lineSeparator();

        }
        return myFinalStirg;
    }


    private static final String saveCharsReverseTriangle(int height, char color) {
        String myString = "";
        for (int i = 0; i < height; i++) {
            myString = myString + Character.toString(color);
        }

        return myString;
    }
}

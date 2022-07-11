public class Triangle extends MyShape {
    int height;

    public Triangle(char color) {
        super(color);
    }

    public Triangle(char color, int height) {
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
        int i = 0;
        String myFinalStirg = "";
        while (i++ < height) {
            myFinalStirg = myFinalStirg +
                    saveCharsTriangle(this.height - i, ' ') + saveCharsTriangle((2 * (i)) - 1, this.color)+System.lineSeparator();

        }
        return myFinalStirg;
    }
    private static final String saveCharsTriangle(int height, char color) {
        String myString = "";
        for (int i = 0; i < height; i++) {
            myString = myString + Character.toString(color);
        }

        return myString;
    }
}

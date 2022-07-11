public class Rectangle extends MyShape {
    int width;
    int height;

    public Rectangle(char color) {
        super(color);
    }

    public Rectangle(char color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        int i=0;
        String myRectAngle="";
        while(i++<height){
            for (int j = 0; j <width ; j++) {
                myRectAngle=myRectAngle+ Character.toString(color);
            }
            myRectAngle=myRectAngle+System.lineSeparator();

        }
        return myRectAngle;
    }



}

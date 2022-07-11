public abstract class MyShape {
    protected char color;
    public MyShape() {
        this('*');
    }
    public MyShape(char color) {
        this.color = color;
    }
    public int getColor() {
        return color;
    }
    public void setColor(char color) {
        this.color = color;
    }
    public abstract String toString();
    public void print(){
        System.out.println(toString());
    };
}

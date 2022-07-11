


public class MyTestShapes {
    public static void main(String[] args) {
        MyShape[]shapes={
            new Rectangle('x',10,5),
            new MySquare('a',10),
                new Triangle('j',10)
        };
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].print();
        }


//        MySquare square=new MySquare('*',15);
//        square.setColor('.');
//        square.print();
//Triangle triangle=new Triangle('*',10);
//triangle.print();
//        Rectangle rectangle=new Rectangle('a',20,5);
//                rectangle.print();
    }
}

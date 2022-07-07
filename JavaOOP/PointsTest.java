public class PointsTest {
    public static void main(String[] args) {
     Point p1=new Point(3,4) ;
     Point p2=p1;
     p1.move(10,10);
        System.out.println(p1);

        int a=5;
        int b=7;
        a=b;

        System.out.println(a);
        System.out.println(b);
    }
}

package ss6_inheritance.thuc_hanh;

public class SquareTest {
    public static void main(String[] args) {
        Square square= new Square();
        System.out.println(square);
        Square square1 =new Square(1.3);
        System.out.println(square1);
        Square square2= new Square(4.5,"Yellow",true);
        System.out.println(square2);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Triangle triangle1 = new Triangle(4.5, 2, 3.5);

        System.out.println("S = " + triangle.getArea());
        System.out.println(triangle.getA() + " " + triangle.getB() + " " + triangle.getC());


        System.out.println("S = " + triangle1.getArea());
        System.out.println(triangle1.getA() + " " + triangle1.getB() + " " + triangle1.getC());
    }
}

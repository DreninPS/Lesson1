public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        if (this.existTriangle(a, b, c)){
        this.a = a;
        this.b = b;
        this.c = c;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    private boolean existTriangle (double a, double b, double c) {
        if (((a + b) > c) & ((a + c) > b) & ((b + c) > a)) return true;
        return false;
    }
    public double getArea (){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }


}

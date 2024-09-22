public class mul {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int multiply=x*y;
        System.out.println("Multiplication = "+multiply);
        int div=y/x;
        System.out.println("Division = "+div);
        int mod=x%y;
        System.out.println("Modulus = "+mod);
        // (x*y)/(x+y)
        int exp=(x*y)/(x+y);
        System.out.println("Value of Expression = "+exp);
        exp=x*y/x+y;
        System.out.println("Value of Expression = "+exp);
    }
}

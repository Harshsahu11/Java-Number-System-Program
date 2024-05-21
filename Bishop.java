import java.util.Scanner;

public class Bishop {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter location of Bishop");
        int row=Sc.nextInt();
        int column=Sc.nextInt();
        int topleft=Math.min(row, column)-1;
        int bottomright=8-Math.max(row, column);
        int topright=Math.min(row, 9-column)-1;
        int bottomleft=8-Math.max(row,9-column);
        int total = topleft+bottomright+topright+bottomleft;
        System.out.println(total);
    }
}

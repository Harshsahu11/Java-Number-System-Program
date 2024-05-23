import java.util.Scanner;

public class BOOK {
    int BOOK_NO;
    String BOOKTITLE;
    float PRICE;
    float TOTAL_COST;
    void INPUT()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Book Title");
        BOOKTITLE=Sc.nextLine();
        System.out.println("Enter Book No");
        BOOK_NO=Sc.nextInt();
        System.out.println("Enter Price");
        PRICE=Sc.nextFloat();
    }
    float PURCHASE()
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of Items To be Purchased");
        int Purchase=Sc.nextInt();
        TOTAL_COST=Purchase*PRICE;
        System.out.println("Total Cost to be paid :"+TOTAL_COST);
        return TOTAL_COST;

    }
    public static void main(String[] args) {
        BOOK ob=new BOOK();
        ob.INPUT();
        ob.PURCHASE();
    }
}

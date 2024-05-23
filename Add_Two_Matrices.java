import java.util.*;
public class Add_Two_Matrices {
    public static void main(String args[])
    {
       
        int i,j,m,n;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Rows and Column of Matrix ");
        m=Sc.nextInt();
        n=Sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];
        System.out.println("Enter elements of Matrix 1 ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=Sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix 2 ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=Sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of Matrix are :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}

public class C {
    public static void main(String[] args)
    {
        byte i,j,k;
        for(i=1; i<=5; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(" "+j);
            }
            for(k=5; k>i; k--)
            {
                System.out.print("    ");
            }
            for(j=i; j>=1; j--)
            {
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }

    }
}

public class B {
    public static void main(String[] args)
    {
        byte i,j;

        for(i=1; i<=7; i++)
        {
            for(j=1; j<=5; j++)
            {
                if(j==1 || i==1 || i==7)
                {
                    System.out.print(" *");
                }
                 else if (i==2 && j==5)
                {
                    System.out.print(" *");
                } else if (i==1) {

                } else
                {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}

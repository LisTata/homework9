
/*
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

 */
public class Pattern17 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j < i; j++)
                System.out.print(" ");


            for (int k = i; k <= num; k++)
                System.out.print(k + " ");

            System.out.println();
        }
        for (int i = num; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
                System.out.print(" ");

            for (int k = i; k <= num; k++)
                System.out.print(k + " ");
            System.out.println();
        }

    }
}


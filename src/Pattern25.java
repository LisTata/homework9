public class Pattern25 {
    /*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
     */
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; i++)
        {
            for (int j = num; j > i; j--)
                System.out.print(" ");

            for (int k = 1; k <= i; k++)
                System.out.print(i + " ");

            System.out.println();
        }
    }
}

public class Pattern22 {
    /*
     1 0 0 0 0
     0 2 0 0 0
     0 0 3 0 0
     0 0 0 4 0
     0 0 0 0 5
     */
    

    public static void main(String[] args) {

        int num = 5;

        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j < i; j++)
                System.out.print("0 ");

            System.out.print(i + " ");

            for (int k = i; k < num; k++)
                System.out.print("0 ");

            System.out.println();
        }
    }
}

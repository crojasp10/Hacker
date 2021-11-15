public class Staircase {


    public static void staircase(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j< n-i? " ":"#");
            }
            System.out.println(" ");
        }

    }


}

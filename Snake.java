package javaprogramming98.pkg99.pkg1;
import  java.util.Scanner;
public class Snake1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int n, s1 = 60, k = 0;
        System.out.print("Please enter the length of the snake: ");
        n = input.nextInt();
        int _spacing = n + s1 /2;
//<horizontal motion of the snake>--------------------------------------------------------------------------------------
        while (2 * s1 >= 0) {
            for (int i = 0; i < k; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < s1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < k; i++) {
                System.out.print(" ");
            }
            Thread.sleep(400);
            System.out.print("\r");
            s1 -= 2;
            k++;
        }
        System.out.print("\r");
//<vertical motion of the snake>----------------------------------------------------------------------------------------
        for (int i = 0; i < n; i++) {
            for (int f = 1; f < _spacing - 1; f++) {
                System.out.print(" ");
            }
            System.out.print("*" + " " + "*" + "\n");
            Thread.sleep(400);
        }
//<rhombus drawing>-----------------------------------------------------------------------------------------------------
        for (int i = 1; i <= n; i++) {
            for (int f = 0; f < _spacing - i; f++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                    Thread.sleep(400);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for (int i = 1; i < n; i++) {
            for (int t = 0; t < _spacing - n + i; t++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * n) - 1 - (2 * i); j++) {
                if (j == 1 || j == (2 * n) - 1 - (2 * i)) {
                    System.out.print("*");
                    Thread.sleep(400);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
//<vertical motion of the snake>----------------------------------------------------------------------------------------
        for (int i = 0; i < n; i++) {//vertical motion of the snake
            for (int f = 1; f < _spacing - 1; f++) {
                System.out.print(" ");
            }
            System.out.print("*" + " " + "*" + "\n");
            Thread.sleep(400);
        }
//<Circle drawing>------------------------------------------------------------------------------------------------------
        int radius = n;
        for (int row = radius - 1; row >=0; row--)
        {
            int col = getColumnIndex(radius , row);
            for (int i = 0; i < _spacing - col - 1 ; i++)
                System.out.print(" ");
            System.out.print("*");
            for (int i = 0; i < 2 * col - 1 ; i++)
                System.out.print(" ");
            System.out.print("*");
            System.out.print("\n");
            Thread.sleep(400);
        }
       for (int row = 0; row < radius; row++)
        {
            int col = getColumnIndex(radius , row);
            for (int i = 0; i < _spacing - col - 1 ; i++)
                System.out.print(" ");
            System.out.print("*");
            for (int i = 0; i < 2 * col - 1 ; i++)
                System.out.print(" ");
            System.out.print("*");
            System.out.print("\n");
            Thread.sleep(400);
        }
//<vertical motion of the snake>----------------------------------------------------------------------------------------
        for (int i = 0; i < n; i++) {
            for (int f = 1; f < _spacing - 1; f++) {
                System.out.print(" ");
            }
            System.out.print("*" + " " + "*" + "\n");
            Thread.sleep(400);
        }
//<horizontal motion of the snake>--------------------------------------------------------------------------------------
        for (int i = 0; i < _spacing - n; i++) {
            System.out.print("\r");
            for (int j = 0; j < _spacing - n - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j < n; j++)
                System.out.print("*");
            for (int j = 0; j < 2 * i; j++)
                System.out.print(" ");
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.print("\r");
            Thread.sleep(400);
        }
        System.out.print("\r");
    }
//<This method calculates the column number of the circle drawing>------------------------------------------------------
    public static int getColumnIndex(int radius, int row) {
        int col = (int) Math.round(Math.sqrt(Math.pow(radius,2) - Math.pow(row, 2)));
        return col;
    }
}





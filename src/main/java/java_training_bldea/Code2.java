import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == (n - 1) && j != 0 && j != (n - 1) || j == 0 || j == (n - 1)) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("  ");
      for (int j = 0; j < n; j++) {
        if (i == 0 || j + i == (n - 1) || i == (n - 1)) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("   ");
      for (int j = 0; j < n; j++) {
        if (j == 0 && i >= (n / 4) || i + j == (n / 4) ||
            j - i == ((3 * n) / 4) || j == (n - 1) && i >= (n / 4)
            || i == (n / 2) + 1 || i == 0 && j >= (n / 4) && j <= ((3 * n) / 4)) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("   ");
      for (int j = 0; j < n; j++) {
        if (i == 0 || i == (n - 1) || j == (n / 2)) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("  ");
      for (int j = 0; j < n; j++) {
        if (j == 0 || i == 0 && j <= (n / 2) && j != (n / 2) || j == (n / 2) && i <= (n / 2)
            || i == (n / 2) && j <= (n / 2) || i - j == (n / 2)) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }

      System.out.println();
    }
  }
}
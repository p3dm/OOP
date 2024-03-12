// Nhập vào kích thước ô vuông n*n, kiểm tra  3<=n<= 8. Trong đó phần tu la cac so nguyen
import java.util.*;
public class bai24 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap kich thuoc o vuong n*n: ");
            n = scanner.nextInt();
        } while (n < 3 || n > 8);
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){

                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

}

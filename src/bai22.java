// Viết chương trình sắp xếp một dãy số theo thứ tự tăng dần, dãy số được nhập từ bàn phím hoặc tự động sử dụng hàm Random.nextInt(n)
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        System.out.println("Tu nhap hoac tu dong nhap mang? (1: tu nhap, 2: tu dong)");
        int choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap mang: ");
                arr[i] = scanner.nextInt();
            }
        }   else if (choice == 2){
                for (int i = 0; i < n; i++) {
                    arr[i] = random.nextInt(100);
                }
            }
            System.out.println("Mang ban dau: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            Arrays.sort(arr);
            System.out.println("Mang sau khi sap xep: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
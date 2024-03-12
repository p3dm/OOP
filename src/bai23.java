// Viết chương trình nhập chiều cao h từ bàn phím, sau đó hiển thị các tam giác hình sao có chiều cao h. Chú ý có kiểm tra điều kiện của h: 2<=h<=10. Nếu h nằm ngoài đoạn trên, yêu cầu người dùng nhập lại.
import java.util.*;
public class bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h;
        do {
            System.out.println("Nhap chieu cao h: ");
            h = scanner.nextInt();
        } while (h < 2 || h > 10);
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

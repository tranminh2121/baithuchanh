package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (sum <= 100) {
            System.out.print("Nhap mot so nguyen: ");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("tong cac so la: " + sum);
    }

}

// Bài 5: (while) Viết chương trình nhập vào các số nguyên và tính tổng các số
// đó, nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng
// của các số đã nhập.

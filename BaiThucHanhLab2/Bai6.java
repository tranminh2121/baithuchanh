package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap so nguyen duong: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }

        System.out.println("Giai thua cua " + n + " la: " + giaithua);
    }
}

// Bài 6: (do –while) Viết chương trình nhập vào 1 số nguyên dương bất kỳ từ bàn
// phím. Sau đó tính và in ra giai thừa của số đó.

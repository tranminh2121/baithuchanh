package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Nhap so phan tu cua day: ");
        n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " cua day: ");
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / n;
        System.out.println("Trung binh cong cua day so la: " + average);
    }
}

// Bài 8: (for) Viết chương trình nhập vào một dãy số gồm n số nguyên từ bàn
// phím. Tính và in ra màn hình trung bình cộng của n số nguyên đã nhập

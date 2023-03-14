package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " la so chan.");
        } else {
            System.out.println(number + " la so le.");
        }

        scanner.close();
    }
}

// Bai tap:(if-else) Viết chương trình kiểm tra số vừa nhập vào là số chẵn hay
// lẻ.

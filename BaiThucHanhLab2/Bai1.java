package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();

        double sum = a + b;
        double difference = a - b;
        double multiplication = a * b;
        double division = a / b;
        boolean isEqual = a == b;
        boolean isGreater = a > b;
        boolean isLess = a < b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLessOrEqual = a <= b;

        System.out.println("Tong cua a va b la: " + sum);
        System.out.println("Hieu cua a va b la: " + difference);
        System.out.println("Tich cua a va b la: " + multiplication);
        System.out.println("Thuong cua a va b la: " + division);
        System.out.println("So a bang so b: " + isEqual);
        System.out.println("So a lon hon so b: " + isGreater);
        System.out.println("So a be hon so b:" + isLess);
        System.out.println("So a lon hon hoac bang so b:" + isGreaterOrEqual);
        System.out.println("so a be hon hoac bang so b: " + isLessOrEqual);

        scanner.close();
    }
}
// viet chương trình tính tổng hiệu tích thương của 2 số a và b với a b được
// nhập từ bàn phím va so sanh 2 so do
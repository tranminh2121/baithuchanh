package BaiThucHanhLab3;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        final float PI = 3.14f;
        float r;
        float cv;

        Scanner sc = new Scanner(System.in);

        // Nhập bán kính từ bàn phím
        System.out.print("Nhập bán kính: ");
        r = sc.nextFloat();

        // Tính chu vi
        cv = 2 * r * PI;

        // In kết quả ra màn hình
        System.out.printf("Chu vi hình tròn có bán kính %.2f là: %.2f", r, cv);
    }
}

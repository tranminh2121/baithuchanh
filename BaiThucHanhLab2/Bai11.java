package BaiThucHanhLab2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public class SortArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap so phan tu cua mang: ");
            int n = scanner.nextInt();

            int[] arrA = new int[n];

            System.out.println("Nhap gia tri cho cac phan tu trong mang:");
            for (int i = 0; i < n; i++) {
                System.out.printf("arrA[%d] = ", i);
                arrA[i] = scanner.nextInt();
            }

            // sắp xếp mảng A tăng dần
            Arrays.sort(arrA);

            System.out.println("Mang ban dau: " + Arrays.toString(arrA));
            System.out.println("Mang da sap xep: " + Arrays.toString(arrA));
        }
    }

}

// Chương trình trên yêu cầu người dùng nhập số phần tử của mảng và giá trị của
// từng phần tử trong mảng.
// Sau đó, chương trình sẽ sử dụng phương thức `Arrays.sort()` để sắp xếp mảng A
// theo thứ tự tăng dần.
// Cuối cùng, chương trình sẽ in ra màn hình mảng số ban đầu và mảng đã sắp xếp
// theo thứ tự tăng dần.
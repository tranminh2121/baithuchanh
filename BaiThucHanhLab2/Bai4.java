package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // nhap so vao tu ban phim

        System.out.print("nhap so nguyen tu 1-12: ");
        int month = scanner.nextInt();

        switch (month) { // dung switch kiem tra
            case 1:
                System.out.println("Thang 1");
                break;
            case 2:
                System.out.println("Thang 2");
                break;
            case 3:
                System.out.println("Thang 3");
                break;
            case 4:
                System.out.println("Thang 4");
                break;
            case 5:
                System.out.println("Thang 5");
                break;
            case 6:
                System.out.println("Thang 6");
                break;
            case 7:
                System.out.println("Thang 7");
                break;
            case 8:
                System.out.println("Thang 8");
                break;
            case 9:
                System.out.println("Thang 9");
                break;
            case 10:
                System.out.println("Thang 10");
                break;
            case 11:
                System.out.println("Thang 11");
                break;
            case 12:
                System.out.println("Thang 12");
                break;
            default:
                System.out.println("So khong hop le "); // so kh hop le neu nam ngoai tu 1 - 12
                break;
        }
        scanner.close();
    }
}

// Bài 4: (switch –case) Viết chương trình nhập vào một số nguyên từ 1 - 12 từ
// bàn phím và hiển thị ra tháng tương ứng với số đó (nhập vào số 1 thì sẽ hiển
// thị ra là "Tháng 1“).

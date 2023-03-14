package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao chuoi bat ky: ");
        String input = scanner.nextLine(); // dung `string` nhap vao chuoi bat ky trong ban phim

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;

        for (int i = 0; i < input.length(); i++) { // duyet qua tung ký tự trong chuoi
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        System.out.println("so ky tu trong chuoi: " + upperCaseCount);
        System.out.println("so ky tu viet thuong trong chuoi: " + lowerCaseCount);
        System.out.println("so chu so trong chuoi: " + digitCount);
    }
}

// Bài 9: (string) Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký
// tự thường và ký tự hoa từ bàn phím. Sau đó đếm và in ra số ký tự thường và ký
// tự hoa và số có trong chuỗi đó.

package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai10 {

    public class CountCharacter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhap chuoi khong qua 80 ky tu: ");
            String inputString = scanner.nextLine();

            System.out.print("Nhap ky tu de dem so lan xuat hien trong chuoi: ");
            char inputChar = scanner.next().charAt(0);

            int count = 0;

            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == inputChar) {
                    count++;
                }
            }

            System.out.printf("So lan xuat hien cua ky tu '%c' trong chuoi '%s' la: %d", inputChar, inputString, count);
        }
    }

}

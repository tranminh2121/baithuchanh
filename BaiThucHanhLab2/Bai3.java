package BaiThucHanhLab2;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // dung 'Scanner' de nhap ten va nam sinh cua nguoi dung

        System.out.print("nhap ten cua ban: ");
        String name = scanner.nextLine();

        System.out.print("nhap nam sinh cua ban: ");
        int birthYear = scanner.nextInt();

        int age = 2023 - birthYear;
        // dung nam hien tai tru nam sinh = tuoi

        if (age < 16) {
            System.out.println("Ban " + name + " o do tuoi thanh nien.");
        } else if (age >= 16 && age < 18) {
            System.out.println("Ban " + name + " o do tuoi truong thanh.");
        } else {
            System.out.println("Ban " + name + " da gia.");
        }
        // cuoi cung la dung `if, else` de kiem tra do tuoi
        scanner.close();

    }
}

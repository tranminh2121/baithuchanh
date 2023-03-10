package cau_truc_switch_case;

import java.util.Scanner;

public class Slide40 {

    public static void main(String[] args) {
        int Date;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Mời bạn nhập số thứ thự từ 1 đến 7: ");
        Date = scanner.nextInt();
        switch (Date) {
            case 1:
                  System.out.println("\n Hom nay la thu 2: ")
                break;
             case 2:
                  System.out.println("\n Hom nay la thu 3: ")
                    break;
             case 3:
                   System.out.println("\n Hom nay la thu 4: ")
                break;
             case 4:
                   System.out.println("\n Hom nay la thu 5: ")
                break;
             case 5:
                    System.out.println("\n Hom nay la thu 6: ")
                    break;
             case 6:
                    System.out.println("\n Hom nay la thu 7: ")
                        break; 
            case 7:
                     System.out.println("\n Hom nay la chu nhat: ")
                            break;
            default:
                break;
        }
    }
}
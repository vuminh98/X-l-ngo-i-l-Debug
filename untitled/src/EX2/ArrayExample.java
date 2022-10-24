package EX2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so cua mot phan tu bat ky: ");
        int x= scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so " + x + " la" + arr[x] );

        }catch (IndexOutOfBoundsException e) {
            System.out.println("Chi so vuot qua gioi han cua mang");
        }
    }
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + "");
        }
        return arr;
    }
}

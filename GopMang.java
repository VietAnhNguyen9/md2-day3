import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr1 = new int[4];
        int[]arr2 = new int[3];
        int[]arr3 = new int [arr1.length + arr2.length];
        int j = 0;
        for (int i = 0;i<arr1.length;i++) {
            System.out.println("Nhập các phần tử mảng 1 ở vị trí "+ i+" : ");
            arr1[i] = scanner.nextInt();
            arr3[i] = arr1[i];
        }
        for (int i = 0;i<arr2.length;i++) {
            System.out.println("Nhập các phần tử mảng 2 ở vị trí "+ i+" : ");
            arr2[i] = scanner.nextInt();
        }
        for (int i=arr1.length;i<arr3.length;i++) {
            arr3[i] = arr2[j];
            j++;
        }
        for (int a:arr3
             ) {
            System.out.print(a);
        }
    }
}

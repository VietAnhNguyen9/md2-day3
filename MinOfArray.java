import java.util.Scanner;
public class MinOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int size = scanner.nextInt();
        int[]arr = new int[size];
        for (int i = 0;i<arr.length;i++) {
            System.out.println("Nhập phần tử tại vị trí thứ "+ i);
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int j=0;j<arr.length;j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println(max);
    }
}

import java.util.Scanner;

public class TongCacSoMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng 2 chiều:");
        int size = scanner.nextInt();
        System.out.println("Nhập độ dài mảng con:");
        int sizeMin = scanner.nextInt();
        double[][]arr = new double[size][sizeMin];
        for(int i = 0;i < size;i++) {
            for (int j = 0;j < sizeMin;j++) {
                System.out.println("Nhập phần tử ở vị trí "+i+j);
                arr[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Nhập vị trí cột cần tính tổng: ");
        int row =scanner.nextInt();
        double total = 0;
        for(int i=0;i < size;i++) {
            total += arr[i][row];
        }
        System.out.println(total);
    }
}

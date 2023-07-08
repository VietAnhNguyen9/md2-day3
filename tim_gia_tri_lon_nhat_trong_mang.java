import java.util.Scanner;
public class tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng tỷ phú");
            size = scanner.nextInt();
            if (size>20) {
                System.out.println("Nhập lại!");
            }
        }while (size>20);
        array = new int[size];
        int i=0;
        while (i < array.length) {
            System.out.println("Nhập số lượng tài sản: ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Danh sách");
        for (int j=0;j<array.length;j++) {
            System.out.println(array[j]+"\t");
        }
        int max = array[0];
        int index = 1;
        for (int k=0;k<array.length;k++) {
            if (array[k]>max) {
                max = array[k];
                index = k+1;
            }
        }
        System.out.println("GTLN là: "+max+" tại vị trí: "+index);
    }
}

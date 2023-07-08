import java.util.Scanner;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr = {1,2,4};
        int[]newArr = new int[arr.length+1];
        System.out.println("Nhập x là số cần chèn: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí của x trong mảng: ");
        int index = scanner.nextInt();
        if ((index <= -1) || (index > arr.length-1)) {
            System.out.println("Không chèn được!");
        }else{
            int j =0;
            for (int i=0;i<newArr.length;i++) {
                if (index == i) {
                   newArr[i] = x;
                }else {
                    newArr[i] = arr[j];
                    j++;
                }
            }
            System.out.println("Mảng sau khi thêm phần tử là: ");
            for (int a:newArr) {
                System.out.print(a +" ");
            }

        }
    }
}

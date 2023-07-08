import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr = {1,2,3,4,5,6,7};
        System.out.println("Nhập số nguyên x:");
        int x = scanner.nextInt();
        int index = -1;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Phần tử x không xuất hiện trong mảng !");
        }else{
            for (int i = index;i<arr.length-1;i++) {
                arr[i] = arr[i+1];
            }

            int[]newArr = new int[arr.length-1];
            for (int i = 0;i<newArr.length;i++) {
                newArr[i]=arr[i];
            }
            System.out.println("Mảng sau khi xóa phần tử: ");
            for (int a:newArr) {
                System.out.println(a+" ");

            }
        }

    }
}

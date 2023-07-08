import java.util.Scanner;

public class DemSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số sinh viên cần xét: ");
        int count = scanner.nextInt();
        if (count > 30) {
            System.out.println("Chỉ nhập tối đa 30 sinh viên !");
        }else if (count < 1) {
            System.out.println("Nhập lại !");
        }else {
            int[]arr = new int[count];
            int i =0;
            while (i < count) {
                System.out.println("Nhập số điểm thí sinh thứ "+(i+1)+" :");
                arr[i] = scanner.nextInt();
                i++;
            }
        for(int j = 0;j< arr.length;j++) {
            if (arr[j] > 5 && arr[j] <=10) {
                System.out.println(arr[j]);
            }
        }

        }
    }
}

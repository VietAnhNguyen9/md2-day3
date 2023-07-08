import java.util.Scanner;
public class tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Nhập tên: ");
        String input_name = scanner.nextLine();
        boolean check = false;
        for(int i=0;i< students.length;i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Tên vừa nhập thuộc danh sách,tại vị trí i= "+i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không có tên trong danh sách");
        }
    }
}

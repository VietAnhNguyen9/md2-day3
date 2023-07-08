import java.util.Scanner;
public class MaxInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][]matrix = {{1.2,2.3,4.5},{3.9,7.2,9.9}};
        double max = matrix[0][0];
        int x=0;
        int y=0;
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[i].length;j++) {
                if (matrix[i][j]>max) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: "+max+" có tọa độ là: "+x+y);
    }
}


import java.util.Scanner;

/*
Вариант 9
В одномерном массиве, состоящем из n вещественных элементов, вычислить:
1) максимальный по модулю элемент массива;
2) сумму элементов массива, расположенных между первым и вторым положительными элементами.
 */

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        double[] a = new double[n];
        double max = a[0], sum = 0;

        System.out.println("Enter elements of the array: ");

        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if(max < Math.abs(a[i])) {max = a[i];}

        }
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
            if (n - i != 1) {
                if (i > 0) {
                    if (a[i - 1] > 0 && a[i + 1] > 0) {
                        sum++;
                    }
                } else if (a[i] > 0 && a[i + 1] > 0) {
                    sum++;
                }
            }
        }

        System.out.println("Max element: " + max);
        System.out.println("Sum: " + sum);

        /*  Вариант 9
        Дана целочисленная прямоугольная матрица. Определить:
        1) Произведение элементов тех столбцов, которые содержат только положительные элементы
        2) Номера столбцов, все элементы которых упорядочены по убыванию
        */

        System.out.println("Enter the size of the matrix: ");
        int k = scanner.nextInt();

        double[][] matrix = new double [k][k];
        double[] p = new double [k];
        double[] g = new double [k];
        int s = 0;


        System.out.println("Input elements: ");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            p[i] = 1;
            for (int j = 0; j < k; j++) {
                if(matrix[0][j] > 0) {p[j] *= matrix[0][j];} else p[j] = 0;
                if(i+1<k) {if (matrix[i][j] > matrix[i + 1][j]) s++;}
                if (s == k) g[j] = i; else g[j] = 0;
            }
        }
            System.out.println("\nThe product of the elements of those columns that contain only positive elements:");
            for (int j = 0; j < k; j++) {
                System.out.print(p[j] + "  ");
            }
            System.out.println("\nColumn numbers, all elements of which are sorted in descending order:");
            for (int j = 0; j < k; j++) {
            System.out.print(g[j] + "  ");
            }

    }

}
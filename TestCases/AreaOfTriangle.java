package TestCases;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
         * System.out.print("Enter the base: ");
         * float b = s.nextInt();
         * System.out.print("Enter the height: ");
         * float h = s.nextInt();
         * float area= (b*h)/2;
         * System.out.println("Area of Triangle: "+String.format("%.2f", area));
         */
        System.out.print("ENter the radius of the circle:");
        float r = s.nextInt();
        double area2 = 3.14 * (Math.pow(r, 2));
        System.out.println("Area of circle: " + String.format("%.2f", area2));

        s.nextLine();

        String str = s.nextLine();
        String str1[] = str.split(" ");
        int i = Integer.parseInt(str1[0]);
        int k = Integer.parseInt(str1[1]);
        if (i >= 1 && i <= 5 && k >= 1 && k <= 50)
            System.out.println("A^B= " + (int) (Math.pow(i, k)));

        s.nextLine();
        System.out.print("Enter the Length: ");
        int N = s.nextInt();
        int arr[] = new int[N];
        for (int j = 0; j < N; j++) {
            arr[j] = s.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int p = s.nextInt();
        for (int d = 0; d < N; d++) {
            if (arr[d] == p) {
                System.out.println("Yes it contains");
                break;
            }

            else {
                System.out.println("No. It does not contain");
                break;
            }

        }
    }
}

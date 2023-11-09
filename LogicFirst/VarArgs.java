package LogicFirst;

import javax.lang.model.element.VariableElement;

public class VarArgs {
    static int variableLength(int... values) { // SE 5.0
        
        if (values.length == 0) {
            System.out.println("no values passed");
            return 0;
        }
        System.out.println();
        int min = values[0];
        System.out.print("The argument length: " + values.length);
        System.out.println();
        System.out.println("The argument values are: ");
        for (int i : values) {
            System.out.println(i);
        }
        for (int k : values) {
            if (k < min)
                min = k;
        }
        return min;
    }

    static double variableLength(double... values) { // SE 5.0

        if (values.length == 0) {
            System.out.println("no values passed");
            return 0;
        }

        double min = values[0];
        System.out.print("The argument length: " + values.length);
        System.out.println();
        System.out.println("The argument values are: ");
        for (double i : values) {
            System.out.println(i);
        }
        for (double k : values) {
            if (k < min)
                min = k;
        }
        return min;
    }

    public static void main(String[] args) {
        int m = variableLength(20, 42, 62);
        System.out.print("The minimum value of the values passed to the arguments is " + m);
        int[] l = {};
        int n = variableLength(l);
        System.out.print("The minimum value of the values passed to the arguments is " + n);

        double a = variableLength(20.1, 42.2, 62.2);
        System.out.print("The minimum value of the values passed to the arguments is " + a);
        double[] b = {};
        double c = variableLength(b);
        System.out.print("The minimum value of the values passed to the arguments is " + c);

    }
}

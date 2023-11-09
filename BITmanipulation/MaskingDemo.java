package BITmanipulation;

public class MaskingDemo {
    public static void main(String[] args) {
        /*
        MaskON
         * int a = 36;
         * int i = 3;
         * int MaskOn = 1<<i;
         * System.out.println(a|MaskOn);
         */

         //MaskOFF
        /*int a = 36;
        int i = 5;
        int MaskOff = ~(1 << i);
        System.out.println(a & MaskOff);*/

        int a = 36, i = 5;
        int maskC= 1<<i;
        if((a&maskC)==0){
            System.out.println("Off");
        }else{
            System.out.println("On");
        }
    }
}

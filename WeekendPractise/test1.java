xxspackage WeekendPractise;


public class test1 {
    public static void main(String[] args) {
        int[] arr = { 121,13,15, 17, 31, 5, 999991, 23,25 };
        int[] primeArr = PrimeLogic.Prime(arr);
        for (int prime : primeArr) {
            System.out.println(prime + " ");
        }
    }
}

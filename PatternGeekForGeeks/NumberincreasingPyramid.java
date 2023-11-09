package PatternGeekForGeeks;

public class NumberincreasingPyramid {
    public static void PatternPrint(int n ){
        int i,j;
        for( i =1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 6;
        PatternPrint(n);

    }
}
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
 */
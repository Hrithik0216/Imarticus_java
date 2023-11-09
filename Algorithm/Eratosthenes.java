package Algorithm;

public class Eratosthenes {
    static void CheckPrime(int n){
        boolean [] prime = new boolean [n+1];
        int i, j;
        for(i=2;i<=Math.sqrt(n);i++){
            if(prime[i]==false){
                for(j=i*2;j<n;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(i=2;i<=n;i++){
            if(prime[i]==false){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        CheckPrime(2);
    }
}

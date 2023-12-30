package WeekendPractise;

public class lexicography {
    public static void main(String[] args) {
       
        String  a ="cbabc";
        System.out.println(lexi(a));
        
    }
    private static String lexi(String s){
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)=='a'){
            i++;
        }
        if(i==n){
            char[] ch = s.toCharArray();
            ch[n-1]='z';
            return String.valueOf(ch);
        }
        
        char[]ch = s.toCharArray();
        // int i=0;
        while(i<n && ch[i]!='a'){
            ch[i]-=1;
            i++;
        }
        System.out.println(s);
        return String.valueOf(ch);
    }
}

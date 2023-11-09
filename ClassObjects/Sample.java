package ClassObjects;

public class Sample {
    int x = 25;
    int bornYear;
    String realName;
    public Sample(int year, String name){
        bornYear = year;
        realName = name;
    }
    public static void main(String[] args) {
        Sample MyObj1 = new Sample(2001,"Hrithik");
                System.out.println("My name is "+MyObj1.realName+" and I was born on "+MyObj1.bornYear);

    }
}

package TestCases;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in); // create a new scanner object of variable name "a"
        int id, sal, Nsal;
        long ph;
        String add, name;

        id = a.nextInt();
        name = a.nextLine();
        a.nextLine();
        add = a.nextLine();
        ph = a.nextLong();
        sal = a.nextInt();

        if(sal<=20000){
            Nsal = sal+5000;
        }else if (sal<=30000){
            Nsal = sal +7000;
        }else if (sal<=50000){
            Nsal = sal +8000;
        }else{
            Nsal=sal+10000;
        }

        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + add);
        System.out.println("Contact: " + ph);
        System.out.println("Salary: " + Nsal);
    }

}

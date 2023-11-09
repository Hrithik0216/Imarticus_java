package ClassObjects;

import java.util.Scanner;

public class First {
    String stud_name; //class variables or state variables because state is nothing but the data
    int stud_roll;

    void print(int id , String name){ //method
        stud_roll=id;
        stud_name=name;
        System.out.println("Student name: "+ stud_name);
        System.out.println("Student ID: "+stud_roll);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the student ID: ");
        int id = s.nextInt();
        System.out.print("Enter the student name: ");
        String name =  s.next();
        First myObj = new First();
        myObj.print(id,name);
    }
}

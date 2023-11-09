package Access_modifiers.sub_modifiers;

import Access_modifiers.Private_Class;

public class Default_Modifier {

    static int emp_id;
    String emp_name;
    void setEmp(){
        emp_id=1;
        emp_name = "Hrithik";
    }

    void getEmp(){
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);

    }

    public static void main(String[] args) {
        //second myObj3= new second();
        Private_Class myObj4 = new Private_Class();
        System.out.println(myObj4.b);
        Default_Modifier myObj5 = new Default_Modifier(); 
        myObj5.setEmp();
        myObj5.getEmp();
    }
}

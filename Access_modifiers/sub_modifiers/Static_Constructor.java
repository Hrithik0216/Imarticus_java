package Access_modifiers.sub_modifiers;

public class Static_Constructor {
    int emp_id;
    String emp_name;

    public Static_Constructor(){
        emp_id=1;
        emp_name="Hrithik";
    }
    void getEmp(){
        System.out.println("Id: "+emp_id);
        System.out.println("Name: "+emp_name);
    }
    public static void main(String[] args) {
        Static_Constructor myObj6 = new Static_Constructor();
        myObj6.getEmp();
        
        
    }
}

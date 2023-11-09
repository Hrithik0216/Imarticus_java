package LogicFirst;

public class inheritanceEx {
    public static class employee{
         private String name;
        private double salary;
        private int joiningDate;

        //Create  constructor
        employee(String n, double s, int d){
            name = n;
            salary = s;
            joiningDate = d;
        }
        //getter method to display
        String getName(){
            return name;
        }
        double getSalary(){
            return salary;
        }

        int getDate(){
            return joiningDate;
        }

        //setter method to set
        void setName(String n){
            name = n;
        }
        void setSalary(double s){
            salary = s;
        }

        void setDate(int d){
            joiningDate=d;
        }

        void raiseSalary(double percent){
            salary+=salary*(percent/100);
        }

        int displaayDate(int date){
            return date;
        }
        

    }
    public static class Manager extends employee{
        double bonus;
        Manager(String n, double b, double s, int d){
            super(n, s, d);
            this.bonus=b;
        }

        public void setBonus(double b){
            bonus = b;
        }
       public double getSalary(){
            return super.getSalary()+bonus; //here get salary is inherited from the super class(method over-riding)
        }
        

    }
    public static void main(String[] args) {
        employee e1 = new employee("Hrithik", 35000, 22);//using constructor
        e1.raiseSalary(25);
        System.out.println(e1.getSalary());//using get method
        System.out.println(e1.displaayDate(20));

        Manager m1 = new Manager("Jphn", 2000, 50000,25);
        m1.setBonus(5000);
        System.out.println(m1.getSalary());

        //create an array of employee objects
        employee [] employees = new employee[5];
        employees[0]=new employee("Hrithik", 10000, 1);
        employees[1]=new employee("Arun", 20000, 1);
        employees[2]=new employee("Kumar", 30000, 1);
        employees[3]=new employee("Shan", 40000, 1);
        employees[4]=m1;

        for(employee e: employees){ //dynamic binidng for manager salary (sal+bonus) different behaviour based on which object it points
            System.out.println("Name: "+e.getName());
            System.out.println("salary:"+e.getSalary());
            System.out.println("Joioning date: "+e.getDate());
        }
    } 
    
}
//Now create an array of objects to get multiple employee details
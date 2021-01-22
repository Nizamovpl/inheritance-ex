//Class Employee: subclass of Person

public class Employee extends Person {

    private double payRate;    

    private double hoursWorked;

    private String department;

    private double wage; 

    public final int HOURS = 40;

    public final double OVERTIME = 1.5;

    //constructor
     public Employee() {
        
        super();
        payRate = 0;
        hoursWorked = 0;
        department = "";

     }

     public Employee(int payRate, int hoursWorked, String department) {
        super();
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.department = department;

     }
    

    

     public String toString() {
       //replace xxx with person name
       //replace wage with wage wghen done

        return "The wages for" + "xxx" + department + "are : $ " + wage; 

     }

 

     public void print() {

        //insert Wage when done


        System.out.println(" The employee xxxx from the" + department+" worked" +hoursWorked + " hours with a pay rate of"+ payRate + "The wages for this employee are $xxxxx.xx"); 

     }


     public double calculatePay() {

        if(hoursWorked > HOURS){
            wage = hoursWorked * payRate * OVERTIME; 
        }else{
            wage = hoursWorked * payRate; 
        }
            return wage; 

     }

     public void setAll(String first, String last, double rate, double hours, String dep){


     }

 

     public double getPayRate() {
        return 0.0; 
     }

 

    

     public double getHoursWorked() {
        return 0.0; 

     }

    

    

     public String getDepartment() {

        return "hi"; 

     }

    

     public boolean equals(Object o) {

    
        return true; 
     }

    

     public Employee getCopy() {

      

     }

    

     public void copy(Employee e) {


     }

      

}

 
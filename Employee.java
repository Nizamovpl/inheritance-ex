//Class Employee: subclass of Person

public class Employee extends Person {

    private double payRate;    

    private double hoursWorked;

    private String department;

   

    public final int HOURS = 40;

    public final double OVERTIME = 1.5;

   

     //default constructor

     public Employee() {


     }

 

     //add an alternate constructor with parameters

    

    

     public String toString() {
        
        return "hi"; 

         //should return a String like this:

         //The wages for xxxx from the xxxx department are: $xxxxx.xx"

 

     }

 

     public void print() {

       //Should print output like this (same line):

       //The employee xxxx from the xxxx department worked xx hours

       //with a pay rate of $xxx.xx. The wages for this employee are $xxxxx.xx
     }

 

    

     public double calculatePay() {

        //Method to calculate and return the wages

        //handle both regular and overtime pay

        return 0.0; 
 

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

 
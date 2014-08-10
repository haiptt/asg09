/* Name : Le Van Hung
 *Class : K55CD
 */
  public class SalariedEmployee extends Employee
   {
      private double weeklySalary;
      public SalariedEmployee( String first, String last, String ssn, Date ns, double salary ){
        super( first, last, ssn, ns );
        setWeeklySalary( salary ); 
    } 
     public void setWeeklySalary( double salary ){
        weeklySalary = salary < 0.0 ? 0.0 : salary; // if (slary < 0) weeklySalary = 0; else weeklySalary = salary;
     }
	public double getWeeklySalary(){
        return weeklySalary;
     } 

     public double earnings(){                                                                   
        return getWeeklySalary() + addbonus();                                        
     }    
	 public String toString(){                                    
	 return String.format( "salaried employee: %s\n%s: $%,.2f",
           super.toString(), "weekly salary", getWeeklySalary() );
     }                                    
  } 


/* Name : Le Van Hung
 *Class : K55CD
 */
public abstract class Employee{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private Date birthDate;
 //  private double bonus;


   public Employee( String first, String last, String ssn, Date ns ){
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
	  birthDate = ns;
   }
	public void setFirstName( String first ){
      firstName = first;
   } 
	public String getFirstName(){
      return firstName;
   }    
   public void setLastName( String last ){
      lastName = last;
   }    
   public String getLastName(){
      return lastName;
   } 
   public void setSocialSecurityNumber( String ssn ){
      socialSecurityNumber = ssn; 
   }  
   public String getSocialSecurityNumber(){
      return socialSecurityNumber;
   } 
   public void setbirthDate(Date ns){
		birthDate = ns;
		}
	public Date getbirthDate(){
		return birthDate;
		}
	
   public String toString(){
      return String.format( "%s %s \nDatebirth: %s\nsocial security number: %s", 
         getFirstName(), getLastName(), birthDate.toDateString(), getSocialSecurityNumber()  );
   }
		
	public double addbonus(){
		if(birthDate.getMonth() == 11) return 100.00;
		return 0.00;
		}
		
	public abstract double earnings(); 
} 

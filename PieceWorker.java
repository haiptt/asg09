/* Name : Le Van Hung
 *Class : K55CD
 */

public class PieceWorker extends Employee{
	private double wage; // the employee's wage per piece
	private int piece; // the number of pieces produced
	public PieceWorker( String first, String last, String ssn, Date ns, double wage, int piece ){
        super( first, last, ssn, ns );
        setWage( wage);
		setPiece( piece);
    }
	public void setWage(double wage){
			this.wage = (wage < 0.0 ) ? 0.0 : wage;
			}
	public void setPiece(int piece){
			this.piece = ( piece < 0 ) ? 0: piece;
				}
		
		
	public double getWage(){
		return wage;
		}
	public int getPiece(){
		return piece;
		}
	public double earnings(){
		return getWage() * getPiece() + addbonus();
		}		
	
	public String toString(){
		return String.format( "PieceWorker employee: %s\n%s:%,.2f;  %s: %d", 
			super.toString(), "wage", getWage(), 
			"piece", getPiece() );
	} 
  }
		
		
			
			
		
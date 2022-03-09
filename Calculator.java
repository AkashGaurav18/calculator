class InvalidInputException extends Exception{
	@Override
	public String toString() {
return "Invalid Input";
}
	  @Override
	    public String getMessage() {
	return "Invalid Input" ;  
	}
}
	class MaxInputException extends Exception{
		@Override
		public String toString() {
return "No. is greater then 100000";
		}  
		@Override
	    public String getMessage() {
			return "No. is greater then 100000";
		}
	}	
	class MaxMultiplyReachedException extends Exception{
		@Override
		public String toString() {
		return	" Any one of the Input is greater then 7000";
	}
		@Override
	    public String getMessage() {
			return	" Any one of the Input is greater then 7000";
		}
	}
	class CannotDivideBy0Exception extends Exception{
		@Override
		public String toString() {
		return	"Not divisible by 0";
			}
		@Override
	    public String getMessage() {
			return	"Not divisible by 0";
		}
	}
	class Calc{
		public static double add(double a,double b)throws InvalidInputException,MaxInputException{
	if(a>=100000 || b>=100000) {
			throw new MaxInputException();
		}
		else if(a==8 || b == 9) {
				throw new InvalidInputException();
			}
		else {
		return a+b;
	}
		}
	public static double subtract(double a, double b) throws  MaxInputException{
			if(a>=100000 || b>=100000) {
			throw new MaxInputException();
			}
			return a-b;
		}
	public static double multiplication(double a ,double b)throws MaxMultiplyReachedException, MaxInputException{
			if(a>=100000 || b>=100000) {
				throw new MaxInputException();
			}
		else if(a>=7000 || b>=70000) {
				throw new MaxMultiplyReachedException();
			}
				return a*b;
		}
	public static double division(double a ,double b)throws CannotDivideBy0Exception, MaxInputException{
			if(a>=100000 || b>=100000) {
			throw new MaxInputException();
			}
		else if(b==0) {
				throw new CannotDivideBy0Exception();
			}
				return a/b;
			}
	}
public class Calculator {
	public static void main(String[] args) throws InvalidInputException,CannotDivideBy0Exception,MaxMultiplyReachedException,MaxInputException{
System.out.println(Calc.add(5,2));
System.out.println(Calc.division(500,12));
}
}
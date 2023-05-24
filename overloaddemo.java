class Multiplication{
int multiply(int x,int y)
{
		int res=x*y;
		System.out.println("\t Res="+res);
  	
		return(res);
}
	            int multiply(int x,int y,int z){
		int res =x*y*z;
		System.out.println("\t Res="+res);
		return(res);
}
	            double multiply(double x,double y){
	  	double res=x*y;
		System.out.println("\t Res="+res);
		return(res);
	}
}

public class overloaddemo{
	public static void main(String[]args)
{
		Multiplication m1=new Multiplication();
		m1.multiply(2,3);
		m1.multiply(2,3,25);
		m1.multiply(2.5,3.5);
	}
}
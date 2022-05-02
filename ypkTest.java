package schildtPack;
public class ypkTest 
{
	void test(int a)
	{
		System.out.println(a + " ");
	}
	void test(int a, int b) {
		System.out.println(a + " " + b + " ");
	}
	double test(double a) {
		System.out.println((int) a);
		return a * a;
	}

	
	public static void main(String[] args) 
	{
		ypkTest ob = new ypkTest();
		double result;
		ob.test(10);
		ob.test(10,20);
		result = ob.test(123.25);
    }
}


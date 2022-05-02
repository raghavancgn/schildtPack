package schildtPack;
//A simple interface 
interface In1{
	//public, static and final
	final int a = 10;
	String s1 = "My name is so so ";
	//public and abstract
	void display();
}

//A class that implements the interface
 class TestClass implements In1 {
	 //implementing the capabilities of interface
	 public void display() {
		 System.out.println("Geek");
	 }
//Driver code
	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
		System.out.println(s1);
	}
}
package schildtPack;
interface printable{
	void print();
}
class A6 implements printable {
	public void print()
	{
		System.out.println("Hellow !!");
	}
	public static void main(String[] args) {
		A6 obj = new A6();
		obj.print();
	}
}

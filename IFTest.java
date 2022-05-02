package schildtPack;
//Define an integer stack interface
interface intStack{
	void push1(int item);  // store an item
	int pop();
	void push(int item);
	int pop1();            // retrieve an item
}
//An implementation of IntStack that uses fixed storage.
 class FixedStack implements intStack {
	 private int stck[];
	 private int tos;
	 
	 //allocate and initialize stack
	 FixedStack(int size){
		 stck = new int [size];
		 tos = -1;
	 }
	 //push an item onto the stack
	 public void push1(int item) {
		 if(tos==stck.length-1) //use length number
			 System.out.println("Stack is full. ");
		 else
			 stck[++tos] = item;
	 }
		 //pop an item from the stack
		 public int pop1() {
			 if (tos < 0) {
				 System.out.println("Stacj underflow..");
				 return 0;
			 }
			 else
				 return stck[tos--];
	 }
	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}
 }
class IFTest {
	public static void main(String[] args) {
		FixedStack mystack1 = new FixedStack(5);
		FixedStack mystack2 = new FixedStack(8);
		//push some numbers onto the stack
		for(int i=0; i<5; i++) mystack1.push1(i);
		for(int i=0; i<8; i++) mystack2.push1(i);
		
		//pop those numbers off the stack
		System.out.println("Stack in mystack1: ");
		for(int i=0; i<5; i++) System.out.println(mystack1.pop1());
		System.out.println("Stack in mystack2: ");
		for(int i=0; i<8; i++) System.out.println(mystack2.pop1());
		
	}
}
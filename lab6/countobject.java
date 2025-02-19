//WAP that counts the number of objects created using static.

class countobjects{

	static int count=0;

	public countobjects(){
		count++;
	}
}

public class countobject{
	public static void main(String[] args){

		countobjects c1 = new countobjects();
		countobjects c2 = new countobjects();

		System.out.print("total object = "+c1.count);
	}
}
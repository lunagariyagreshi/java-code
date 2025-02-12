

import java.util.*;

class lab64{

	String line;

	public void countVowel(){
		 int a=0,e=0,i=0,o=0,u=0;
		for(int j=0;j<line.length();j++){
			char ch = line.charAt(j);
			if(ch =='a'){
				a++;
			} else if(ch == 'e'){
				e++;
			} else if(ch == 'i'){
				i++;
			} else if(ch == 'o'){
				o++;
			} else if(ch == 'u'){
				u++;
			}
		}
		System.out.println("a="+a+"  e="+e+"  i="+i+"  o="+o+"  u="+u);
	}
}

public class count{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		lab64 v = new lab64();

		while(true){

			System.out.println("Enter sentence ");
			v.line = sc.nextLine();

			if(v.line.equals("quit")){
				break;
			} else {
				v.countVowel();
			}
		}
	}
}
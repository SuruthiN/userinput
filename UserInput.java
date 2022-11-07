package myproj;
import java.util.Scanner;

public class UserInput{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String string=new String();
		Scanner input=new Scanner(System.in);
		while(true){
		  System.out.println("Enter the string");
		    s=input.nextLine();
            if(s.equals("exit")) {
            	break;
            }
	
            string+=s;	
	}

	     System.out.println(" String exited"+string);

}
}		
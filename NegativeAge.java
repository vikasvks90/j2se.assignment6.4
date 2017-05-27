/**
* <h1>NegativeAge</h1>
* This program will get age from user 
* if the age is negative
* it will throw a custom exception
* @author  Vikas
* @version 1.0
* @since   2017-05-27 
*/
package assignment6.session4;

import java.util.Scanner;

public class NegativeAge {
	String name;
	int age;
	
	public NegativeAge(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NegativeAge negativeAge = new NegativeAge("Ram");
		System.out.println("Please enter the age of "+negativeAge.name);
		//will get the age from the user
		Scanner sc = new Scanner(System.in);
		negativeAge.age = sc.nextInt();
		//if age is negative will throw exception
		if(negativeAge.age < 0){
			try {
				throw new NegativeAgeException("Age can not be negative");
			} catch (NegativeAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				sc.close();
			}
		}
		else{
			System.out.println(negativeAge.name+"'s age is: "+negativeAge.age);
		}
	}

}

//user defined class for throwing an exception
class NegativeAgeException extends Exception{
	NegativeAgeException(String s){  
		super(s);  
	}  
}
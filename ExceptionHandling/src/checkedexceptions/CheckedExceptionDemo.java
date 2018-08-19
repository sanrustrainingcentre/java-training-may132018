package checkedexceptions;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		DatabaseConnection connection = new DatabaseConnection();
		
		try {
			int result = (1 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		try {
			int index = 10;
			int[] nums = {1, 2, 3};
//			if (index < nums.length) {
//			System.out.println(nums[index]);					
//			}
			
			System.out.println(nums[index]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		try {
			connection.connect("db_1", "user123", "password123");	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try {
//			
//		} catch (IOException e) {
//			
//		}
		
		
		try {
			int[] nums = {10, 20, 30, 40};
			int result = nums[1] / 0;
			connection.connect("db_123", "user234", "pwd135");
		} 
		catch (IOException e) {
			
		} 
		catch (ArithmeticException e) {
				
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			
		} 
		catch (Exception e) {
			
		} 
		finally {
			
		}
		
		
	}

}

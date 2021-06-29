package mock.test;

public class ReversePrograms {



	public static void main(String[] args) {
		String s="Hello";
	
		// convert string to char array

		char input[]=s.toCharArray();

		// now traverse the characters in array from left to right

		for(int i = input.length-1; i>=0;i--){

			System.out.print(input[i]);
		}

	}
}

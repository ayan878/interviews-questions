package string;

public class reverseString {
	
	public static String revString(String str) {
		if(str==null||str.isEmpty()) {
			return str;
		}
		char[] characters=str.toCharArray();
		int start =0;
		int end=characters.length-1;
		
		while (start<end) {
			char temp=characters[start];
			characters[start]=characters[end];
			characters[end]=temp;
			start++;
			end--;
			
		}
		return new String(characters);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		System.out.println(revString(str));


	}

}

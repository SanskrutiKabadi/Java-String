import java.io.*;
class String_Length{
	static int MyLengthFunc(String s){
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++){
			count++;
		}	
		return count;

	}	

												
	public static void main(String[] args)throws Exception{
	String str;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String:");
	str=br.readLine();
	int length=MyLengthFunc(str);
	System.out.println("Length = "+length);
	
	
	
	
	
	
	}











}

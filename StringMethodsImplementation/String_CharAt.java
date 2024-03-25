import java.io.*;
class String_CharAt{
	static char MyCharAt(String str,int i){
		char chr='#';
		char s[]=str.toCharArray();
		int len=s.length;
		if(i<len){
			chr=s[i];
		}
		
	
		return chr;
	}


	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1;
		int index;
        	System.out.println("Enter the string:");
        	str1=br.readLine();
		System.out.println("Enter the index:");
        	index=Integer.parseInt(br.readLine());
		if(MyCharAt(str1,index)!='#'){
			System.out.println("Character found at index "+index+" : "+MyCharAt(str1,index) );
		}
		else{
		 System.out.println("String index out of bound Exception");
		
		}
		
	}
	
}

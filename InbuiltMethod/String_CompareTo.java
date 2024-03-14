import java.io.*;
class StringCompareTo{
       public static void main(String[] args)throws Exception{
       		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       		String str1,str2;
       		System.out.println("Enter the String1:");
       		str1=br.readLine();
       		System.out.println("Enter the String2:");
       		str2=br.readLine();
       		System.out.println(str1.compareTo(str2) );

  }

}              

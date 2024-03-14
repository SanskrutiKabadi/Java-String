import java.io.*;
class StringCharAt{
       public static void main(String[] args)throws Exception{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String str1;
		int index;
                System.out.println("Enter the String:");
                str1=br.readLine();
                System.out.println("Enter the index:");
                index=Integer.parseInt(br.readLine());
                System.out.println(str1.charAt(index) );

  }

}


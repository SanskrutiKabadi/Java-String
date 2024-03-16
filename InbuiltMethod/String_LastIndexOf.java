import java.io.*;
class StringLastIndexOf{
       public static void main(String[] args)throws Exception{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String str;
                char ch;
                int Index=0;
                System.out.println("Enter the String:");
                str=br.readLine();
                System.out.println("Enter the  index upto to  which you want to search the character :");
                Index=Integer.parseInt(br.readLine());
                System.out.println("Enter the character:");
                ch=(char)br.read();
                System.out.println(str.lastIndexOf(ch,Index));
		
  }

}

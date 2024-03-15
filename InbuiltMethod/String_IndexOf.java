import java.io.*;
class StringIndexOf{
       public static void main(String[] args)throws Exception{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String str;
                char ch;
		int Index=0;
                System.out.println("Enter the String:");
                str=br.readLine();
		System.out.println("Enter the Starting index from which you want to search:");
                Index=Integer.parseInt(br.readLine());
                System.out.println("Enter the character:");
		ch=(char)br.read();
                System.out.println(str.indexOf(ch,Index));

  }

}

import java.io.*;
class EqualsIgnoreCaseDemo{
        public static void main(String[] args)throws Exception{

                String str1,str2;
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the first string:");
                str1=br.readLine();
                System.out.println("Enter the second string:");
                str2=br.readLine();
                System.out.println(str1.equalsIgnoreCase(str2));









        }

}

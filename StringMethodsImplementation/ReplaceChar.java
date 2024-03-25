import java.util.*;
class ReplaceChar{
        static String MyReplacechar(String str,char ch1,char ch2){
                char s[]=str.toCharArray();
                int len=s.length;
		String newStr;
                        for(int i=0;i<len;i++){
                                if(s[i]==ch1){
                                        s[i]=ch2;
                                      
                                }
                        }
			newStr=s.toString();
                        return newStr;
               }
               
                public static void main(String[] args){
                	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner Sc=new Scanner(System.in);
                	String str;
                	System.out.println("Enter the string:");
                	str=Sc.nextLine();
                	System.out.println("Enter the character you want to replace:");
                	char oldChar=Sc.next().charAt(0);
			System.out.println( );
                	System.out.println("Enter the character by which you want to replace old char:");
                	char newChar=Sc.nextLine();

                	MyReplacechar(str, oldChar,newChar);
		}
	
}





















import java.util.*;
class CompareTo{
        static int CompareTo(String str1,String str2){
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		int a=-2;
                if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++){
				if(ch1[i]==ch2[i]){
					a=0;
					break;
				}
				else{
					
					a=ch1[i]-ch2[i];
					break;
				}
				
			
			}
		
		}
		else{
			if(str1.length()>str2.length()){
				
				a=1;
			}
			else{
				a=-1;
				
                        }

		}
		return a;
        }
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                System.out.print("Enter first string : ");
                String str1=Sc.nextLine();
                System.out.print("Enter Second string : ");
                String str2=Sc.nextLine();
                System.out.println(CompareTo(str1,str2));


        }

}

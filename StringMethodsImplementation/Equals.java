import java.util.*;
class Equals{
        static void Equals(String str1,String str2){
                char ch1[]=str1.toCharArray();
                char ch2[]=str2.toCharArray();
		int a=-1;
                if(str1.length()==str2.length()){
                        for(int i=0;i<str1.length();i++){
                                if(ch1[i]==ch2[i]){
                                        a=1;
                                }
                                else{

                                        a=0;
                                        break;
                                }


                        }
			if(a==1){
				 System.out.println("true");
			
			}
			else{
				 System.out.println("false");
			}
                }
                else{
                        System.out.println("false");

                }
                
        }
	public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                System.out.print("Enter first string : ");
                String str1=Sc.nextLine();
                System.out.print("Enter Second string : ");
                String str2=Sc.nextLine();
                Equals(str1,str2);


        }

}

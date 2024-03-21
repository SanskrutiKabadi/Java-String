import java.util.*;
class Concat{
	static void concats(String str1,String str2){
		int N,M,p;
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		N=ch1.length;
                M=ch2.length;
                p=N+M;
		char ch3[]=new char[p];

		for(int i=0;i<N;i++){
			ch3[i]=ch1[i];
		}
		int j=0;
		for(int i=N;i<p;i++){
                        ch3[i]=ch2[j];
        	        j++;
		}

		for(int i=0;i<p;i++){
                      System.out.print(ch3[i]);
                }
		System.out.println( );
	}
        public static void main(String[] args){
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter first string : ");
                String str1=Sc.nextLine();
		System.out.print("Enter Second string : ");
                String str2=Sc.nextLine();
		concats(str1,str2);
		

        }

}

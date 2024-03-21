import java.util.*;
class EqualEqual{
        static void EqualEqual(String str1,String str2){
                int a,b;
                a=System.identityHashCode(str1);
                b=System.identityHashCode(str2);
                if(a==b){
                        System.out.println("true");

                }
                else{
                        System.out.println("false");
                }

        }
        public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                String str1="Sanskruti";
                String str2="Sanskruti";
                //String str1=new String("Sanskruti");
                //String str2=new String("Sanskruti");
                //System.out.print("Enter first string : ");
                //String str1=Sc.nextLine();
                //System.out.print("Enter Second string : ");
                //String str2=Sc.nextLine();
                EqualEqual(str1,str2);


        }

}

import java.io.*;
class LastIndexOfff{
        static int MyLastIndexOf(String str,char ch,int index){
                int found=-1;
                char s[]=str.toCharArray();
                int len=s.length;
                if(index<len){
                        for(int i=index;i<len;i++){
                                if(s[i]==ch){
                                        found=i;
                                        
                                }
                        }
                         return found;
                }
                else{
                return -1;
                }

        }


        public static void main(String[] args)throws Exception{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                String str1;
                char ch;
                int index;
                System.out.println("Enter the string:");
                str1=br.readLine();
                System.out.println("Enter the index from you want search character:");
                index=Integer.parseInt(br.readLine());
                System.out.println("Enter the character:");
                ch=(char)br.read();
                if(MyLastIndexOf(str1,ch,index)!= -1){
                        System.out.println("Character "+ch+" found at index :"+MyLastIndexOf(str1,ch,index) );
                }
                else{
                 System.out.println(-1);

                }       
	}

}
















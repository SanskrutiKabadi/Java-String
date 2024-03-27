class StringBuffer2{
        public static void main(String[] args){
        StringBuffer str1=new StringBuffer("Sanskruti");
        System.out.println(System.identityHashCode(str1));

        StringBuffer str2=new StringBuffer("Kabadi");
        str1=str1.append(str2);
        System.out.println(System.identityHashCode(str1));

	StringBuffer str3=new StringBuffer("Sanskruti");
	System.out.println(System.identityHashCode(str3));

 	StringBuffer str4=new StringBuffer("Sanskruti");
	System.out.println(System.identityHashCode(str4));
        }


}
                   

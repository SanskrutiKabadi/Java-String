class String2{
        public static void main(String[] args){
                String str1="Sanskruti";
                String str2="Sanskruti";
		String str3=new String("Sanskruti");
                String str4=new String("Sanskruti");
                
                System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
                System.out.println(System.identityHashCode(str4));
        }


}

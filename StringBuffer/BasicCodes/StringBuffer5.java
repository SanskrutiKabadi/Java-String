class StringBuffer5{
        public static void main(String[] args){
        StringBuffer str1=new StringBuffer(100);
	str1.append("Forest");
	str1.append("Film");
	System.out.println(str1);
	System.out.println(str1.capacity());
	System.out.println(System.identityHashCode(str1));
        str1.append("Shooting");
	System.out.println(str1);
        System.out.println(str1.capacity());
	System.out.println(System.identityHashCode(str1));




        }


}

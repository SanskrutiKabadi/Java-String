class StringBuffer1{
        public static void main(String[] args){
        StringBuffer str=new StringBuffer(100);
	str.append("Sanskruti");
 	str.append("Kabadi");
	System.out.println(str);
 	System.out.println(str.capacity());    
	str.append("Sits");
        System.out.println(str);
        System.out.println(str.capacity());

        }


}

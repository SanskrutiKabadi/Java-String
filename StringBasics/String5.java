class String5{
        public static void main(String[] args){
                String str1="Sanskruti";
                String str2="Kabadi";
                System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));

                str1.concat(str2);

                System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));


        }
}

public class ReverseNumber {
    public static void main(String[] args) {
        int num=1234;

        //1. using algorithm
//        int temp=num;
//        int rev=0;
//        while(num!=0){
//            rev=rev*10 + num%10;
//            num=num/10;
//        }

        //2.Using StringBuffer class
        StringBuffer rev;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        rev=sb.reverse();
        System.out.println("Reverse of "+num+" is "+rev);

    }
}

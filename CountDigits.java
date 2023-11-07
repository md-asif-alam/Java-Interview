public class CountDigits {
    public static void main(String[] args) {
        int num=123456;
        int temp=num;

        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Number of digit in "+temp+ " is "+count);
    }
}

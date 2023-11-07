public class EvenOddCountDigit {
    public static void main(String[] args) {
        int num=123456;

        int oddCnt=0;
        int evenCnt=0;

        while(num>0){
            int r=num%10;
            if(r%2==0){
                evenCnt++;
            }else{
                oddCnt++;
            }
            num/=10;
        }
        System.out.println("Number of Even and Odd Digits are "+evenCnt+" and "+oddCnt);
    }
}

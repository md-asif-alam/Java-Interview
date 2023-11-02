public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swapping values are "+a+" and "+b);
//      Using third variable

//        int temp=a;
//        a=b;
//        b=temp;

        //addition and subtraction
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("AfterSwapping values are "+a+" and "+b);
    }
}

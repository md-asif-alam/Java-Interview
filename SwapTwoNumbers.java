public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before Swapping values are "+a+" and "+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("AfterSwapping values are "+a+" and "+b);
    }
}

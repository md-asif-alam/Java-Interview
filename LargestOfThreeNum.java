public class LargestOfThreeNum {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;


        //First Method
        if(a>b && a>c){
            System.out.println("a is largest");
        }else if(b>a && b>c){
            System.out.println("b is largest");
        }else if(c>a && c>b){
            System.out.println("c is largest");
        }
    }
}

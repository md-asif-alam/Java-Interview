public class PallinString {
    public static void main(String[] args) {
        String str="oppo";

        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev =rev+str.charAt(i);
        }

        if(rev.equals(str)){
            System.out.println(str+" is pallindrome string");
        }else{
            System.out.println(str+" is not pallindrome string");
        }
    }
}

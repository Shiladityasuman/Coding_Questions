public class palindrome {
    // public static int palim(int n){
        // int temp = 0;
        // 
    // }
    public static void main(String[] args) {
        int n = 70;
        int temp = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = (rev*0)+ digit;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        
    }
}

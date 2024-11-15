import java.util.*;
public class binomial_Coffec {


        public static int factorial(int n){
            int f = 1;
            for(int i=1; i<=n; i++){
                f=f*i;
            }
            return f;
        }
    
        public static int bin_coeff(int n, int r){
            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_nmr = factorial(n-r);

            int bin_coeff = fact_n / (fact_r * fact_nmr);
            return bin_coeff;
        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            System.out.print("Enter the value of r: ");
            int r = sc.nextInt();
            System.out.println(bin_coeff(n,r));
        }
    
    
}

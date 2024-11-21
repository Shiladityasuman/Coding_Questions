import java.util.*;
// import java.util.Collections;
public class sort {
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,5,3,8,6,3,8,4,22,1,4};
        // Arrays.sort(arr, 1,5 ,Collections.reverseOrder());
        // System.out.println();
        print(arr);
    }
}

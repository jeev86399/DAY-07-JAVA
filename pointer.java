/*
 8
4 5 6 6 7 1 23 4
[4, 23, 1, 7, 6, 6, 5, 4]
*/
import java.util.*;
public class pointer{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
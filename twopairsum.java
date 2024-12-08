import java.util.*;
class twopairsum{
  public static void main(String args[])
  {
    int arr[]={3,2,1,4,5,6,4};
    Arrays.sort(arr);
    int k=7;
    int l=0;
    int r=arr.length-1;
    boolean g=false;
    while(l<=r)
    {
      int sum=arr[l]+arr[r];
      if(sum==k)
      {
        g=true;
        break;
      }else if(sum<k)
      {
        l++;
      }else{
        r--;
      }
    }
    System.out.println(g);
  }
}
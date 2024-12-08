import java.util.*;
class prefix{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
    int pre[]=new int[arr.length];
    pre[0]=arr[0];
    for(int i=1;i<arr.length;i++)
    pre[i]=pre[i-1]+arr[i];
    System.out.println(Arrays.toString(pre));
  }
}
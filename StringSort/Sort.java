import java.util.Arrays;
import java.util.Scanner;
public class Sort{
 public static void main(String[] args){
 int n,i;
 Scanner read= new Scanner(System.in);
 System.out.print("Enetr the size of array:");
 n=read.nextInt();
 System.out.print("Enter the values:");
 String[] arr=new String[n];
 for(i=0;i<n;i++)
 {
  arr[i]=read.next();
 }
 System.out.println("sorted array:");
 Arrays.sort(arr);
 for(i=0;i<n;i++){
  System.out.println(arr[i]);
 }
 }
}
 

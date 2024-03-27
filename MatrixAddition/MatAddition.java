import java.util.Scanner;
class MatAddition{
 public static void main(String[] args){
  int i,j,m,n;
  System.out.println("Enter size of row: ");
  Scanner inp=new Scanner(System.in);
  m=inp.nextInt();
  System.out.println("Enter size of column: ");
  n=inp.nextInt();
  int a[][]=new int[20][20];
  int b[][]=new int[20][20];
  int c[][]=new int[20][20];
  System.out.println("Enter values of 1st matrix: ");
  for(i=0;i<m;i++){
   for(j=0;j<n;j++){
    a[i][j]=inp.nextInt();
    }
   }
  System.out.println("Enter values of 2nd matrix: ");
  for(i=0;i<m;i++){
   for(j=0;j<n;j++){
    b[i][j]=inp.nextInt();
    }
   }
  System.out.println("Sum of two matrix: "); 
  for(i=0;i<m;i++){
   for(j=0;j<n;j++){
    c[i][j]=a[i][j]+b[i][j];
    System.out.print(c[i][j]+"\t");
    }
    System.out.print("\n");
   }
  }
 }  

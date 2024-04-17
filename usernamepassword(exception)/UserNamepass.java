import java.util.Scanner;
import java.lang.Exception;
class usernameException extends Exception{
 usernameException(String msg){
  System.out.print(msg);
 }
}
class passwordException extends Exception{
 passwordException(String msg){
  System.out.print(msg);
 }
}
public class UserNamepass{
 public static void main(String args[]){
  Scanner reader=new Scanner(System.in);
  String username,password;
  System.out.println("Enter username:");
     username=reader.nextLine();
     System.out.println("Enter password");
     password=reader.nextLine();
     int len=username.length();
     try{
      if(len<8)
       throw new usernameException("Username must be greater than 8 character \n" );
       else if(!password.equals("admin"))
        throw new passwordException("Incorrect password \n");
       else
       System.out.println("login successfull");
      }
      catch(usernameException u){
       System.out.println(u+"\n");
      }
      catch(passwordException p){
      System.out.println(p+"\n");
      }
  }
}
      
 

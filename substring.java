import java.util.*;
class substring
{
 public static void main(String args[])
 {
  String str,sub;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the string");
  str=s.nextLine();
  System.out.println("All substrings are:");
   for (int i=0;i<str.length();i++) {
   for (int j=i+1;j<=str.length();j++) {
         System.out.println(str.substring(i,j));
   }
  }
 }
}
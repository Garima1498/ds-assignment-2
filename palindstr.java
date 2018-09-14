import java.util.*;
class palindstring
{
   public static void main(String args[])
   {
      String org, rev = "";
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string");
      org=in.nextLine();
      int len=org.length();
      for ( int i = len - 1; i >= 0; i-- )
         rev = rev + org.charAt(i);
      if (org.equals(rev))
         System.out.println("True and result is");
      else
         System.out.println("False and result is");
      System.out.println(rev);
   }
}
import java.util.*;
class toggle
{

    public static void main(String[] args)
    {
        System.out.println("Enter in a sentence:"); 
        Scanner in = new Scanner(System.in); 
        String s = in.nextLine();
        System.out.println("Converted String:" + toggleString(s)); 
        in.close(); 
     }

    public static String toggleString(String s)
    {
       String toggle = ""; 
       for(int i=0; i<s.length(); i++)
       {


           char letter = s.charAt(i); 

           if(Character.isUpperCase(s.charAt(i)))
           {
                letter = Character.toLowerCase(letter); 
                toggle = toggle + letter; 

           }
           else if(Character.isLowerCase(s.charAt(i)))
           {
               letter = Character.toUpperCase(letter);
               toggle = toggle + letter; 
           }

       }
       return toggle; 

   }
}
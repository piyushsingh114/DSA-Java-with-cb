public class strmenthod {
    public static void main(String[] args) {
      // String method 
      //find the length of string   
              String name = " Piyush Singh";
              int value = name.length();
              System.out.println( value);
       // tolower case  
             String  lstring =  name.toLowerCase();
               System.out.println(lstring);
               // toupper case
               String  lst  =  name.toUpperCase();
               System.out.println(lst); 
               
               String nonTrimmString="       piyushsingh";
               System.out.println(nonTrimmString.trim() );
    }
   
    
}

import java.util.Scanner;

public class CC2_Lab3{
  public static void main (String[] args){

        int sum = 0;
        int prod = 1;
        int avg = 0;
        int r = 0;
       
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        int lengthOfName = name.length();
       
        for(int x = 0; x < lengthOfName; x++){
            char charName = name.charAt(x);
            int code = (int)charName;
            System.out.println(charName + "-" + code);
           
            sum = sum + name.charAt(x);
            prod = prod * name.charAt(x);
        }    
        for(int x = 0; x < name.length(); x++){  
            if(name.charAt(x) == '!'){
              String name2 = name.replaceAll("!","");
            //System.out.println(name2);
              avg = sum/name2.length();
              r = prod %((int)avg);
            }else{
              avg = sum/name.length();
              r = prod % ((int)avg);
            }
        
        }
        System.out.println(name);
       
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
        System.out.println("Average: " + avg);
        System.out.println("Remainder: " + r);
    }
   
}

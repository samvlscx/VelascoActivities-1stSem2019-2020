public class CC2_Lab3V1{
  public static void main (String[] args){
    
    char letter1 = 'S';
    char letter2 = 'A';
    char letter3 = 'M';
    char letter4 = '!';
 
    int code1 = (int)letter1;
    int code2 = (int)letter2;
    int code3 = (int)letter3;
    int code4 = (int)letter4;
   
    int sum = letter1 + letter2 + letter3 + letter4;
    int prod = letter1 * letter2 * letter3 * letter4;
    int avg = (letter1 + letter2 + letter3)/3;
    int r = prod % avg;
   
    System.out.println(letter1 + "-" + code1 + "\n"
                        + letter2 + "-" + code2 + "\n"
                        + letter3 + "-" + code3 + "\n"
                        + letter4 + "-" + code4 + "\n"
                        + letter1 + letter2 + letter3 + letter4);
  
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + prod);
    System.out.println("Average: " + avg);
    System.out.println("Remainder: " + r);
  }


}
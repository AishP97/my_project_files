package Functions;
public class FormalParameters{
    public static void parameters(int num1, int num2){
        System.out.println("Entering Main Function");
        System.out.println("Number is is :" + num1);
        System.out.println("Number 2 is : " + num2);
        System.out.println("Exiting main Function");
    }

    public static int returnValue(int n1, int n2){
        int res = n1 + n2;
        return res;
    }



    public static void main(String[] args) {
        parameters(2,3);
        int result = returnValue(1,2);
        System.out.println(result);
        
    }
   
 VARIABLE ARGUMENTS 
 PASSING HTML ELEMENTS IN JAVA 
}
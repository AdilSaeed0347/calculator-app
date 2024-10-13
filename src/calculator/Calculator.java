
package calculator;
import java.util.*;

public class Calculator {
    
   
    public static void main(String[] args)
    {  
        Scanner  kb= new Scanner (System.in);
        Addition obj1=new Addition();
        Subtraction obj2=new Subtraction();
        Multiply obj3=new Multiply ();
        division obj4 =new division();
        BMI obj5=new BMI();
        boolean isvalidOperator=false;
        System.out.println("Enter one of following you want to use ?");
        System.out.println(" BMI or Calculator ");
        String sel;
        sel=kb.nextLine();
        if(sel.equals("BMI") || sel.equals("bmi") || sel.equals("Bmi"))
        {   
            
            
            boolean isvalidoperator=false;
             while(!isvalidoperator){

            System.out.println("Enter your weight in KG  : ");
            double weight=kb.nextDouble(); 
            System.out.println("Enter your height in meter : ");
           double height=kb.nextDouble();
            obj5.CalculateBMI(weight,height); }

        }
        else if (sel.equals("calculator")|| sel.equals("CALCULATOR") || sel.equals("Calculator"))
        {
        while (!isvalidOperator)
        {
//            String Bmi_Cal;
//            System.out.println("Enter the correspoding number for type of BMI calculator you want to use");

            System.out.println("Welcome to calculator ");
            System.out.println("Enter two values.....");
            System.out.print("Enter value one : ");
            double a=kb.nextDouble();
            System.out.print("Enter value two : ");
            double b=kb.nextDouble();

            kb.nextLine();
            System.out.println("Enter the calculation you want to perform ? +,-,*,/");
            String operator=kb.nextLine();

          if (operator.equals("+")) 
          {

              double addition=obj1.Addmethod(a, b);
            System.out.println("Addition is :"+addition);

          }
          else if (operator.equals("-"))
          {
              double subtraction=obj2.Submethod(a, b);
              System.out.println("Subtraction is: " +subtraction);
          }
          else if (operator.equals("*"))
          {
              double multiplication=obj3.Mulmethod(a, b);
              System.out.println("Multiplication is :"+multiplication);
          }
          else if (operator.equals("/" ))
          {
              double division=obj4.Divmethod(a, b);
              System.out.println("Divsion is :"+division);
          }
          else 
          {
              System.out.println("You enter wrong operator sign please enter +, -, *, /");

          } 
        } 
        }
      
      
        
       
    }
    
}

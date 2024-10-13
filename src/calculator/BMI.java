
package calculator;
import java.util.Scanner;

public class BMI {
    Scanner kb=new Scanner (System.in);
    double weight;
    double height;
    final double VALUE=703;
    
    public void CalculateBMI(double weight, double height)
    {  
        double Required_BMI=weight/ (height*height);
        if(Required_BMI<18)
        {
            System.out.println("You are under weight please eat more your BMI is "+Required_BMI);
        }
        else if(Required_BMI>18 && Required_BMI<24){
        System.out.println("Your are Healthy your BMI is in safe zone : "+Required_BMI);
        }
        else if (Required_BMI>24 && Required_BMI <29)
        {
            System.out.println("You are over weight please start Daily workout. your BMI is  "+Required_BMI);
        }
        else if (Required_BMI>29)
        {
            System.out.println("You are obese please join GYM. Your BMI is "+Required_BMI);
        }
    }
    
}

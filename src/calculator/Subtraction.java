
package calculator;


public class Subtraction {
    
    double Submethod (double a, double b)
    { if (b<a)
    {   double temp=0.0;
         temp=a;
         a=b;
         b=temp;
         
         return b-a; }
    else 
    {
        return a-b;
    }
         
    }


}
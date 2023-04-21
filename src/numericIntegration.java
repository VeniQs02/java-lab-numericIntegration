import static java.lang.Math.cos;
import static java.lang.Math.pow;

public class numericIntegration {
    double a, b, h, result;

    numericIntegration(double a, double b){
        this.a = a;
        this.b = b;
        this.h = 0.1;

        calc_sum();
        System.out.println(result);
    }
    void calc_sum(){
        result = h * ((calc(a)/2) + calcIterating() + (calc(b)/2));
    }
    double calcIterating(){
        double resultCalc = 0;

        for(double i = a+h; i < b; i += h){
            resultCalc += calc(i);
        }

        return resultCalc;
    }
    double calc(double x){
        return ((1.4 * x) + 0.3) / (2.3 + cos(0.4 * pow(x, 2) + 1));
    }
}
//S 0.4-1.3    1.4*x + 0.3/ (2.3 + cos(0.4*pow(x, 2) + 1))


//0.53
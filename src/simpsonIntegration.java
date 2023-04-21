import static java.lang.Math.cos;
import static java.lang.Math.pow;

public class simpsonIntegration {
    double a, b, h, result;
    double[] x, t;

    simpsonIntegration(double a, double b){
        this.a = a;
        this.b = b;
        int size = (int)(((b-a)*10) - 1);
        System.out.println(size);
        this.x = new double[size];
        for(double i = a + 0.1; a<b; a += 0.1)
        {

        }

        calc_sum();
        System.out.println(result);
    }
    void calc_sum(){
        result = (h/3) * (calc(a) + (4*calcIterating1()) + (2*calcIterating2()) + calc(b));
    }
    double calcIterating1(){
        double resultCalc1 = 0;

        for(double i = a+h; i < b; i += h){
            resultCalc1 += calc(i);
        }

        return resultCalc1;
    }
    double calcIterating2(){
        double resultCalc2 = 0;

        for(double i = a+h; i < b; i += h){
            resultCalc2 += calc(i);
        }

        return resultCalc2;
    }
    double calc(double x){
        return ((1.4 * x) + 0.3) / (2.3 + cos(0.4 * pow(x, 2) + 1));
    }
}
//S 0.4-1.3    1.4*x + 0.3/ (2.3 + cos(0.4*pow(x, 2) + 1))


//0.53
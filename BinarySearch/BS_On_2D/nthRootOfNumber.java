package BS_On_2D;

public class nthRootOfNumber {
    static double multiply(double number,double n){
        double ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*number;
        }
        return ans;
    }
    static double nthrootnumber(double number, double n){
       double low=1.0;
       double high=number;
       double eps=1e-6;

        while((high-low)> eps){
            double mid=(low+high)/2;
            if(multiply(mid,n) < number) low=mid;
            else {
                high=mid;
            }
        }

        return high ;

    }
    public static void main(String[] args){
        double number=27;
        double n=3;
        double a=nthrootnumber(number,n);
        System.out.print(a);
    }
}

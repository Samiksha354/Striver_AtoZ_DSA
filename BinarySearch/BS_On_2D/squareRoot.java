package BS_On_2D;

public class squareRoot {
    static int squareroot(int n){
        for(int i=1;i<(n/2);i++){
            if(i*i == n) return i;
            else break;
        }
            return -1;
    }

    static int squarerootBS(int n){
        int low=1;
        int high=n;
        int ans=1;

        while(low <= high){
            int mid=(low+high)/2;
            if(mid*mid > n) high=mid-1;
            else if(mid* mid <n) {
                ans=mid;
                low=mid+1;
            }
        }

     return high ;
    }

    public static void main(String[] args){
        int n=101;
        int a=squarerootBS(n);
        System.out.println(a);
    }
}

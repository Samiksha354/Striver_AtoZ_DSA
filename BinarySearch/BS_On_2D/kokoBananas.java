package BS_On_2D;

public class kokoBananas {
    public int Max(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > maxi) {
                maxi = piles[i];
            }
        }
        return maxi;
    }


    /// what I have solved
    public int minEatingSpeed(int[] piles, int h) {
        int max = Max(piles);
        for (int i = 1; i <= max; i++) {
            int sum = 0;

            for (int j = 0; j < piles.length; j++) {
                int divide = (piles[j] + i - 1) / i;
                sum = sum + divide;
            }

            if (sum <= h) return i;
        }

        return -1;

    }


    //brute force according to striver
    public int requiredtime(int[] piles, int i) {
        int totalTime = 0;
        for (int k = 0; k < piles.length; k++) {
            //int ->type conversion cause ceil returns double
            //double ->7/3 = 2   , math.ceil(2) ans ===2
            //but we need (2.3333 ->  3)
            //hence double
            totalTime = (int) Math.ceil((double) piles[k] / i) + totalTime;
        }
        return totalTime;
    }

    public int minEatingSpeed1(int[] piles, int h) {
        int max = Max(piles);
        for (int i = 1; i <= max; i++) {
            int reqTime = requiredtime(piles, i);

            if (reqTime <= h) return i;
        }

        return -1;

    }


    /// by binary serach

    public long requiredtime2(int[] piles, int mid) {
        long totalTime = 0;
        for (int k = 0; k < piles.length; k++) {
            //int ->type conversion cause ceil returns double
            //double ->7/3 = 2   , math.ceil(2) ans ===2
            //but we need (2.3333 ->  3)
            //hence double
            totalTime = (int) Math.ceil((double) piles[k] / mid) + totalTime;
        }
        return totalTime;
    }

    public int minEatingSpeed2(int[] piles, int h) {
        int max = Max(piles);
        int low = 1;
        int high = max;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            long reqTime = requiredtime2(piles, mid);

            if (reqTime <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return low;


    }

}

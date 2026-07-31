class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        Arrays.sort(piles);
        // System.out.println(Arrays.toString(piles));
        for (int pile : piles){
            right = Math.max(right,pile);
        }
        // System.out.println(right);
        int ans = 0;
        while (left<= right){
            int mid = (left+right)/2;
            int speed = calculateSpeed(piles,mid);
            // System.out.println("speed" + speed);
            if (speed <= h){
                ans = mid;
                right = mid -1;
            }else {
                left = mid +1;
            }
        }
        return ans;
    }
    public int calculateSpeed(int[] piles, int hourlyEat){
        int total =0 ;
        for (int i = 0; i < piles.length; i++){
            // System.out.println("Hourly Eat: " + hourlyEat + ", Pile: " + piles[i] + ", Math: " + (piles[i] + hourlyEat - 1));
            total += (piles[i] + hourlyEat -1 )/hourlyEat;
        }
        return total;
    }
}

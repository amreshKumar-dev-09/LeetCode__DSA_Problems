class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long a = (long)need1 * cost1 + (long)need2 * cost2;

        int common = Math.min(need1,need2);

        long b = (long)common * costBoth + (long) (need1 - common) * cost1 + (long) (need2 - common) * cost2;

        long c = (long) Math.max(need1, need2) * costBoth;

        return Math.min(a, Math.min(b, c));
        
    }
}
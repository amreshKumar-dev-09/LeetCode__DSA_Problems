
import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;
        int maxFactor = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            maxFactor = Math.max(maxFactor, item[0]);
            minPrice = Math.min(minPrice, item[1]);
        }

        int[] freq = new int[maxFactor + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        for (int i = 1; i <= maxFactor; i++) {
            for (int j = 2 * i; j <= maxFactor; j += i) {
                freq[i] += freq[j];
            }
        }

        Arrays.sort(items, (a, b) ->
            Integer.compare(a[1], b[1])
        );

        long ans = 0;
        long remaining = budget;

        for (int[] item : items) {

            int factor = item[0];
            int price = item[1];

            int gain = freq[factor] - 1;

            if (gain <= 0 || price > 2L * minPrice) {
                continue;
            }

            long canBuy = Math.min(gain, remaining / price);

            ans += canBuy * 2;
            remaining -= canBuy * price;
        }

        ans += remaining / minPrice;

        return (int) ans;
    }
}

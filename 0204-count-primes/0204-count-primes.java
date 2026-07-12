class Solution {
    public int countPrimes(int n) {
        if (n <2 )
            return 0;

        boolean[] arr = new boolean[n];

        // Arrays.fill(arr, true);
        arr[0] = true;
        arr[1] = true;
        int ans = 0;

        for (int i = 2; i < n; i++) {
            if (arr[i]==false) {
                ans++;

                int j = 2 * i;
                while (j < n) {
                    arr[j] = true;
                    j += i;
                }

            }
        }
        return ans;

    }

}
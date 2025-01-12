package Linear_Search;
/*
  1672: Richest Customer Wealth
*/
public class RichestCustomerWealth {
    public static void main(String[] args) {
//        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }

}

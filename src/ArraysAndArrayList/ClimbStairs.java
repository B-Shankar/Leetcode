package ArraysAndArrayList;

// 70 — Climbing Stairs
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int prev1 = 2; // ways to reach step 2
        int prev2 = 1; // ways to reach step 1

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }

    public static void main(String[] args) {
        ClimbStairs obj = new ClimbStairs();
        int n = 5;
        int ways = obj.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}

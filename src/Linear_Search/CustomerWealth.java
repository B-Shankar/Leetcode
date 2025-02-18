package Linear_Search;

public class CustomerWealth {
    public static void main(String[] args) {
//        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};
        int[][] arr ={{1, 2, 3}, {1, 2, 3}};

        System.out.println(RichestCustomer(arr));
    }

    private static int RichestCustomer(int[][] arr) {
        int max = 0;
        for (int row = 0; row < arr.length; row++) {
            int wealth = 0;
            for (int col = 0; col < arr[row].length; col++) {
                wealth += arr[row][col];
            }
            if(wealth > max){
                max = wealth;
            }
        }

        return max;
    }
}

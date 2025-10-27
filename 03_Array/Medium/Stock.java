class Stock
{
    public static void main(String[] args) {
        fun(new int[]{7,1,5,3,6,4});
    }
    public static void fun(int[] arr)
    {
        int mini=arr[0];
        int profit=0;

        for(int i=1;i<arr.length;i++)
        {
            int cost=arr[i]-mini;
            profit=Math.max(profit, cost);
            mini=Math.min(mini, arr[i]);
        }
        System.err.println(profit);

    }
}
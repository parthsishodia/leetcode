class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n=nums.length;
        int[] result = new int[n];
    for (int i = 0, tmp = 1; i < n; i++) {
        result[i] = tmp;
        tmp *= nums[i];
    }
    for (int i = n - 1, tmp = 1; i >= 0; i--) {
        result[i] *= tmp;
        tmp *= nums[i];
    }
    return result;
}
}
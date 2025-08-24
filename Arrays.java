class Solution {
    public String average(int arr[]) {
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        double avg = (double)sum/arr.length;
      //Even using float in place of double makes a huge difference and may not pass test cases
      // TYPECASTING IS MUST
        return String.format("%.2f",avg);
    }
}

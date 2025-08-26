// For a given N, return an arraylist containing the sum of even and odd integers of the first N natural numbers.

class Solution {
    static ArrayList<Integer> getSum(int N) {
        ArrayList<Integer> sum = new ArrayList<Integer>(2);
        sum.add(0,0);
        sum.add(1,0);
        
        for(int i=N; i>0; i--){
            if(i%2 == 0){
                sum.set(0, sum.get(0)+i);
            }
            else{
                sum.set(1, sum.get(1)+i);
            }
        }
        return sum;
    }
}

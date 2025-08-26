import java.util.ArrayList;
import java.util.Arrays;

class ArrayLis{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[5];

        for (int i = 1; i <= 5; i++) {
            list.add(i);
            arr[i - 1] = i;
        }

        System.out.println(list);
        System.out.println(Arrays.toString(arr));
    }
}
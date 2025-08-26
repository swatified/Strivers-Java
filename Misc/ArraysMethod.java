import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 3};
        int[] b = Arrays.copyOf(a, a.length);
        int[] c = new int[5];
        Arrays.fill(c, 1);

        System.out.println(Arrays.compare(a, b));
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.mismatch(a, c));

        Arrays.sort(a);

        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
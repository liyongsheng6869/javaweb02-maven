import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
            int[] a={1,6,89,65,36};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));

    }

    public static int[] sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}

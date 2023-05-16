package S_03;

// Реализовать алгоритм сортировки слиянием.

public class Task01 {
    public static void main(String[] args) {
        int[] numberArray = { 9, 6, 0, 3, 3, 1, 7, 8 };
        mergeSort(numberArray, numberArray.length);
        for (int i = 0; i < numberArray.length; i++)
            System.out.println(numberArray[i]);
    }

    public static void mergeSort(int[] numArray, int n) {
        if (n < 2)
            return;
        int middle = n / 2;
        int[] l = new int[middle];
        int[] r = new int[n - middle];

        for (int i = 0; i < middle; i++) {
            l[i] = numArray[i];
        }
        for (int i = middle; i < n; i++) {
            r[i - middle] = numArray[i];
        }
        mergeSort(l, middle);
        mergeSort(r, n - middle);

        merge(numArray, l, r, middle, n - middle);
    }

    public static void merge(int[] number, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                number[k++] = l[i++];
            else
                number[k++] = r[j++];

        }

        while (i < left)
            number[k++] = l[i++];

        while (j < right)
            number[k++] = r[j++];
    }
}

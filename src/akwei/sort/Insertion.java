package akwei.sort;

import akwei.base.SortHelper;

public class Insertion {

    private static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0 && SortHelper.less(a[j], a[j - 1]); j--) {
                SortHelper.exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = Data.getArr();
        sort(arr);
        assert SortHelper.isSorted(args);
    }
}

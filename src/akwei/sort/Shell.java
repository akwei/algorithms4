package akwei.sort;

import akwei.base.SortHelper;

public class Shell {

    private static void sort(Comparable[] a) {
        int h = 1;
        while (h < a.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h && SortHelper.less(a[j], a[j - h]); j -= h) {
                    SortHelper.exch(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        Integer[] a = Data.getArr();
        sort(a);
        assert SortHelper.isSorted(a);
        SortHelper.show(a);
    }

}

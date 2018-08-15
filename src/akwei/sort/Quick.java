package akwei.sort;

import akwei.base.SortHelper;
import akwei.base.StdRandom;

import java.util.HashMap;
import java.util.Map;

public class Quick {

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (SortHelper.less(v, a[++i])) {
                if (i == hi) {
                    break;
                }
            }
            while (SortHelper.less(a[--j], v)) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            SortHelper.exch(a, i, j);
        }
        SortHelper.exch(a, lo, j);
        return j;
    }

    public static void main(String[] args) {
//        Integer[] arr = Data.getArr();
//        sort(args);
//        assert SortHelper.isSorted(arr);
//        System.out.println(Integer.toString(16, 3));
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(1, 2);
        System.out.println(map.get(1));
        System.out.println(5<<1);
        System.out.println(System.currentTimeMillis());
    }
}

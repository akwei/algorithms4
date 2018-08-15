package akwei.sort;

import akwei.base.SortHelper;

/**
 * 选择排序：找到数组中的最小值，循环比较数组中其他值与最小值，如果数组元素比最小值还小，那么把数组元素与最小值进行交换。依次循环比较，再找到第二个最小值放到第二个位置。。。
 */
public class Selection {

    private static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIdx = i;
            //循环找到最小值
            for (int j = i + 1; j < a.length; j++) {
                if (SortHelper.less(a[j], a[minIdx])) {
                    minIdx = j;
                }
            }
            //交换与最小值的位置，这样每次循环后，获得的都是本次最小值放到i的位置，依次，i的位置就是会第一最小，第二最小
            SortHelper.exch(a, minIdx, i);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = Data.getArr();
        sort(arr);
        SortHelper.show(arr);
    }

}

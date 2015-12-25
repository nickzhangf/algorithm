package zf.test;

import zf.algorithm.ISort;
import zf.algorithm.InsertionSort;
import zf.utils.Utils;

/**
 * TestSort
 *
 * @author zf
 * @date 2015/12/24 0024
 */
public class TestSort
{
    public static void main(String[] args)
    {
        int[] a = {5, 2, 3, 4, 2};
        ISort mySort = new InsertionSort();
        int[] result = mySort.sort(a);
        Utils.printArray(result);
    }
}

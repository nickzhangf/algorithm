package zf.algorithm;

/**
 * BinarySearch 二分查找
 * 预备条件：数据已排序
 * 算法复杂度： O(logN)
 *
 * @author zf
 * @date 2016/1/4 0004
 */
public class BinarySearch implements ISearch
{

    @Override
    public int search(int[] data, int x)
    {
        int low = 0;
        int high = data.length - 1;
        while (low <= high)
        {
            int mid = (low + high)/2;
            if (x > data[mid])
            {
                low = mid + 1;
            } else if (x < data[mid])
            {
                high = mid - 1;
            } else
            {
                return mid;
            }
        }
        return -1;
    }
}

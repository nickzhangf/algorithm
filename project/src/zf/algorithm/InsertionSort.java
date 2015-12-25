package zf.algorithm;

/**
 * InsertionSort 插入排序
 *
 * @author zf
 * @date 2015/12/24 0024
 */
public class InsertionSort implements ISort
{
    @Override
    public int[] sort(int[] src)
    {
        int len = src.length;
        if (len <= 0)
        {
            return null;
        } else if (len == 1)
        {
            return src;
        }

        for (int i = 1; i < len; i++)
        {
            for ( int j = i-1 ; j >= 0; j--)
            {
                if (src[j + 1] < src[j])
                {
                    int tmp = src[j];
                    src[j] = src[j+1];
                    src[j+1] = tmp;
                }
            }
        }

        return src;
    }
}

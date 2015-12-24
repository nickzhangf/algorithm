package zf.algorithm;

/**
 * InsertionSort ≤Â»Î≈≈–Ú
 *
 * @author zf
 * @date 2015/12/24 0024
 */
public class InsertionSort implements Algorithm
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
            int value = src[i];
            int j = i - 1;
            for ( ; j >= 0; j--)
            {
                if (src[j + 1] < src[j])
                {
                    int tmp = src[j+1];
                    src[i] = src[j+1];
                    src[j+1] = tmp;
                }
            }
        }

        return new int[0];
    }
}

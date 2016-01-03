package zf.application;

/**
 *
 * MaxSubSum_LinearTime 子序列最大和（线性时间实现）
 * 算法复杂度：O(N)
 *
 * Created by feng zhang on 2016/1/3.
 */
public class MaxSubSum_LinearTime
{
    public static int maxSumLinear(int[] data)
    {
        int maxSum = 0;
        int thisSum = 0;

        for (int i = 0; i < data.length; i++)
        {
            thisSum += data[i];
            if (thisSum > maxSum)
            {
                maxSum = thisSum;
            } else if (thisSum < 0)
            {
                thisSum = 0;
            }
        }

        return maxSum;
    }
}

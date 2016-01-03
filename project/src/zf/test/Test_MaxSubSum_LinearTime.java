package zf.test;

import zf.application.MaxSubSum_LinearTime;

/**
 * Created by feng zhang on 2016/1/3.
 */
public class Test_MaxSubSum_LinearTime
{
    public static void main(String[] args)
    {
        int[] data = {4, -3, 5, -2, -1, 2, 6, -2};
//        int[] data = {4, -3, 5, -2};
        int maxSubSum = MaxSubSum_LinearTime.maxSumLinear(data);
        System.out.println("最大子序列和为： " + maxSubSum);
    }
}

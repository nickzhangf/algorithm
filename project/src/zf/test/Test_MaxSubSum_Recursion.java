package zf.test;

import zf.application.MaxSubSum_Recursion;

/**
 * Test_MaxSubSum_Recursion
 *
 * @author zf
 * @date 2015/12/31 0031
 */
public class Test_MaxSubSum_Recursion
{
    public static void main(String[] args)
    {
        int[] data = {4, -3, 5, -2, -1, 2, 6, -2};
//        int[] data = {4, -3, 5, -2};
        int maxSubSum = MaxSubSum_Recursion.start(data);
        System.out.println("最大子序列和为： " + maxSubSum);
    }
}

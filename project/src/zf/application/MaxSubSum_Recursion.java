package zf.application;

/**
 * MaxSubSum_Recursion 子序列最大和（递归实现）
 *
 * 把数组分成两部分，子序列最大和出现在一下三种情况：
 * 1. 前半部分
 * 2. 后半部分
 * 3，中间部分：前半部分最大值（包括前半部分的最后一个元素）+后半部分最大值（包含后半部分的第一个元素）
 *
 * 算法复杂度： O(NlogN)
 * @author zf
 * @date 2015/12/31 0031
 */
public class MaxSubSum_Recursion
{
    /**
     * driver method
     * @param data
     * @return
     */
    public static int start(int[] data)
    {
        return maxSumRec(data, 0, data.length-1);
    }

    /**
     * 递归求解最大
     * @param data
     * @param left
     * @param right
     * @return
     */
    private static int maxSumRec(int[] data, int left, int right)
    {
        // base case
        if (left == right)
        {
            if (data[left] > 0)
            {
                return data[left];
            }
            return 0;
        }

        int center = (left + right)/2;
        int maxLeftSum = maxSumRec(data, left, center);
        int maxRightSum = maxSumRec(data, center+1, right);


        // 计算左半部分（包含最后一个元素的最大值）
        int maxLeftBorderSum = 0;
        int leftBoderSum = 0;
        for (int i = center; i >= left; i--)
        {
            leftBoderSum += data[i];
            if (leftBoderSum > maxLeftBorderSum)
            {
                maxLeftBorderSum = leftBoderSum;
            }
        }

        // 计算右半部分（包含第一个元素的最大值）
        int maxRightBorderSum = 0;
        int rightBoderSum = 0;
        for (int i = center+1; i <= right; i++)
        {
            rightBoderSum += data[i];
            if (rightBoderSum > maxRightBorderSum)
            {
                maxRightBorderSum = rightBoderSum;
            }
        }

        // 计算左半部分、右半部分、中间部分 三个中的最大值
        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum+maxRightBorderSum);
    }

    /**
     * 求三个数中的最大数
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static int max3(int a, int b, int c)
    {
        int big = (a > b) ? a : b;
        big = (big > c) ? big : c;
        return big;
    }
}

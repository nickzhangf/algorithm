package zf.application;

/**
 * MaxSubSum_Recursion ���������ͣ��ݹ�ʵ�֣�
 *
 * ������ֳ������֣����������ͳ�����һ�����������
 * 1. ǰ�벿��
 * 2. ��벿��
 * 3���м䲿�֣�ǰ�벿�����ֵ������ǰ�벿�ֵ����һ��Ԫ�أ�+��벿�����ֵ��������벿�ֵĵ�һ��Ԫ�أ�
 *
 * �㷨���Ӷȣ� O(NlogN)
 * @author zf
 * @date 2015/12/31 0031
 */
public class MaxSubSum_Recursion
{
    private static int count = 0;

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
     * �ݹ�������
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


        // ������벿�֣��������һ��Ԫ�ص����ֵ��
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

        // �����Ұ벿�֣�������һ��Ԫ�ص����ֵ��
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

        // ������벿�֡��Ұ벿�֡��м䲿�� �����е����ֵ
        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum+maxRightBorderSum);
    }

    /**
     * ���������е������
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

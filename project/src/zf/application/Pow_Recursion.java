package zf.application;

/**
 * Pow_Recursion 幂次方（递归实现）
 * 算法复杂度：O(logN)
 *
 * @author zf
 * @date 2016/1/4 0004
 */
public class Pow_Recursion
{
    /**
     *
     * @param x 底数
     * @param n 指数
     * @return
     */
    public static long pow(long x, int n)
    {
        if (n == 0)
        {
            return 1;
        }
        if (n == 1)
        {
            return x;
        }
        if (n%2 == 0)
        {
            return pow(x*x, n/2);
        } else
        {
            return pow(x*x, n/2)*x;
        }
    }
}

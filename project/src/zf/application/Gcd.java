package zf.application;

/**
 * Gcd 求两个数的最大公约数
 *
 * @author zf
 * @date 2016/1/4 0004
 */
public class Gcd
{
    /**
     *
     * @param m
     * @param n
     * @return
     */
    public static long gcd(long m, long n)
    {
        while (n != 0)
        {
            long rem = m % n;
            m = n;
            n = rem;
        }

        return m;
    }
}

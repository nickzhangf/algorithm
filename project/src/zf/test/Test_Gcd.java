package zf.test;

import zf.application.Gcd;

/**
 * Test_Gcd
 *
 * @author zf
 * @date 2016/1/4 0004
 */
public class Test_Gcd
{
    public static void main(String[] args)
    {
        long rem = Gcd.gcd(9, 12);
        System.out.println("rem= " + rem);
    }
}

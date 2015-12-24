package zf.test;

import zf.utils.Utils;

/**
 * TestUtils
 *
 * @author zf
 * @date 2015/12/24 0024
 */
public class TestUtils
{
    public static void main(String[] args)
    {
        int a = 3;
        int b = 4;
        Utils.swap(a, b);
        System.out.println("a=" + a + "  b=" + b);
    }
}

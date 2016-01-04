package zf.test;

import zf.algorithm.BinarySearch;
import zf.algorithm.ISearch;

/**
 * TestSearch
 *
 * @author zf
 * @date 2016/1/4 0004
 */
public class TestSearch
{
    public static void main(String[] args)
    {
        int[] data = {1, 2, 4, 7, 9, 11, 22};
        ISearch search = new BinarySearch();
        int index = search.search(data, 4);
        System.out.println("查找索引为：" + index);
    }
}

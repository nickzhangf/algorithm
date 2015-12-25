package zf.utils;

/**
 * Utils
 *
 * @author zf
 * @date 2015/12/24 0024
 */
public class Utils
{
    /**
     * ´òÓ¡Êý×é
     * @param a
     */
   public static void printArray(int[] a)
   {
       if (a == null)
       {
           return;
       }

       for (int i = 0; i < a.length; i++)
       {
           System.out.print(a[i] + "\t");
       }
       System.out.print("\n");
   }
}

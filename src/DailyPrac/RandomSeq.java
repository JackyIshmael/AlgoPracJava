package DailyPrac;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq
{
      public static void main(String[] args)
      {
          int N=Integer.parseInt(args[0]);
          double lo=Double.parseDouble(args[1]);
          double hi=Double.parseDouble(args[2]);
          for(int i=0;i<N;i++)
          {
              //研究这个uniform的作用，返回一个区间Lo和Hi之间的随机数字。
              double x= StdRandom.uniform(lo,hi);
              //手写换行符。/
              StdOut.printf("%.2f\n",x);
          }
      }
}

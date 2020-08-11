package algohelper;


import java.lang.management.*;
import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @program: JavaTest
 * @description: 123
 * @author: Jacky
 * @create: 2020-08-10 17:12
 **/
public class MuiltiThread {
    public static void main(String[] args){
        ThreadMXBean threadMXBean= ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) { System.out.println("[" + threadInfo.getThreadId() + "] " +
                threadInfo.getThreadName());
        }
    }
}

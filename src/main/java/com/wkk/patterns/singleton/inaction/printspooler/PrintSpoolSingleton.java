package com.wkk.patterns.singleton.inaction.printspooler;

import com.wkk.patterns.adapter.Print;
import java.lang.Runtime;
/**
 * @Time: 20-2-9上午10:54
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class PrintSpoolSingleton {
    private static PrintSpoolSingleton instance = null;

    private PrintSpoolSingleton(){}

    public static PrintSpoolSingleton getInstance() throws PrintSpoolerException {
        if(instance == null){
            System.out.println("创建打印池");
            instance = new PrintSpoolSingleton();
        }else {
            throw new PrintSpoolerException("打印池正在工作");
        }
        return instance;
    }

    public void manageJobs(){
        System.out.println("管理打印任务");
    }

}

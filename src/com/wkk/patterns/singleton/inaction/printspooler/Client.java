package com.wkk.patterns.singleton.inaction.printspooler;

import com.wkk.patterns.adapter.Print;

/**
 * @Time: 20-2-9上午11:06
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class Client {
    public static void main(String[] args) throws PrintSpoolerException {
        PrintSpoolSingleton ps1, ps2;
//        ps1 = PrintSpoolSingleton.getInstance();
//        ps1.manageJobs();
//        ps2 = PrintSpoolSingleton.getInstance();
//        ps2.manageJobs();
        try{
            ps1 = PrintSpoolSingleton.getInstance();
            ps1.manageJobs();
        }catch (PrintSpoolerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("=========================");
        try{
            ps2 = PrintSpoolSingleton.getInstance();
            ps2.manageJobs();
        }catch (Exception e){
            System.out.println(e.getMessage());
            }


    }
}

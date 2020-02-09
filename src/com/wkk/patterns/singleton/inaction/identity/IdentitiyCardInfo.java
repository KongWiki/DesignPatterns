package com.wkk.patterns.singleton.inaction.identity;

/**
 * @Time: 20-2-9上午10:02
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */

/**
 * 身份证号码
 */
public class IdentitiyCardInfo {
    private static IdentitiyCardInfo instance = null;
    private String num;

    private IdentitiyCardInfo() {
    }

    public static IdentitiyCardInfo getInstance() {
        if(instance == null){
            System.out.println("第一次办理身份证号, 分配号码, 第一次办理身份证成功");
            instance = new IdentitiyCardInfo();
            instance.setNum("324553");
        }else {
            System.out.println("已经办理过身份证号, 获取旧号码");
        }
        return instance;
    }

    public String getNum() {
        return num;
    }

    private void setNum(String num) {
        this.num = num;
    }
}

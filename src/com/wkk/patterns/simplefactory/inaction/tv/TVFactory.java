package com.wkk.patterns.simplefactory.inaction.tv;

/**
 * @Time: 20-2-10上午8:35
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class TVFactory {
    public static TV getTV(String type) throws Exception {
        if (type.equalsIgnoreCase("hiense")) {
            System.out.println("电视机工厂生产Hiense电视!");
            return new HaierTV();
        } else if (type.equalsIgnoreCase("skyworth")) {
            System.out.println("电视机工厂生产创维电视!");
            return new SkyworthTV();
        } else if (type.equalsIgnoreCase("haier")) {
            System.out.println("电视机工生产海尔电视!");
            return new HaierTV();
        }else {
            throw new Exception("对不起, 暂不能生产该品牌电视");
        }
    }
}

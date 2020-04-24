package com.eoms.sqlUtil;

public class Test {
    public static void main(String[] args) {
        String tablename = "sys_post";
        String packageOutPath = "com.eoms";
        String[] str = tablename.split(",");
        for (int i = 0; i <str.length ; i++) {
            new DataUtil().getData(str[i],packageOutPath);
        }

    }
}

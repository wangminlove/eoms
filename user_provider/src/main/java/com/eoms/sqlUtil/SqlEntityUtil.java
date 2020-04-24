package com.eoms.sqlUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SqlEntityUtil extends SqlUtil {
    private String[] colnames; // 列名数组
    private String[] colTypes; // 列名类型数组
    private int[] colSizes; // 列名大小数组
    private boolean f_util = false; // 是否需要导入包java.util.*
    private boolean f_sql = false; // 是否需要导入包java.sql.*
    private boolean f_lang = false; // 是否需要导入包java.sql.*

    public SqlEntityUtil(){

    }
    public SqlEntityUtil(String tablename, String packageOutPath){

        try {
            ResultSetMetaData rsmd = getMetaData(tablename);
            int size = rsmd.getColumnCount(); // 统计列
            colnames = new String[size];
            colTypes = new String[size];
            colSizes = new int[size];

            for (int i = 0; i < size; i++) {

                colnames[i] = rsmd.getColumnName(i + 1);
                colnames[i] = colnames[i].toLowerCase().replace("_","");
                colTypes[i] = rsmd.getColumnTypeName(i + 1);
                //自动生成包配置

                if (colTypes[i].equalsIgnoreCase("image") || colTypes[i].equalsIgnoreCase("text")
                        || colTypes[i].equalsIgnoreCase("datetime") || colTypes[i].equalsIgnoreCase("time")
                        || colTypes[i].equalsIgnoreCase("date") || colTypes[i].equalsIgnoreCase("datetime2")) {
                    f_sql = true;
                    f_util=true;
                }

                colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
            }
            if(tablename.indexOf("_")!=-1){
                tablename=tablename.replace("_","");
            }
            String content = parse(colnames, colTypes, colSizes,tablename,packageOutPath);

            try {
                File directory = new File("");

                String path = this.getClass().getResource("").getPath();

                String outputPath = directory.getAbsolutePath() + getDefaultPath()
                        + (packageOutPath+".entity").replace(".", "/") + "/" + initcap(tablename) + ".java";

                FileWriter fw = new FileWriter(outputPath);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(content);
                pw.flush();
                pw.close();
                System.out.println(initcap(tablename)+"实体类执行完毕，生成路径为："+outputPath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close();
        }

    }

    /**
     * 功能：生成实体类主体代码
     *
     * @param colnames
     * @param colTypes
     * @param colSizes
     * @return
     */
    private String parse(String[] colnames, String[] colTypes, int[] colSizes,String tablename,String packageOutPath) {
        StringBuffer sb = new StringBuffer();
        // 生成package包路径
        sb.append("package " + packageOutPath + ".entity;\r\n");
        // 判断是否导入工具包
        if (f_util) {
            sb.append("import java.util.Date;\r\n");
        }
        if (f_sql) {
            sb.append("import java.sql.*;\r\n");
        }
        if (f_lang) {
            sb.append("import java.lang.*;\r\n");
        }

        sb.append("\r\n");
        // 注释部分
        sb.append("   /**\r\n");
        sb.append("    * @文件名称：" + tablename + ".java\r\n");
        sb.append("    * @创建时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\r\n");
        sb.append("    * @创  建  人：" + getAuthorName() + " \r\n");
        sb.append("    * @文件描述：" + tablename + " 实体类\r\n");
        sb.append("    * @文件版本：" + getVersion() + " \r\n");
        sb.append("    */ \r\n");
        // 实体部分
        sb.append("\r\n\r\npublic class " + initcap(tablename) + "{\r\n");
        processAllAttrs(sb);// 属性
        processAllMethod(sb);// get set方法
        sb.append("}\r\n");

        // System.out.println(sb.toString());
        return sb.toString();
    }

    /**
     * 功能：生成所有属性
     *
     * @param sb
     */
    private void processAllAttrs(StringBuffer sb) {

        for (int i = 0; i < colnames.length; i++) {
            sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + colnames[i] + ";\r\n");
            sb.append("\r\n");
        }
        sb.append("\r\n");
    }

    /**
     * 功能：生成所有方法
     *
     * @param sb
     */
    private  void processAllMethod(StringBuffer sb) {

        for (int i = 0; i < colnames.length; i++) {
            sb.append("\tpublic void set" + initcap(colnames[i]) + "(" + sqlType2JavaType(colTypes[i]) + " "
                    + colnames[i] + "){\r\n");
            sb.append("\tthis." + colnames[i] + "=" + colnames[i] + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\r\n");
            sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + initcap(colnames[i]) + "(){\r\n");
            sb.append("\t\treturn " + colnames[i] + ";\r\n");
            sb.append("\t}\r\n");
            sb.append("\r\n");
        }

    }

}

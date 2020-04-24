package com.eoms.sqlUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SqlRowMapperUtil extends SqlUtil {
    private String[] colnames; // 列名数组
    private String[] colTypes; // 列名类型数组
    private int[] colSizes; // 列名大小数组
    private String[] recolname;
    private String retablename;

    private boolean f_util = false; // 是否需要导入包java.util.*
    private boolean f_sql = false; // 是否需要导入包java.sql.*
    private boolean f_lang = false; // 是否需要导入包java.sql.*

    public SqlRowMapperUtil(){

    }
    public SqlRowMapperUtil(String tablename,String packageOutPath){
        if(tablename.indexOf("_")!=-1){
            String[] tname = tablename.split("_");
            String name = "";
            for (String tname1:tname){
                name = name+initcap(tname1);
                retablename = name;
            }
            //        tablename=tablename.replace("_","");
        }
     //  retablename=tablename.replace("_","");
        try {
            ResultSetMetaData rsmd = getMetaData(tablename);
            int size = rsmd.getColumnCount(); // 统计列
            colnames = new String[size];
            colTypes = new String[size];
            colSizes = new int[size];
            recolname =new String[size];
            for (int i = 0; i < size; i++) {

                colnames[i] = rsmd.getColumnName(i + 1);
                colnames[i] = colnames[i].toLowerCase();
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
            for (int i = 0; i <colnames.length ; i++) {
                if(colnames[i].indexOf("_")!=-1){
                    String[] tname = colnames[i].split("_");
                    String name = "";
                    for (int j = 0; j <tname.length ; j++) {
                        if (j==0){
                            name = name + tname[0];
                        }else{
                            name = name+initcap( tname[j]);
                        }
                        recolname[i] = name;
                    }
                    /*for (String tname1:tname){
                        name = name+initcap(tname1);
                        recolname[i] = name;
                    }*/
                    //        tablename=tablename.replace("_","");
                }else {
                    recolname[i] = colnames[i];
                }
            }

            String content = parse(colnames, colTypes, colSizes,tablename,packageOutPath);

            try {
                File directory = new File("");

                String path = this.getClass().getResource("").getPath();

                String outputPath = directory.getAbsolutePath() + getDefaultPath()
                        + (packageOutPath+".rowUtil").replace(".", "/") + "/" + initcap(retablename) + "RowMapper.java";

                FileWriter fw = new FileWriter(outputPath);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(content);
                pw.flush();
                pw.close();
                System.out.println(initcap(retablename)+"RowMapper 执行完毕，生成路径为："+outputPath);
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
     * 功能：生成Dao层实现类代码
     *
     * @param colnames
     * @param colTypes
     * @param colSizes
     * @return
     */
    private String parse(String[] colnames, String[] colTypes, int[] colSizes,String tablename,String packageOutPath) {
        StringBuffer sb = new StringBuffer();
        // 生成package包路径
        sb.append("package " + packageOutPath + ".rowUtil;\r\n");
        sb.append("\r\n");
        sb.append("import "+packageOutPath+".entity."+initcap(retablename)+";\r\n");
        sb.append("\r\n");
        sb.append("import org.springframework.jdbc.core.RowMapper;\r\n");
        sb.append("import java.sql.ResultSet;\r\n");
        sb.append("import java.sql.SQLException;\r\n");

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
        sb.append("    * @文件名称：" + this.initcap(retablename) + "RowMapper.java\r\n");
        sb.append("    * @创建时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\r\n");
        sb.append("    * @创  建  人：" + getAuthorName() + " \r\n");
        sb.append("    * @文件描述：" + this.initcap(retablename) + "RowMapper 类\r\n");
        sb.append("    * @文件版本：" + getVersion() + " \r\n");
        sb.append("    */ \r\n");
        // 实体部分

        sb.append("public class " + initcap(retablename)+"RowMapper implements "+"RowMapper<" +this.initcap(retablename)+ "> {\r\n");
        processAllMethod(sb,tablename);// crud方法

        sb.append("}\r\n");

        // System.out.println(sb.toString());
        return sb.toString();
    }
    /**
     * 功能：生成所有方法
     *
     * @param sb
     */
    private void processAllMethod(StringBuffer sb,String tablename) {
        sb.append("\t@Override\r\n");
        sb.append("\tpublic "+initcap(retablename)+" mapRow(ResultSet resultSet, int i) throws SQLException {\r\n");
        for (int i = 0; i < colnames.length; i++) {

            if (sqlType2JavaType(colTypes[i]).equals("Integer")){
                sb.append("\t\t"+sqlType2JavaType(colTypes[i])+" "+recolname[i]+
                        " = resultSet.getInt"+"("+"\""+colnames[i]+"\");\r\n");
            }else{
                sb.append("\t\t"+sqlType2JavaType(colTypes[i])+" "+recolname[i]+
                        " = resultSet.get"+sqlType2JavaType(colTypes[i])+"("+"\""+colnames[i]+"\");\r\n");
            }

        }
        sb.append("\t\t"+initcap(retablename)+" "+retablename+" = new "+initcap(retablename)+"();\r\n");
        for (int i = 0; i < colnames.length; i++) {
            sb.append("\t\t"+retablename+".set"+initcap(recolname[i])+"("+recolname[i]+");\r\n");
        }
        sb.append("\t\treturn "+retablename+";\r\n");
        sb.append("\t}\r\n");
    }

    public static void main(String[] args) {
         new SqlRowMapperUtil("house","com.java.user");
    }
}

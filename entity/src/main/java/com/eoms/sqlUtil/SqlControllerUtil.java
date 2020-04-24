package com.eoms.sqlUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SqlControllerUtil extends SqlUtil {
    private String[] colnames; // 列名数组
    private String[] colTypes; // 列名类型数组
    private int[] colSizes; // 列名大小数组
    private boolean f_util = false; // 是否需要导入包java.util.*
    private boolean f_sql = false; // 是否需要导入包java.sql.*
    private boolean f_lang = false; // 是否需要导入包java.sql.*
    public SqlControllerUtil(){
    }
    /**
     * 构造函数
     */
    public SqlControllerUtil(String tablename, String packageOutPath){

        try {
            ResultSetMetaData rsmd = getMetaData(tablename);
            int size = rsmd.getColumnCount(); // 统计列
            colnames = new String[size];
            colTypes = new String[size];
            colSizes = new int[size];

            for (int i = 0; i < size; i++) {

                colnames[i] = rsmd.getColumnName(i + 1).toLowerCase();
                if (colnames[i].indexOf("_")!=-1){
                    String[] tname = colnames[i].split("_");
                    String name = "";
                    for (int j = 0; j <tname.length ; j++) {
                        if (j==0){
                            name = name + tname[0];
                        }else{
                            name = name+initcap( tname[j]);
                        }
                        colnames[i] = name;
                    }
                }
               // colnames[i] = colnames[i].toLowerCase().replace("_","");
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
                String[] tname = tablename.split("_");
                String name = "";
                for (String tname1:tname){
                    name = name+initcap(tname1);
                    tablename = name;
                }
                //        tablename=tablename.replace("_","");
            }
            //tablename=tablename.replace("_","");
            String content = parse(colnames, colTypes, colSizes,tablename,packageOutPath);

            try {
                File directory = new File("");

                String path = this.getClass().getResource("").getPath();

                String outputPath = directory.getAbsolutePath() + getDefaultPath()
                        + (packageOutPath+".controller").replace(".", "/") + "/"+ initcap(tablename) + "Controller.java";
                FileWriter fw = new FileWriter(outputPath);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(content);
                pw.flush();
                pw.close();

                System.out.println(initcap(tablename)+"Controller 执行完毕，生成路径为："+outputPath);
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
        sb.append("package " + packageOutPath + ".controller;\r\n");
        sb.append("\r\n");
        sb.append("import "+packageOutPath+".entity."+initcap(tablename)+";\r\n");
        sb.append("import "+packageOutPath+".service."+initcap(tablename)+"Service;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RequestMapping;\r\n");
        sb.append("import org.springframework.web.bind.annotation.RestController;\r\n");
        sb.append("\r\n");
        sb.append("import java.util.List;\r\n");
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
        sb.append("    * @文件名称：" + this.initcap(tablename) + "Controller.java\r\n");
        sb.append("    * @创建时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\r\n");
        sb.append("    * @创  建  人：" + getAuthorName() + " \r\n");
        sb.append("    * @文件描述：" + this.initcap(tablename) + "Controller 控制器\r\n");
        sb.append("    * @文件版本：" + getVersion() + " \r\n");
        sb.append("    */ \r\n");
        // 实体部分
        sb.append("@RestController\r\n");
        sb.append("@RequestMapping("+"\"/"+this.initcap(tablename)+"Controller"+"\""+")\r\n");
        sb.append("public class " + initcap(tablename)+"Controller {\r\n");
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
        sb.append("\t@Autowired\r\n");
        sb.append("\tprivate "+initcap(tablename)+"Service "+tablename+"Service;");
        sb.append("\r\n");
        //拼获取所有的方法
        sb.append("\t//获取所有\r\n");
        sb.append("\t@RequestMapping(value = "+"\""+"/get"+initcap(tablename)+"List"+"\""+")\r\n");
        sb.append("\tpublic List<"+initcap(tablename)+"> "+"get"+initcap(tablename)+"List() {\r\n");
        sb.append("\t\treturn "+tablename+"Service.get"+initcap(tablename)+"List();\r\n");
        sb.append("\t}\r\n");
        //拼修改的方法
        sb.append("\t//修改\r\n");
        sb.append("\t@RequestMapping(value = "+"\""+"/Update"+initcap(tablename)+"\""+")\r\n");
        sb.append("\tpublic int "+"update"+initcap(tablename)+"("+initcap(tablename)+" "+tablename+") {\r\n");
        sb.append("\t\treturn "+tablename+"Service.update"+initcap(tablename)+"("+tablename+");\r\n");
        sb.append("\t}\r\n");
        //拼新增的方法
        sb.append("\t//新增\r\n");
        sb.append("\t@RequestMapping(value = "+"\""+"/Insert"+initcap(tablename)+"\""+")\r\n");
        sb.append("\tpublic int "+"insert"+initcap(tablename)+"("+initcap(tablename)+" "+tablename+") {\r\n");
        sb.append("\t\treturn "+tablename+"Service.insert"+initcap(tablename)+"("+tablename+");\r\n");
        sb.append("\t}\r\n");
        //拼删除的方法
        sb.append("\t//删除\r\n");
        sb.append("\t@RequestMapping(value = "+"\""+"/Delete"+initcap(tablename)+"ByPk\""+")\r\n");
        sb.append("\tpublic int "+"delete"+initcap(tablename)+"ByPk("+sqlType2JavaType(colTypes[0])+" "+colnames[0]+") {\r\n");
        sb.append("\t\treturn "+tablename+"Service.delete"+initcap(tablename)+"ByPk("+colnames[0]+");\r\n");
        sb.append("\t}\r\n");
        //获取单条信息
        sb.append("\t//通过主键获取单条信息\r\n");
        sb.append("\t@RequestMapping(value = "+"\""+"/get"+initcap(tablename)+"\""+")\r\n");
        sb.append("\tpublic "+initcap(tablename)+" get"+initcap(tablename)+"ByPk ("+sqlType2JavaType(colTypes[0])+" "+colnames[0]+") {\r\n");
        sb.append("\t\treturn "+tablename+"Service.get"+initcap(tablename)+"ByPk ("+colnames[0]+");\r\n");
        sb.append("\t}\r\n");
    }
    //获取主键数据类型
//    public String getPkType(String pkid){
//        for (int i = 0; i < colnames.length ; i++) {
//            if (colnames[i].equals(pkid)){
//                return colTypes[i];
//            }
//        }
//        return null;
//    }
}

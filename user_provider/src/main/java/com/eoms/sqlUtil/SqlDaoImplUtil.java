package com.eoms.sqlUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SqlDaoImplUtil extends SqlUtil {
    private String[] colnames; // 列名数组
    private String[] colTypes; // 列名类型数组
    private int[] colSizes; // 列名大小数组
    private String[] recolname;
    private String tablename;

    private boolean f_util = false; // 是否需要导入包java.util.*
    private boolean f_sql = false; // 是否需要导入包java.sql.*
    private boolean f_lang = false; // 是否需要导入包java.sql.*

    public SqlDaoImplUtil(){

    }
    public SqlDaoImplUtil(String retablename,String packageOutPath){
        if(retablename.indexOf("_")!=-1){
            String[] tname = retablename.split("_");
            String name = "";
            for (String tname1:tname){
                name = name+initcap(tname1);
                tablename = name;
            }
            //        tablename=tablename.replace("_","");
        }
        //tablename=retablename.replace("_","");
        try {
            ResultSetMetaData rsmd = getMetaData(retablename);
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
                }else {
                    recolname[i] = colnames[i];
                }
 //               recolname[i]=colnames[i].replace("_","");

            }

            String content = parse(colnames, colTypes, colSizes,retablename,packageOutPath);

            try {
                File directory = new File("");

                String path = this.getClass().getResource("").getPath();

                String outputPath = directory.getAbsolutePath() + getDefaultPath()
                        + (packageOutPath+".dao.impl").replace(".", "/") + "/" + initcap(tablename) + "DaoImpl.java";

                FileWriter fw = new FileWriter(outputPath);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(content);
                pw.flush();
                pw.close();
                System.out.println(initcap(tablename)+"DaoImpl 执行完毕，生成路径为："+outputPath);
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
    private String parse(String[] colnames, String[] colTypes, int[] colSizes,String retablename,String packageOutPath) {
        StringBuffer sb = new StringBuffer();
        // 生成package包路径
        sb.append("package " + packageOutPath + ".dao.impl;\r\n");
        sb.append("\r\n");
        sb.append("import "+packageOutPath+".entity."+initcap(tablename)+";\r\n");
        sb.append("import "+packageOutPath+".dao."+initcap(tablename)+"Dao;\r\n");
        sb.append("import "+packageOutPath+".util."+initcap(tablename)+"RowMapper;\r\n");
        sb.append("import org.springframework.beans.factory.annotation.Autowired;\r\n");
        sb.append("import org.springframework.jdbc.core.BeanPropertyRowMapper;\r\n");
        sb.append("import org.springframework.jdbc.core.RowMapper;\r\n");
        sb.append("import org.springframework.jdbc.core.JdbcTemplate;\r\n");
        sb.append("import org.springframework.stereotype.Component;\r\n");
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
        sb.append("    * @文件名称：" + this.initcap(tablename) + "DaoImpl.java\r\n");
        sb.append("    * @创建时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\r\n");
        sb.append("    * @创  建  人：" + getAuthorName() + " \r\n");
        sb.append("    * @文件描述：" + this.initcap(tablename) + "DaoImpl 实现类\r\n");
        sb.append("    * @文件版本：" + getVersion() + " \r\n");
        sb.append("    */ \r\n");
        // 实体部分
        sb.append("@Component\r\n");
        sb.append("public class " + initcap(tablename)+"DaoImpl implements "+initcap(tablename) + "Dao {\r\n");
        processAllMethod(sb,retablename);// crud方法

        sb.append("}\r\n");

        // System.out.println(sb.toString());
        return sb.toString();
    }

    /**
     * 功能：生成所有方法
     *
     * @param sb
     */
    private void processAllMethod(StringBuffer sb,String retablename) {
        sb.append("\t@Autowired\r\n");
        sb.append("\tprivate JdbcTemplate jdbcTemplate;\r\n");
        sb.append("\r\n");
        sb.append("\t//获取所有\r\n");
        sb.append("\t@Override\r\n");
        sb.append("\tpublic List<"+initcap(tablename)+"> "+"get"+initcap(tablename)+"List() {\r\n");
        sb.append("\t\tString sql = "+"\"select * from "+retablename+"\";\r\n");
        sb.append("\t\t"+initcap(tablename)+"RowMapper "+tablename+"RowMapper = new "+initcap(tablename)+"RowMapper();\r\n");
        sb.append("\t\tList<"+initcap(tablename)+">"+tablename+"List = jdbcTemplate.query(sql, "+tablename+"RowMapper);\r\n");
        sb.append("\t\treturn "+tablename+"List;\r\n");
        sb.append("\t}\r\n");

        sb.append("\t//修改\r\n");
        sb.append("\t@Override\r\n");
        sb.append("\tpublic int "+"update"+initcap(tablename)+"("+initcap(tablename)+" "+tablename+") {\r\n");

        //获取每一个字段拼接update的Sql语句
        String upColname="";
        //拼接update查询参数
        String upargs="";
        //拼接insert查询参数
        String insertargs=tablename+".get"+initcap(recolname[0])+"(),";
        for (int i = 1; i <colnames.length ; i++) {
            if (i!=colnames.length-1) {
                upColname+=colnames[i]+" = ?,";
                insertargs+=tablename+".get"+initcap(recolname[i])+"(),";
            }else {
                upColname+=colnames[i]+" = ?";
                insertargs+=tablename+".get"+initcap(recolname[i])+"()";
            }
            upargs+=tablename+".get"+initcap(recolname[i])+"(),";
        }
        upargs+=tablename+".get"+initcap(recolname[0])+"()";

        sb.append("\t\tString sql = \"update "+retablename+" set "+upColname+" where "+colnames[0]+" = ?\";\r\n");
        sb.append("\t\tObject args[] = {"+upargs+"};\r\n");
        sb.append("\t\tint temp = jdbcTemplate.update(sql, args);\r\n");
        sb.append("\t\treturn temp;\r\n");
        sb.append("\t}\r\n");

        sb.append("\t//新增\r\n");
        sb.append("\t@Override\r\n");
        sb.append("\tpublic int "+"insert"+initcap(tablename)+"("+initcap(tablename)+" "+tablename+") {\r\n");

        //拼接insert的sql语句所需的字段名
        String colnameStr="";
        //拼接insert的sql中的问号
        String questionMark="";
        for (int i = 0; i <colnames.length ; i++) {
            if (i!=colnames.length-1){
                colnameStr+=colnames[i]+",";
                questionMark+="?,";
            }else{
                colnameStr+=colnames[i];
                questionMark+="?";
            }
        }

        sb.append("\t\tString sql = \"insert into "+retablename+"("+colnameStr+") values ("+questionMark+")\";\r\n");
        sb.append("\t\tObject args[] = {"+insertargs+"};\r\n");
        sb.append("\t\tint temp = jdbcTemplate.update(sql, args);\r\n");
        sb.append("\t\treturn temp;\r\n");
        sb.append("\t}\r\n");

        sb.append("\t//删除\r\n");
        sb.append("\t@Override\r\n");
        sb.append("\tpublic int "+"delete"+initcap(tablename)+"ByPk("+sqlType2JavaType(colTypes[0])+" "+recolname[0]+") {\r\n");
        sb.append("\t\tString sql = "+"\"delete from "+retablename+" where "+colnames[0]+" = ?\";\r\n");
        sb.append("\t\tObject args[] = {"+recolname[0]+"};\r\n");
        sb.append("\t\tint temp = jdbcTemplate.update(sql, args);\r\n");
        sb.append("\t\treturn temp;\r\n");
        sb.append("\t}\r\n");

        sb.append("\t//通过主键获取单条信息\r\n");
        sb.append("\t@Override\r\n");
        sb.append("\tpublic "+initcap(tablename)+" get"+initcap(tablename)+"ByPk"+"("+sqlType2JavaType(colTypes[0])+" "+recolname[0]+") {\r\n");
        sb.append("\t\tString sql = "+"\"select * from "+retablename+" where "+colnames[0]+" = ?\";\r\n");
        sb.append("\t\tObject args[] = {"+recolname[0]+"};\r\n");
        sb.append("\t\t"+initcap(tablename)+"RowMapper "+tablename+"RowMapper = new "+initcap(tablename)+"RowMapper();\r\n");
        sb.append("\t\t"+initcap(tablename)+" "+tablename+" = jdbcTemplate.queryForObject(sql,"+tablename+"RowMapper,args);\r\n");
        sb.append("\t\treturn "+tablename+";\r\n");
        sb.append("\t}\r\n");
    }

//    public String getPkType(String pkid){
//        for (int i = 0; i < colnames.length ; i++) {
//            if (colnames[i].equals(pkid)){
//                return colTypes[i];
//            }
//        }
//        return null;
//    }

}

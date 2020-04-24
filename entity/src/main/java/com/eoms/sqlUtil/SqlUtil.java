package com.eoms.sqlUtil;

import java.sql.*;

public class SqlUtil {
    //基本数据配置
    private String packageOutPath;// 指定实体生成所在包的路径
    private String authorName = "王敏";// 作者名字
    private String tablename;// 表名
    private String version = "V0.01"; // 版本
    private String defaultPath = "/src/main/java/";
    private String pkid;//数据库表主键

    // 数据库连接
    private String URL = "jdbc:oracle:thin:@localhost:1522:wangmin";
    private String NAME = "eoms";
    private String PASS = "eoms";
    private String DRIVER = "oracle.jdbc.driver.OracleDriver";

    private Connection con;

    public String getPackageOutPath() {
        return packageOutPath;
    }

    public void setPackageOutPath(String packageOutPath) {
        this.packageOutPath = packageOutPath;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDefaultPath() {
        return defaultPath;
    }

    public void setDefaultPath(String defaultPath) {
        this.defaultPath = defaultPath;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public void setDRIVER(String DRIVER) {
        this.DRIVER = DRIVER;
    }

    public String getPkid() {
        return pkid;
    }

    public void setPkid(String pkid) {
        this.pkid = pkid;
    }

    /**
     * 功能：将输入字符串的首字母改成大写
     *
     * @param str
     * @return
     */
    public  String initcap(String str) {

        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }

        return new String(ch);
    }
    /**
     * 功能：获得列的数据类型
     *
     * @param sqlType
     * @return
     */
    public String sqlType2JavaType(String sqlType) {

        if (sqlType.equalsIgnoreCase("bit")) {
            return "Boolean";
        } else if (sqlType.equalsIgnoreCase("decimal") || sqlType.equalsIgnoreCase("money")
                || sqlType.equalsIgnoreCase("smallmoney") || sqlType.equalsIgnoreCase("numeric")
                || sqlType.equalsIgnoreCase("bigint")) {
            return "Long";
        } else if (sqlType.equalsIgnoreCase("float")) {
            return "Double";
        } else if (sqlType.equalsIgnoreCase("int") || sqlType.equalsIgnoreCase("int identity")) {
            return "Integer";
        } else if (sqlType.equalsIgnoreCase("image") || sqlType.equalsIgnoreCase("varbinary(max)")
                || sqlType.equalsIgnoreCase("varbinary") || sqlType.equalsIgnoreCase("udt")
                || sqlType.equalsIgnoreCase("timestamp") || sqlType.equalsIgnoreCase("binary")) {
            return "Byte[]";
        } else if (sqlType.equalsIgnoreCase("nchar") || sqlType.equalsIgnoreCase("nvarchar(max)")
                || sqlType.equalsIgnoreCase("nvarchar") || sqlType.equalsIgnoreCase("nvarchar(ntext)")
                || sqlType.equalsIgnoreCase("uniqueidentifier") || sqlType.equalsIgnoreCase("xml")
                || sqlType.equalsIgnoreCase("char") || sqlType.equalsIgnoreCase("varchar(max)")
                || sqlType.equalsIgnoreCase("text") || sqlType.equalsIgnoreCase("varchar")||sqlType.equalsIgnoreCase("varchar2")) {
            return "String";
        } else if (sqlType.equalsIgnoreCase("real")) {
            return "Float";
        } else if (sqlType.equalsIgnoreCase("smallint") || sqlType.equalsIgnoreCase("tinyint")) {
            return "Short";
        } else if (sqlType.equalsIgnoreCase("date") || sqlType.equalsIgnoreCase("datetime")
                || sqlType.equalsIgnoreCase("time") || sqlType.equalsIgnoreCase("datetime2")) {
            return "Date";
        } else {
            System.out.println("数据类型异常，类型为：" + sqlType);
        }

        return null;
    }
    /**
     * 创建连接
     */
    public ResultSetMetaData getMetaData(String tablename){
        // 创建连接

        String sql = "select * from " + tablename;
        PreparedStatement pStemt = null;
        ResultSetMetaData rsmd = null;
        try {
            Class.forName(getDRIVER());
            con = DriverManager.getConnection(getURL(), getNAME(), getPASS());
            pStemt = con.prepareStatement(sql);
            rsmd = pStemt.getMetaData();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        return rsmd;
    }

    /**
     * 获取数据库表中主键
     */
    public String getPrimary(String tablename){
        Connection connection=null;
        PreparedStatement prepare=null;
        String sql="SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE " +
                " WHERE TABLE_NAME = '"+tablename+"' AND CONSTRAINT_NAME = 'PRIMARY'AND CONSTRAINT_SCHEMA='lethouse'";
        try{
            Class.forName(getDRIVER());
            connection = DriverManager.getConnection(getURL(), getNAME(), getPASS());
            prepare = connection.prepareStatement(sql);
            ResultSet resultSet = prepare.executeQuery();
            while(resultSet.next()){                  //若有数据，就输出
                pkid= resultSet.getString(1).toLowerCase();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return pkid;
    }

    public  void close(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

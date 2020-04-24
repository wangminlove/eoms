package com.eoms.sqlUtil;

public class DataUtil {
    public void getData(String tablename,String packageOutPath){
      //   new SqlEntityUtil(tablename,packageOutPath);
 //        new SqlRowMapperUtil(tablename,packageOutPath);
  //       new SqlDaoUtil(tablename,packageOutPath);
 //        new SqlDaoImplUtil(tablename,packageOutPath);
//         new SqlServiceUtil(tablename,packageOutPath);
//        new SqlServiceImplUtil(tablename,packageOutPath);
         new SqlControllerUtil(tablename,packageOutPath);
    }
}

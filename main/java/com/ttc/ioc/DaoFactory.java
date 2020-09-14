package com.ttc.ioc;

import com.ttc.dao.EmpDaoMySql;
import com.ttc.dao.EmpDaoOracle;
import com.ttc.dao.IEmpDao;

/**
 * 简单工厂设计模式的代码案例：
 * 1、读取文件
 * 2、构建对象
 */
public class DaoFactory {
    public static IEmpDao getEmpDao(){
        //读取dao.name 值
        String name = "oracle";
        switch ( name ){
            case "oracle" : return new EmpDaoOracle();
            case "mysql" :return  new EmpDaoMySql();
            default:return  null;
        }
    }
}

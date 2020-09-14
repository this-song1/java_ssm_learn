package com.ttc.po;

import com.ttc.dao.EmpDaoMySql;
import com.ttc.service.EmpService;

public class Emp {

    public static void main(String [] args){
        Emp e = new Emp();//构建
        String s =  e.toString();//使用
        EmpService  empService = new EmpService();

        empService.addEmp();
    }
}

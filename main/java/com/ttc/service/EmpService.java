package com.ttc.service;


import com.ttc.dao.IEmpDao;
import com.ttc.ioc.DaoFactory;

public class EmpService {
    IEmpDao empDao;

    public void setEmpDao( ) {
         this.empDao = DaoFactory.getEmpDao();
    }

    public void addEmp(){
        empDao.addEmp();
    }
}

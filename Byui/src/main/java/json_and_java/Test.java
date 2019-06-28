/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_and_java;
import json_and_java.JsonUtil;
import json_and_java.Employee;


/**
 *
 * @author PC User
 */
public class Test {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setEmpNo(202);
        emp.setName("britt");
        emp.setSalary(20000);
        String jsonEmployee=JsonUtil.convertJavaToJson(emp);
    System.out.println(jsonEmployee);
    }
    }


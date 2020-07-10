package cn.wilfredshen.hnu.test.entity;

import java.sql.Date;

/**
 * @author WilfredShen
 */
public class Student {

    private Integer id;
    private String stuNo;
    private String stuName;
    private String sexde;
    private Date brith;
    private String department;
    private String addr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getSexde() {
        return sexde;
    }

    public void setSexde(String sexde) {
        this.sexde = sexde;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

package com.swun.gaoji.sort;

/**
 * Created by Maven on 2018/8/1.
 * Description:
 */
public class SVO {
    /**
     * //学号
     */
    private String no;
    /**
     * //姓名
     */
    private String name ;
    /**
     * 系编码
     */
    private String dept;

    public SVO(String no, String name, String dept) {
        this.no = no;
        this.name = name;
        this.dept = dept;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "SVO{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
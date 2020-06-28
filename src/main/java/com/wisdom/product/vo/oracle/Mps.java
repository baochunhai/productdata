package com.wisdom.product.vo.oracle;//

public class Mps {
    private String mpsno;// 生产计划号
    private String taskno;// 任务号
    private String processfileno;// 工艺文件号
    private String manunumber;// 投产数量
    private String startdate;// 计划开始日期
    private String enddate;// 计划完成日期
    private String department;// 完成单位
    private String status;// 完成状态
    private String type;// 工件类型
    private String urgent;// 是否加急订单
    private String resolve;//

    public String getResolve() {
        return resolve;//
    }

    public void setResolve(String resolve) {
        this.resolve = resolve;//
    }

    public String getMpsno() {
        return mpsno;//
    }

    public void setMpsno(String mpsno) {
        this.mpsno = mpsno;//
    }

    public String getTaskno() {
        return taskno;//
    }

    public void setTaskno(String taskno) {
        this.taskno = taskno;//
    }

    public String getProcessfileno() {
        return processfileno;//
    }

    public void setProcessfileno(String processfileno) {
        this.processfileno = processfileno;//
    }

    public String getManunumber() {
        return manunumber;//
    }

    public void setManunumber(String manunumber) {
        this.manunumber = manunumber;//
    }

    public String getStartdate() {
        return startdate;//
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;//
    }

    public String getEnddate() {
        return enddate;//
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;//
    }

    public String getDepartment() {
        return department;//
    }

    public void setDepartment(String department) {
        this.department = department;//
    }

    public String getStatus() {
        return status;//
    }

    public void setStatus(String status) {
        this.status = status;//
    }

    public String getType() {
        return type;//
    }

    public void setType(String type) {
        this.type = type;//
    }

    public String getUrgent() {
        return urgent;//
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;//
    }

}

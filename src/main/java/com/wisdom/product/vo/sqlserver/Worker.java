package com.wisdom.product.vo.sqlserver;

/**
 * @author Administrator
 * 对应  生产计划任务列表
 */
public class Worker {

    private int workorder_id;//工单id
    private String workorder_code;//工单号
    private String ordercode;//计划号
    private String quantity;//数量
    private String sequence;//工序号
    private String operationcode;//工序编码
    private String operationname;//工序名称
    private String producure_id;//工序id
    private String retrospect_code;//追溯码

    public int getWorkorder_id() {
        return workorder_id;
    }

    public void setWorkorder_id(int workorder_id) {
        this.workorder_id = workorder_id;
    }

    public String getWorkorder_code() {
        return workorder_code;
    }

    public void setWorkorder_code(String workorder_code) {
        this.workorder_code = workorder_code;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getOperationcode() {
        return operationcode;
    }

    public void setOperationcode(String operationcode) {
        this.operationcode = operationcode;
    }

    public String getOperationname() {
        return operationname;
    }

    public void setOperationname(String operationname) {
        this.operationname = operationname;
    }

    public String getProducure_id() {
        return producure_id;
    }

    public void setProducure_id(String producure_id) {
        this.producure_id = producure_id;
    }

    public String getRetrospect_code() {
        return retrospect_code;
    }

    public void setRetrospect_code(String retrospect_code) {
        this.retrospect_code = retrospect_code;
    }
}

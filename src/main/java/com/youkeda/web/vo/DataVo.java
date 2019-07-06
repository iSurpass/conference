package com.youkeda.web.vo;

/**
 * 前端传来数据封装
 *
 * @author Juniors
 */
public class DataVo {

     //会议室号
    private String code;

    //用户会议室所需容量
    private String capacities;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCapacities() {
        return capacities;
    }

    public void setCapacities(String capacities) {
        this.capacities = capacities;
    }
}

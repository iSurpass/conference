package com.youkeda.web.result;

/**
 * @author Juniors
 */
public class Result {

    private String status;

    private String data;

    private String msg = "success";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

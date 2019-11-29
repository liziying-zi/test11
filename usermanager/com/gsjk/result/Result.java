package com.gsjk.result;

/**
 * @program: usermanagement
 * @Description: recoder result information
 * @author: lzy
 * @date: 2019/11/25
 */
public class Result {
    private int resultcode;
    private String resultmessage;

    public Result() {
    }

    public Result(int resultcode, String resultmessage) {
        this.resultcode = resultcode;
        this.resultmessage = resultmessage;
    }

    public int getResultcode() {//给result 赋值 然后返回result的值
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public String getResultmessage() {
        return resultmessage;
    }

    public void setResultmessage(String resultmessage) {
        this.resultmessage = resultmessage;
    }
}

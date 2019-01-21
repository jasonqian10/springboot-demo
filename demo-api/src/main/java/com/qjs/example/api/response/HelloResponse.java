package com.qjs.example.api.response;

/**
 * @author qianjiasong
 * @date 2019/1/20
 */
public class HelloResponse {

    private String code = "200";
    private String message;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

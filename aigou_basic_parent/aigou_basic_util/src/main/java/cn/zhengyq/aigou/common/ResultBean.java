package cn.zhengyq.aigou.common;

/**
 * @Author Administrator
 * @Date 2020/12/11 19:37
 * @Version 1.0
 */
public class ResultBean {
    private boolean success = true;
    private String message = "操作成功！";
    private Object object;

    private ResultBean() {
    }

    public ResultBean(boolean success, String message, Object object) {
        this.success = success;
        this.message = message;
        this.object = object;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", object=" + object +
                '}';
    }

    public boolean isSuccess() {
        return success;
    }

    public ResultBean setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResultBean setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public ResultBean setObject(Object object) {
        this.object = object;
        return this;
    }

    public static ResultBean me(){
        return new ResultBean();
    }

}

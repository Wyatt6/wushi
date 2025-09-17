package fun.xianlai.wushi.basic.exceptions;

/**
 * @author WyattLau
 */
public class SystemException extends RuntimeException {
    public SystemException() {
        super("未知系统错误");
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
}

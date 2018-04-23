package cn.zhiren.auth.filter;

import cn.zhiren.core.DTO.BaseRespDTO;
import cn.zhiren.core.DTO.ResultStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    /* 表明这个handler只处理什么类型的异常
     * */
    @ExceptionHandler
    // 返回值为json或者其他对象
    @ResponseBody
    public BaseRespDTO<?> handle(Exception e) {
        BaseRespDTO baseResp = new BaseRespDTO();
        baseResp.setMessage(e.getMessage());
        if (e instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            baseResp.setStatus(ResultStatus.http_status_not_found.getResultStatus());
        } else {
            baseResp.setStatus(ResultStatus.http_status_internal_server_error.getResultStatus());
        }
        baseResp.setData("");
        return baseResp;
    }
}


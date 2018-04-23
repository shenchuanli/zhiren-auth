package cn.zhiren.auth.web;

import cn.zhiren.core.DTO.BaseRespDTO;
import cn.zhiren.core.DTO.ResultStatus;
import cn.zhiren.auth.dto.DemoDTO;
import cn.zhiren.auth.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @author zh
 * @ClassName cn.zhiren.auth.web.DemoController
 * @Description
 */
@Api(value = "测试", description = "仅仅用于测试")
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;
    /**
     * 根据ID查询用户
     * @param dto
     * @return
     */
    @ApiOperation(value="插入demo", notes="插入demo信息")
    @RequestMapping(value = "/setDemo",method = RequestMethod.POST)
    public CompletableFuture<BaseRespDTO<String>> setDemo(@RequestBody DemoDTO dto){
        return  CompletableFuture.supplyAsync(() -> {
            demoService.setDemo(dto);
            return new BaseRespDTO(ResultStatus.SUCCESS.getResultStatus(),"setDemo ok","");
        });
    }

    /**
    * @Author:Solley
    * @Description:
    * @Date: 2018/4/19 22:51
    * @param:   
    * @return:  * @param null
    */
    @ApiOperation(value="更新demo", notes="更新demo信息")
    @RequestMapping(value = "/updateDemo",method = RequestMethod.PUT)
    public CompletableFuture<BaseRespDTO<String>> updateDemo(@RequestBody DemoDTO dto){
        return  CompletableFuture.supplyAsync(() -> {
            demoService.updateDemo(dto);
            return new BaseRespDTO(ResultStatus.SUCCESS.getResultStatus(),"updateDemo ok","");
        });
    }

    @ApiOperation(value="删除demo", notes="根据code删除demo")
    @RequestMapping(value = "/deleteDemo/{code}",method = RequestMethod.DELETE)
    public CompletableFuture<BaseRespDTO<String>> deleteDemo(@PathVariable String code){
        return  CompletableFuture.supplyAsync(() -> {
            demoService.deleteDemo(code);
            return new BaseRespDTO(ResultStatus.SUCCESS.getResultStatus(),"deleteDemo ok","");
        });
    }

    /**
    * @Author:Solley
    * @Description:
    * @Date: 2018/4/11 22:09 
    * @param:   
    * @return:  * @param null
    */
    @ApiOperation(value="根据名称获得用户信息", notes="根据url的name来获取用户详细信息")
    @ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/getDemos/{name}",method = RequestMethod.GET)
    public CompletableFuture<BaseRespDTO<List<DemoDTO>>> getDemos(@PathVariable String name){
        return  CompletableFuture.supplyAsync(()->{
           List<DemoDTO> demoDTOS = demoService.getDemos(name);
           return new BaseRespDTO(ResultStatus.SUCCESS.getResultStatus(),"ok",demoDTOS);
        });
    }
}

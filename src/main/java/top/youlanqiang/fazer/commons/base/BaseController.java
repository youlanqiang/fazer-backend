package top.youlanqiang.fazer.commons.base;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import top.youlanqiang.fazer.commons.domain.AjaxResult;
import top.youlanqiang.fazer.commons.domain.BaseDomain;


/**
 * @author youlanqiang
 * created in 2022/3/27 00:32
 */
@SecurityRequirement(name = "bearerAuth")
public class BaseController<T extends BaseDomain, S extends BaseService<T>> {

    @Autowired(required = false)
    private S service;


    @PostMapping
    public AjaxResult<Void> save(@RequestBody T t){
        return AjaxResult.to(service.save(t));
    }

    @PutMapping
    public AjaxResult<Void> update(@RequestBody T t){
        return AjaxResult.to(service.update(t));
    }

    @GetMapping("/{id}")
    public AjaxResult<T> getById(@PathVariable String id){
        return AjaxResult.success(service.getById(id));
    }

    @DeleteMapping("/{id}")
    public AjaxResult<Void> removeById(@PathVariable String id){
        return AjaxResult.to(service.deleteById(id));
    }
    
    @GetMapping("/page/{pageNum}/{pageSize}")
    public AjaxResult<Page<T>> page(@PathVariable Integer pageNum,
                                 @PathVariable Integer pageSize){
        return AjaxResult.success(service.page(pageNum, pageSize));
    }

    public S service(){
        return service;
    }
}

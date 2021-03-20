package com.andy.manage.base.controller;

import com.andy.manage.base.utils.StateParameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping(value="/first")
public class BaseController {

  protected final String success = StateParameter.SUCCESS;
  protected final String  fail = StateParameter.FAULT;

  protected final Logger logger = LoggerFactory.getLogger(this.getClass());

  public ModelMap getModelMap(String status, Object data, String msg){
    ModelMap modelMap=new ModelMap();
    modelMap.put("status", status);
    modelMap.put("data", data);
    modelMap.put("msg", msg);
    return modelMap;

  }

  public String getUuid(){
    String uuid = UUID.randomUUID().toString(); //获取UUID并转化为String对象
    uuid = uuid.replace("-", "");
    return uuid;
  }

}

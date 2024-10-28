package com.mms.app_config_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user")
public interface UserClient  {

    @RequestMapping(method = RequestMethod.GET, value="/user")
    public String getMensajeUser();

}

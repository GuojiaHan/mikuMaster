package com.bone.miku.common.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ClassName MVCConfiguration
 * @Description TODO
 * @Author HanGuojia
 * @Version 1.0
 * @Since 2019/7/28 9:46
 * @Modefied [XXXX年XX月XX日 XX人修改了XXX内容]
 **/

@Configurable
public class MVCConfiguration extends WebMvcConfigurationSupport {
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("forward:/index.html");

        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

        super.addViewControllers(registry);

    }
}

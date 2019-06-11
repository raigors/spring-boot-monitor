package com.github.springbootmonitor.controller;

import com.github.springbootmonitor.pojo.ResultDO;

/**
 * <p>
 * 创建时间为 17:16 2019-06-05
 * 项目名称 spring-boot-monitor
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

public interface IMongoJobController {

    ResultDO<String> runJob(String collection);

}

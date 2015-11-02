package org.wangbiao.s2sh.web.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.wangbiao.s2sh.model.TestModel;
import org.wangbiao.s2sh.service.TestService;

/**
 * Created by Wang Biao on 15/10/27.
 */
@Controller
@Scope("prototype")
public class TestController extends ActionSupport {

    Logger log = Logger.getLogger(TestController.class);

    @Autowired
    private TestService service;

    public String test() {
        TestModel test = new TestModel();
        test.setName("wangbiao");
        test.setAge(18);
        service.save(test);

        log.info("SUCCESS");
        return SUCCESS;
    }
}

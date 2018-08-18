package io.choerodon.demo.api.controller.v1;/**
 * Created by WuQiChuan on 2018/8/18.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 武琦川@hand-china.com
 * @version 1.0
 * @name MyName
 * @description
 * @date 2018/8/18 11:18
 */
@Component
@ConfigurationProperties(prefix = "myname")
public class MyName {
    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyName{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}

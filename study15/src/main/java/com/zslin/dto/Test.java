package com.zslin.dto;

/**
 * @author Bell
 * @version 1.0
 * @description: TODO
 * @date 2021/7/28 20:14
 */
public class Test {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test(Integer readCount, String name) {
        this.readCount = readCount;
        this.name = name;
    }

    private Integer readCount;
    private String name;

}

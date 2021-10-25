package com.epam.testautomation.impl.api;

import lombok.Getter;

@lombok.Data
public class Data {
    @Getter
    private int id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
}

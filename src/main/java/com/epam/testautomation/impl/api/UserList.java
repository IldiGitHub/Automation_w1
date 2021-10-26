package com.epam.testautomation.impl.api;

import java.util.List;

@lombok.Data
public class UserList {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<Data> data;
    private Support support;

}

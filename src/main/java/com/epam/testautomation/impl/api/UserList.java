package com.epam.testautomation.impl.api;

import java.util.List;

public class UserList {
    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public List<Data> data;
    public Support support;

    public List<Data> getData() {
        return this.data;
    }

}

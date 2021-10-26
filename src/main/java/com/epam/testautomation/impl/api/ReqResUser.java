package com.epam.testautomation.impl.api;

import lombok.Data;

@Data
public class ReqResUser {
    private String name;
    private String job;
    private String id;
    private String createdAt;

    public ReqResUser(String paramName, String paramJob) {
        this.name = paramName;
        this.job = paramJob;
    }

    public ReqResUser() {
    }

    public ReqResUser(String paramName) {
        this.name = paramName;
    }
}

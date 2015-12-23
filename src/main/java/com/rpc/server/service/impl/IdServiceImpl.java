package com.rpc.server.service.impl;

import com.rpc.server.service.IdService;

/**
 * Created by hubo on 2015/12/23
 */
public class IdServiceImpl implements IdService {
    @Override
    public String nextId(String sys, String module) {
        return "hello world";
    }
}

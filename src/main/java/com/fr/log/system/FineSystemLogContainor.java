package com.fr.log.system;

import java.util.LinkedList;
import java.util.List;

import com.fr.log.FineLogContainor;

/*
 * 系统日志存储容器 - 默认内存分类存储 - 内存json
 */
public class FineSystemLogContainor extends FineLogContainor {

    private final List<FineSystemLogObject> cache = new LinkedList<>();

    public void add(FineSystemLogObject ele) {
        if (ele != null) {
            cache.add(ele);
        }
    }

    public List<FineSystemLogObject> getCache() {
        return cache;
    }
}

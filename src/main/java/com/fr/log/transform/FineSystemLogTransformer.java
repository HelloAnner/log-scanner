package com.fr.log.transform;

import com.fr.log.system.FineSystemLogContainor;
import com.fr.log.transform.from.FineLogTransformFromFile;

/*
 * 系统日志格式转换器 - fanruan.log
 * 历史存储的fanruan.log -> 内存json格式
 */
public class FineSystemLogTransformer extends FineLogTransformer<FineLogTransformFromFile, FineSystemLogContainor> {

    @Override
    public FineSystemLogContainor transform(FineLogTransformFromFile from) {
        return null;
    }

}

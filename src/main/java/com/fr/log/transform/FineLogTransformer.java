package com.fr.log.transform;

import com.fr.log.FineLogContainor;
import com.fr.log.transform.from.FineLogTransformFrom;

/**
 * 日志格式转换器
 * 
 * 1. 历史因素，日志记录格式不便于分析
 */
public abstract class FineLogTransformer<T extends FineLogTransformFrom, K extends FineLogContainor> {

    public abstract K transform(T from);
}

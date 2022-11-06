package com.fr.log;

import com.fr.log.system.FineSystemLogContainor;
import com.fr.log.transform.FineLogTransformer;
import com.fr.log.transform.FineSystemLogTransformer;
import com.fr.log.transform.from.FineLogTransformFromFile;

/*
 * 日志部分的操作入口
 */
public class FineLogMain {

    public static void main(String[] args) {

        // 日志转换器
        FineLogTransformer<FineLogTransformFromFile, FineSystemLogContainor> transformer = new FineSystemLogTransformer();
        FineSystemLogContainor containor = transformer.transform(new FineLogTransformFromFile(""));
        System.out.println(containor.getCache().size());
    }
}

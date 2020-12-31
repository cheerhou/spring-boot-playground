package com.cheerhou.springbootplayground;

import java.util.function.BiFunction;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/31
 */
public class Movie {
    enum Type {
        REGULAR(PriceService::computeRegularPrice),
        NEW_RELEASE(PriceService::computerNewReleasePrice),
        CHILDREN(PriceService::computeChildrenPrice);

        //price的具体计算逻辑, takes: PriceService, days, returns: price
        public final BiFunction<PriceService, Integer, Integer> priceAlgo;

        Type(BiFunction<PriceService, Integer, Integer> priceAlgo) {
            this.priceAlgo = priceAlgo;
        }
    }
}

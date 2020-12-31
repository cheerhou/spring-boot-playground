package com.cheerhou.springbootplayground;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/31
 */
public class PriceService {
    private final NewReleasePriceRepo repo;

    public PriceService(NewReleasePriceRepo repo) {
        this.repo = repo;
    }

    public int computerNewReleasePrice(int days) {
        return days * repo.getFactor();
    }

    public int computeRegularPrice(int days) {
        return days + 1;
    }

    public int computeChildrenPrice(int days) {
        return 5;
    }

    public int computePrice(Movie.Type type, int days) {
        return type.priceAlgo.apply(this, days);
    }
}

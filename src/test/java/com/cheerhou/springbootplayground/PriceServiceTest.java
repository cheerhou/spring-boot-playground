package com.cheerhou.springbootplayground;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/31
 */
class PriceServiceTest {

    @Test
    void computePrice() {
        int days = 3;
        NewReleasePriceRepo repo = new NewReleasePriceRepo(5);
        PriceService priceService = new PriceService(repo);

        int childrenPrice = priceService.computePrice(Movie.Type.CHILDREN, days);
        int regularPrice = priceService.computePrice(Movie.Type.REGULAR, days);
        int newReleasePrice = priceService.computePrice(Movie.Type.NEW_RELEASE, days);

        assertEquals(childrenPrice, 5);
        assertEquals(regularPrice, days + 1);
        assertEquals(newReleasePrice, days * repo.getFactor());
    }
}
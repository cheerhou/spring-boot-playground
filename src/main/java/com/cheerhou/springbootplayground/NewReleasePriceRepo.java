package com.cheerhou.springbootplayground;

import lombok.Data;
import lombok.NonNull;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/31
 */
@Data
public class NewReleasePriceRepo {
    @NonNull
    private int factor;
}

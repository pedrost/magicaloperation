package com.github.pedrost.magicaloperation;

import java.math.BigDecimal;

public class MagicalOperation {

    public static BigDecimal add(BigDecimal x, BigDecimal y) { return x.add(y); }

    public static BigDecimal subtract(BigDecimal x, BigDecimal y) { return x.subtract(y); }

    public static BigDecimal magical(BigDecimal x) { return x.multiply(new BigDecimal(42)); }

}

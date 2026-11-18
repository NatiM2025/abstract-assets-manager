package com.pluralsight;

import java.math.BigDecimal;

public abstract class Cash extends Asset{
    private BigDecimal homeCash;

    public BigDecimal getHomeCash() {
        return homeCash;
    }

    public void setHomeCash(BigDecimal homeCash) {
        this.homeCash = homeCash;
    }

    public Cash(String description, String dateAcquired, BigDecimal originalCost, BigDecimal homeCash) {
        super(description, dateAcquired, originalCost);
        this.homeCash = homeCash;
    }
    Asset asset = new Asset("home cash","hahaha",new BigDecimal(100000)) {
        @Override
        public BigDecimal getValue() {
            return null;
        }
    };
}

package com.kodilla.good.patterns.food2door.dto;

import com.kodilla.good.patterns.food2door.Supplier;

public class ResponseDto {
    private boolean isOrdered;
    private Supplier supplier;

    public ResponseDto(boolean isOrdered, Supplier supplier) {
        this.isOrdered = isOrdered;
        this.supplier = supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}

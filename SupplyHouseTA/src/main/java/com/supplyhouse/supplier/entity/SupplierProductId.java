package com.supplyhouse.supplier.entity;

import java.io.Serializable;
import java.util.Objects;

public class SupplierProductId implements Serializable {

    private Long supplierId;
    private Long productId;

    public SupplierProductId() {
    }

    public SupplierProductId(Long supplierId, Long productId) {
        this.supplierId = supplierId;
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierProductId that = (SupplierProductId) o;
        return Objects.equals(supplierId, that.supplierId) && Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierId, productId);
    }
}

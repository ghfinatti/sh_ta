package com.supplyhouse.data_import.entity;

import com.supplyhouse.data_import.EnumMediaType;
import jakarta.persistence.*;

/**
 * Represents file configuration for a supplier combined with file media type,
 * each combination has a product column and quantity column.
 */
@Entity
@Table(name = "SUPPLIER_DATA_CONFIGURATION")
public class SupplierDataConfig {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "SUPPLIER_ID")
    private Long supplierId;

    @Column(name = "PRODUCT_COLUMN_POSITION")
    private Integer productColumnPosition;

    @Column(name = "QUANTITY_COLUMN_POSITION")
    private Integer quantityColumnPosition;

    @Enumerated(EnumType.STRING)
    @Column(name = "FILE_MEDIA_TYPE")
    private EnumMediaType fileMediaType;
}

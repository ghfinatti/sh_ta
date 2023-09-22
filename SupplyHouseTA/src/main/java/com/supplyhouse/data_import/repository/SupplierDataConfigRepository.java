package com.supplyhouse.data_import.repository;

import com.supplyhouse.data_import.EnumMediaType;
import com.supplyhouse.data_import.entity.SupplierDataConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SupplierDataConfigRepository extends JpaRepository<SupplierDataConfig, Long> {

    @Query(value = "SELECT * FROM SUPPLIER_DATA_CONFIGURATION " +
            "WHERE SUPPLIER_ID = :supplierId " +
            "AND FILE_MEDIA_TYPE = :fileMediaType LIMIT 1", nativeQuery = true)
    SupplierDataConfig findDataConfiguration(@Param("supplierId") Long supplierId,
                                             @Param("fileMediaType") EnumMediaType mediaType);


}

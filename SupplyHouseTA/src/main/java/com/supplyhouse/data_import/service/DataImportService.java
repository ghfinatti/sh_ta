package com.supplyhouse.data_import.service;

import com.supplyhouse.data_import.repository.SupplierDataConfigRepository;
import com.supplyhouse.supplier.entity.Product;
import com.supplyhouse.supplier.repository.SupplierProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service to import data from multiple sources and persist in database.
 */
@Service
@RequiredArgsConstructor
public class DataImportService {

    private SupplierDataConfigRepository supplierDataConfigRepository;

    private SupplierProductRepository supplierProductRepository;

    public List<Product> importSupplierProducts() {
        // for each supplier data file, recovers configuration from "SUPPLIER_DATA_CONFIGURATION" table through SupplierDataConfigRepository class
        // based on file's name (each file contains supplier ID and file extension, that will be used to get configuration for this specific file).
        // Uses the configuration to choose the right file reader (Excel, CSV or TXT), reads file and extracts data from right columns,
        // creates "Product" entities for each line in file and saves then to database using the "SupplierProductRepository".
        return null;
    }


}

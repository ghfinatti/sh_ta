package com.supplyhouse.scheduler;

import com.supplyhouse.data_import.service.DataImportService;
import com.supplyhouse.supplier.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Runs scheduled jobs
 */
@EnableScheduling
@Service
@RequiredArgsConstructor
public class SchedulerService {

    private DataImportService dataImportService;

    @Scheduled(cron = "0 0 15 * * *")
    public void processInventoryFiles() {
        //Runs data import service on a cron schedule, once a day.
        List<Product> importedProducts = dataImportService.importSupplierProducts();
    }
}


package com.supplyhouse.reader;

import java.io.IOException;
import java.util.List;
import java.util.function.BiFunction;

public class ExcelFileReader implements TabularFileReader {

    @Override
    public List<String[]> readData(String filePath) throws IOException {
        // Logic to read Excel files
        // could use libraries like Apache POI or Apache POI SS for Excel parsing
        // Example code using Apache POI:
        // FileInputStream fis = new FileInputStream(filePath);
        // Workbook workbook = new XSSFWorkbook(fis);
        // implement logic to read Excel tabular data into a List<String[]> and return it
        return null;
    }

    @Override
    public <T> void extractData(T data, BiFunction<T, String[], Void> extractionMethod, String filePath)
            throws IOException {
        // Reads Excel file and extract wanted data from each line, storing in a data class.
    }
}

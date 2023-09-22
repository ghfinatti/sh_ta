package com.supplyhouse.reader;

import java.io.IOException;
import java.util.List;
import java.util.function.BiFunction;

public class CsvFileReader implements TabularFileReader {

    @Override
    public List<String[]> readData(String filePath) throws IOException {
        // Logic to read CSV files
        // could use libraries like Apache Commons CSV or OpenCSV for CSV parsing
        // Example code using Apache Commons CSV:
        // CSVParser csvParser = CSVParser.parse(new File(filePath), StandardCharsets.UTF_8, CSVFormat.DEFAULT);
        // List<CSVRecord> records = csvParser.getRecords();
        // convert records to a List<String[]> and return it
        return null;
    }

    @Override
    public <T> void extractData(T data, BiFunction<T, String[], Void> extractor, String filePath) throws IOException {
        // Reads CSV file and extract wanted data from each line, storing in a data class.
    }
}

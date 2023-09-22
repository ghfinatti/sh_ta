package com.supplyhouse.reader;

import java.io.IOException;
import java.util.List;
import java.util.function.BiFunction;

public class TextFileReader implements TabularFileReader {


    @Override
    public List<String[]> readData(String filePath) throws IOException {
        // Logic to read text files, parsing delimiter and line breaks, extracting each lines' data,
        // converting records to a List<String[]> and returning it
        return null;
    }

    @Override
    public <T> void extractData(T data, BiFunction<T, String[], Void> extractor, String filePath) throws IOException {
        // Reads Text file and extract wanted data from each line, storing in a data class.
    }
}

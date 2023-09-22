package com.supplyhouse.reader;

import java.io.IOException;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Abstraction for classes that are responsible for reading tabular data from files.
 */
public interface TabularFileReader {

    List<String[]> readData(String filePath) throws IOException;
    // Abstraction for methods responsible for reading and storing data into a list of string arrays,
    // each array is a line from file.

    <T> void extractData(T data, BiFunction<T, String[], Void> extractor, String filePath) throws IOException;
    // Another possibility would be to create a method that extracts data from each line and stores in T class based
    // on a function passed as an argument,
    // this way would not be necessary to store all file content in memory.
}

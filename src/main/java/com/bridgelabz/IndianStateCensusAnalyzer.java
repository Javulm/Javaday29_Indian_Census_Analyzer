package com.bridgelabz;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class IndianStateCensusAnalyzer {
    private static final String CSV_FILE_PATH= "C:\\Users\\javul\\Desktop\\classwork\\indianstatecensusanalyzer\\src\\main\\resources\\IndiaStateCensusData.csv";
    public static int loadIndiaCensusData(String csvFilePath) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
            CsvToBeanBuilder<IndiaCensusCSV> csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
            csvToBeanBuilder.withType(IndiaCensusCSV.class);
            csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
            CsvToBean<IndiaCensusCSV> csvToBean = csvToBeanBuilder.build();
            Iterator<IndiaCensusCSV> censusCSVIterator = csvToBean.iterator();
            int numOfEntries = 0;
            while (censusCSVIterator.hasNext()) {
                numOfEntries++;
                censusCSVIterator.next();
            }
            return numOfEntries;
        } catch (IOException e) {
             e.printStackTrace();
              return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Indian State Census Analyser");
        int numOfEntries = IndianStateCensusAnalyzer.loadIndiaCensusData(CSV_FILE_PATH);
        System.out.println("Number of entries in the file: " + numOfEntries);
    }
}

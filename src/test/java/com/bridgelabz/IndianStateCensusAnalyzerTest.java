package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndianStateCensusAnalyzerTest {
    private static final String CORRECT_CSV_FILE_PATH = "C:\\Users\\javul\\Desktop\\classwork\\indianstatecensusanalyzer\\src\\main\\resources\\IndiaStateCensusData.csv";
    private static final String WRONG_CSV_FILE_PATH = "C:\\Users\\javul\\Desktop\\classwork\\indianstatecensusanalyzer\\resources\\IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFileShouldReturnCorrectNumberOfRecordTest() {
        int numOfEntries;
        try {
            numOfEntries = IndianStateCensusAnalyzer.loadIndiaCensusData(CORRECT_CSV_FILE_PATH);
            Assertions.assertEquals(29, numOfEntries);
        } catch (CensusAnalyserException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenIndiaCensusDataWithWrongFileShouldThrowException() {
        int numOfEntries;
        try {
            numOfEntries = IndianStateCensusAnalyzer.loadIndiaCensusData(WRONG_CSV_FILE_PATH);
            Assertions.assertEquals(29, numOfEntries);
        } catch (CensusAnalyserException e) {
            e.printStackTrace();
        }
    }
}

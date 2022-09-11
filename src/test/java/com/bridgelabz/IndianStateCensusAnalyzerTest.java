package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndianStateCensusAnalyzerTest {
    private static final String CORRECT_CSV_FILE_PATH= "C:\\Users\\javul\\Desktop\\classwork\\indianstatecensusanalyzer\\src\\main\\resources\\IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFileShouldReturnCorrectNumberOfRecordTest() {
        int numOfEntries=IndianStateCensusAnalyzer.loadIndiaCensusData(CORRECT_CSV_FILE_PATH);
        Assertions.assertEquals(29, numOfEntries);
    }
}

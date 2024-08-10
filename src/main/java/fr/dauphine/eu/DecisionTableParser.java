package fr.dauphine.eu;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecisionTableParser {


    public static List<Map<String, String>> parseDecisionTable(String filePath) throws Exception {
        List<Map<String, String>> table = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] headers = reader.readNext(); // First row as header
            String[] row;
            while ((row = reader.readNext()) != null) {
                Map<String, String> rowData = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    rowData.put(headers[i], row[i]);
                }
                table.add(rowData);
            }
        }
        return table;
    }
}

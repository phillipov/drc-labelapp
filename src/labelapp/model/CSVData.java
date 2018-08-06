package labelapp.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVData {
    private File file;
    private String[][] data;
    private String[] columns;

    public CSVData(File file) {
        this.file = file;
        setupCSVData();
    }

    // TODO: 8/2/2018 handle case where allData has length of 0, causing data to be length -1
    private void setupCSVData() {
        String[][] allData = parseFile(this.file);
        this.columns = allData[0]; //first row contains column header names

        this.data = new String[allData.length - 1][allData[0].length]; //fix length issue here
        System.arraycopy(allData, 1, this.data, 0, this.data.length);
    }

    private static String[][] parseFile(File file) {
        List<String> dataRows = getRows(file);
        List<String[]> dataList = new ArrayList<>();

        for(String row : dataRows) {
            dataList.add(parseRow(row));
        }

        String[][] dataArray = new String[dataList.size()][];
        for (int i = 0; i < dataArray.length; i++) {
            String[] row = dataList.get(i);
            dataArray[i] = row;
        }
        return dataArray;
    }

    private static List<String> getRows(File file) {
        List<String> dataRows = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String row;
            while((row = br.readLine()) != null) {
                dataRows.add(row);
            }
            br.close();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }

        return dataRows;
    }

    private static String[] parseRow(String row) {
        row.replaceAll("\"", "");
        return row.split(",");
    }

    private static String[] parseRow(String row, char separator) {
        row.replaceAll("\"", "");
        String regex = "" + separator;
        return row.split(regex);
    }

    public String[][] getData() {
        return data;
    }

    public String[] getColumns() {
        return columns;
    }
}

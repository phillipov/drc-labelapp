package labelapp.model;

import com.opencsv.*;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVHelper {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(getDataTable("src/export.csv"));
        f.pack();
        f.setVisible(true);
    }

    public static JTable getDataTable(String fileName) {
        JTable table = new JTable();
        try {
            CSVReader reader = new CSVReader(new FileReader(fileName));
            List<String[]> entries = reader.readAll();

            String[][] data = makeDataArray(entries);
            String[] columns = data[0];
            data = removeDataHeader(data);

            table = new JTable(data, columns); //add list to 2d array method
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return table;
    }

    private static String[][] makeDataArray(List<String[]> dataList) {
        String[][] dataArray = new String[dataList.size()][dataList.get(0).length];

        for(int i = 0; i < dataList.size(); i++) {
            dataArray[i] = dataList.get(i);
        }

        return dataArray;
    }

    private static String[][] removeDataHeader(String[][] oldData) {
        String[][] newData = new String[oldData.length - 1][oldData[0].length];

        for(int i = 0; i < oldData.length; i++) {
            newData[i] = oldData[i + 1];
        }

        return newData;
    }
}

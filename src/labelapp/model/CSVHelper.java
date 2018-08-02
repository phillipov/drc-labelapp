package labelapp.model;

import com.opencsv.*;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVHelper {
    public static void main(String[] args) {
        try {
            CSVReader reader = new CSVReader(new FileReader("yourfile.csv"));
            List<String[]> myEntries = reader.readAll();

            JTable table = new JTable(myEntries.toArray()); //add list to 2d array method
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

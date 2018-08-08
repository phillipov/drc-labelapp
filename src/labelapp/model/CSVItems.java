package labelapp.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CSVItems extends CSVData {
    private List<Item> items;

    private int nameColumn;
    private int serialNumberColumn;
    private int barcodeColumn;

    public CSVItems(File file, int nameColumn, int serialNumberColumn, int barcodeColumn) {
        super(file);
        this.items = new ArrayList<>();
        this.nameColumn = nameColumn;
        this.serialNumberColumn = serialNumberColumn;
        this.barcodeColumn = barcodeColumn;
        loadItems(super.getData());
    }

    private void loadItems(String[][] dataArray) {
        for(String[] row : dataArray) {
            items.add(parseRowToItem(row));
        }
    }

    private Item parseRowToItem(String[] row) {
        return new Item(row[nameColumn], row[serialNumberColumn], row[barcodeColumn]);
    }
}

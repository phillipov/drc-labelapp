package labelapp.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;

public class ItemTableModel extends AbstractTableModel {
    private ArrayList<Object[]> data;
    private String[] columns;

    public ItemTableModel(Object[][] data, String[] columns) {
        this.data = new ArrayList<>(Arrays.asList(data));
        this.columns = columns;
    }

    public int getRowCount() {
        return data.size();
    }

    public int getColumnCount() {
        return columns.length;
    }

    public Object getValueAt(int row, int column) {
        return data.get(row)[column];
    }
}

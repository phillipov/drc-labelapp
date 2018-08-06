package labelapp.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ItemTableModel extends AbstractTableModel {
    private List<Item> items;
    private String[] columns = {"Item Name", "Serial Number", "Barcode"};

    public ItemTableModel() {
        items = new ArrayList<>();
    }

    public ItemTableModel(String[] columns) {
        items = new ArrayList<>();
        this.columns = columns;
    }

    public ItemTableModel(List<Item> items) {
        this.items = new ArrayList<>();
        this.items.addAll(items);
    }

    public ItemTableModel(List<Item> items, String[] columns) {
        this.items = new ArrayList<>();
        this.items.addAll(items);
        this.columns = columns;
    }

    public void addItem(Item item) {
        items.add(item);
        fireTableDataChanged();
    }

    public void addItemList(List<Item> newItems) {
        items.addAll(newItems);
        fireTableDataChanged();
    }

    public String getValueAt(int row, int column) {
        Item item = items.get(row);
        switch(column) {
            case 0:
                return item.getName();
            case 1:
                return item.getSerialNumber();
            case 2:
                return item.getBarcode();
            default:
                return null;
        }
    }

    public Item getItemAt(int row) {
        return items.get(row);
    }

    public Item removeItemAt(int row) {
        Item removedItem = items.remove(row);
        fireTableDataChanged();
        return removedItem;
    }

    public String getColumnName(int column) { return columns[column]; }

    public int getRowCount() {
        return items.size();
    }

    public int getColumnCount() { return columns.length; }
}

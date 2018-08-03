package labelapp.view;

import labelapp.controller.AppController;
import javax.swing.*;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class ItemTable extends JTable {
    private AppController baseController;
    private TableModel dataModel;
    private TableColumnModel columnModel;

    public ItemTable(AppController baseController, TableModel dataModel, TableColumnModel columnModel) {
        this.baseController = baseController;
        this.dataModel = dataModel;
        this.columnModel = columnModel;
    }
}

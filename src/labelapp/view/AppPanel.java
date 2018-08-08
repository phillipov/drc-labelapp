package labelapp.view;

import labelapp.controller.AppController;
import labelapp.model.*;
import javax.swing.*;
import java.io.File;

public class AppPanel extends JPanel {

    private AppController baseController;

    public AppPanel(AppController baseController) {
        this.baseController = baseController;
    }

    private void setupTablePanel() {
        CSVItems items = new CSVItems(  new File("src\\export.csv"),
                            0, 2, 9);
    }
}

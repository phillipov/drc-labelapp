package labelapp.view;

import labelapp.controller.AppController;
import javax.swing.*;

public class AppPanel extends JPanel {

    private AppController baseController;

    public AppPanel(AppController baseController) {
        this.baseController = baseController;
    }
}

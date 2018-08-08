package labelapp.view;

import labelapp.controller.AppController;

import javax.swing.JFrame;

public class AppFrame extends JFrame {
    private AppPanel basePanel;

    public AppFrame(AppController baseController) {
        basePanel = new AppPanel(baseController);
        setupFrame();
    }

    private void setupFrame() {
        this.setContentPane(basePanel);
        this.setSize(800,600);
        this.setVisible(true);
    }
}
package labelapp.controller;

import labelapp.view.AppFrame;

public class AppController {

    private AppFrame startFrame;

    public void start() {
        startFrame = new AppFrame(this);
    }
}

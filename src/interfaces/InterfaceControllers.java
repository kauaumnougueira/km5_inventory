package interfaces;

import javafx.scene.control.Button;

public interface InterfaceControllers {
    
    public void createFrame(String path, String title);

    public void captureFrame(Button action);

    public void deleteFrameAndGo(Button action, String path, String title);
    
}

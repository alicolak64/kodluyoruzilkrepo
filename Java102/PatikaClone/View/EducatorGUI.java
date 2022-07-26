package Java102.PatikaKlonu.View;

import Java102.PatikaKlonu.Helper.Config;
import Java102.PatikaKlonu.Helper.Helper;

import javax.swing.*;

public class EducatorGUI extends JFrame {
    private JPanel wrapper;

    public EducatorGUI() {
        add(wrapper);
        setSize(400, 400);
        setResizable(false);
        int x = Helper.screenCenter("x", getSize());
        int y = Helper.screenCenter("y", getSize());
        setLocation(x, y);
        setTitle(Config.PROJECT_TITLE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

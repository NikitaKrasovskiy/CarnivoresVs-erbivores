package gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame  {
    public MainWindow() throws Exception{
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        setBounds(30, 30, 1000, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Map());

        setVisible(true);
    }
}

package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Random;

public class Map extends JTable {


    private final int mapSize = 25;
    private final int cellSize = 25;
    private final Random random = new Random();

    public Map() { // установка клеток на игровое поле
        this.setRowHeight(this.cellSize);
        this.setModel(new DefaultTableModel(this.mapSize, this.mapSize));
        for (int i = 0; i < this.mapSize; i++) {
            this.getColumnModel().getColumn(i).setMinWidth(this.cellSize);
            this.getColumnModel().getColumn(i).setMaxWidth(this.cellSize);
        }
        for (int i = 0; i < this.mapSize; i++) {
            for (int j = 0; j < this.mapSize; j++) {
                this.setValueAt(0x0000, j, i);
            }
            setVisible(true);
        }
    }
}

package com.aikaduola.tankbattle;

import javax.swing.*;

public class MyFrame extends JFrame {
    private MyPanel myPanel = null;

    public MyFrame() {
        myPanel = new MyPanel();
        this.setSize(800, 500);
        this.add(myPanel);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("坦克大战");
        this.setVisible(true);
    }
}

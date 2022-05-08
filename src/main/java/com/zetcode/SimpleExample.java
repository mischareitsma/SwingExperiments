package com.zetcode;
import javax.swing.*;


public class SimpleExample {

    JFrame frame;

    public SimpleExample() {
        initComponents();
    }

    private void initComponents() {
        frame = ComponentGenerator.generateJFrame("Simple example");
    }

    public static void main(String[] args) {
        SimpleExample se = new SimpleExample();
        se.frame.setVisible(true);
    }
}

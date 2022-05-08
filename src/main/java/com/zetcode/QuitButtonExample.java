package com.zetcode;

import javax.swing.*;

public class QuitButtonExample {

    private final JFrame frame = ComponentGenerator.generateJFrame("Quit button");

    public QuitButtonExample() {
        initializeComponents();
    }

    private void initializeComponents() {
        LayoutGenerator.generateOneComponentLayout(frame,  ComponentGenerator.generateQuitButton());
    }

    public static void main(String[] args) {
        new QuitButtonExample().frame.setVisible(true);
    }
}

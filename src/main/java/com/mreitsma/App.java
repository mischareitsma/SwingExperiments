package com.mreitsma;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click");
        button.setBounds(130, 100, 100, 40);

        frame.add(button);
        frame.setSize(400, 500);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}

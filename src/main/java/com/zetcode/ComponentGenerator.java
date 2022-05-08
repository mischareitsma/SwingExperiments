package com.zetcode;

import javax.swing.*;

public class ComponentGenerator {

    private ComponentGenerator() {};

    public static JFrame generateJFrame(String title, int width, int height) {
        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return frame;
    }

    public static JFrame generateJFrame(String title) {
        return generateJFrame(title, 300, 200);
    }

    public static JButton generateJButton(String text) {
        return new JButton(text);
    }

    public static JButton generateQuitButton() {
        JButton button = generateJButton("Quit");
        button.addActionListener(event -> System.exit(0));
        return button;
    }
}

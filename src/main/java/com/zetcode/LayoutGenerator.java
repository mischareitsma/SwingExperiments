package com.zetcode;

import javax.swing.*;

public class LayoutGenerator {
    private LayoutGenerator() {}

    public static void generateOneComponentLayout(JFrame frame, JComponent button) {
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // TODO: So will automatically add buttons in a horizontal and vertical sequence? Only on element, so easy?
        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(button).addGap(200));
        layout.setVerticalGroup(layout.createSequentialGroup().addComponent(button).addGap(120));

        frame.pack();
    }
}

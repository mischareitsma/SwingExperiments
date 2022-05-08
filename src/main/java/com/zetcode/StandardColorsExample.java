package com.zetcode;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


class MyLabel extends JLabel {
    public MyLabel() {
        super("", null, LEADING);
    }

    @Override
    public boolean isOpaque() {
        return true;
    }
}

public class StandardColorsExample {

    private final JFrame frame = ComponentGenerator.generateJFrame("Standard colors example");

    private final Color[] colors = { Color.black, Color.blue, Color.cyan,
            Color.darkGray, Color.gray, Color.green, Color.lightGray,
            Color.magenta, Color.orange, Color.pink, Color.red,
            Color.white, Color.yellow };

    public StandardColorsExample() {
        initializeComponents();
    }

    private void initializeComponents() {
        List<JLabel> labels = new ArrayList<>();

        for (Color color: this.colors) {
            labels.add(createColoredLabel(color));
        }

        createLayout(labels.toArray(new JLabel[0]));
    }

    private void createLayout(JLabel[] labels) {
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);

        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                        .addComponent(labels[0])
                        .addComponent(labels[1])
                        .addComponent(labels[2])
                        .addComponent(labels[3]))
                .addGroup(layout.createSequentialGroup()
                        .addComponent(labels[4])
                        .addComponent(labels[5])
                        .addComponent(labels[6])
                        .addComponent(labels[7]))
                .addGroup(layout.createSequentialGroup()
                        .addComponent(labels[8])
                        .addComponent(labels[9])
                        .addComponent(labels[10])
                        .addComponent(labels[11]))
                .addComponent(labels[12])
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(labels[0])
                        .addComponent(labels[1])
                        .addComponent(labels[2])
                        .addComponent(labels[3]))
                .addGroup(layout.createParallelGroup()
                        .addComponent(labels[4])
                        .addComponent(labels[5])
                        .addComponent(labels[6])
                        .addComponent(labels[7]))
                .addGroup(layout.createParallelGroup()
                        .addComponent(labels[8])
                        .addComponent(labels[9])
                        .addComponent(labels[10])
                        .addComponent(labels[11]))
                .addComponent(labels[12])
        );

        frame.pack();
    }

    private JLabel createColoredLabel(Color color) {
        JLabel label = new MyLabel();
        label.setMinimumSize(new Dimension(90, 40));
        label.setBackground(color);

        return label;
    }

    public static void main(String[] args) {
        new StandardColorsExample().frame.setVisible(true);
    }
}

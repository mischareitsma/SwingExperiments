package com.zetcode;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseCoordinatesExample {
    private final JFrame frame = ComponentGenerator.generateJFrame("Mouse coordinate example");
    private final JLabel label = new JLabel("");

    public MouseCoordinatesExample() {
        initializeComponents();
    }

    private void initializeComponents() {
        LayoutGenerator.generateOneComponentLayout(frame, label);

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);

                label.setText("x: " + e.getX() + ", y: " + e.getY());
            }
        });
    }

    public static void main(String[] args) {
        new MouseCoordinatesExample().frame.setVisible(true);
    }

}

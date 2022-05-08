package com.zetcode;

import javax.swing.*;

public class ToolTipExample {
    private final JFrame frame = ComponentGenerator.generateJFrame("Tool Tip Example");
    private final JButton button = ComponentGenerator.generateQuitButton();

    public ToolTipExample() {
        initializeComponents();

    }

    private void initializeComponents() {
        LayoutGenerator.generateOneComponentLayout(frame, button);
        button.setToolTipText("A button component");
    }


    public static void main(String[] args) {
        new ToolTipExample().frame.setVisible(true);
    }
}

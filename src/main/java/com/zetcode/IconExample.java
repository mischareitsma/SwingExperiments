package com.zetcode;

import javax.swing.*;

public class IconExample {

    private final JFrame frame = ComponentGenerator.generateJFrame("Icon Example");
    public IconExample() {
        initializeComponents();
    }

    private void initializeComponents() {
        frame.setIconImage(IconLoader.getImageIconFromResource("icon.png").getImage());
    }

    public static void main(String[] args) {
        new IconExample().frame.setVisible(true);
    }
}

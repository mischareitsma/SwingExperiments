package com.zetcode;

import javax.swing.*;
import java.awt.event.KeyEvent;

// Mnemoincs are keyboard shortcuts that are allowed for certain components: Labes, Buttons and Menu Items.
public class MnemonicsExample {
    private final JFrame frame = ComponentGenerator.generateJFrame("Mnemonics Example");

    public MnemonicsExample() {
        JButton button = ComponentGenerator.generateQuitButton();
        LayoutGenerator.generateOneComponentLayout(frame, button);
        button.setMnemonic(KeyEvent.VK_B);
    }

    public static void main(String[] args) {
        new MnemonicsExample().frame.setVisible(true);
    }
}

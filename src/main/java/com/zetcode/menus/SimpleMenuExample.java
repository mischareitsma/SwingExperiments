package com.zetcode.menus;

import com.zetcode.ComponentGenerator;
import com.zetcode.IconLoader;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class SimpleMenuExample {
    private final JFrame frame = ComponentGenerator.generateJFrame("Simple Menu");

    public SimpleMenuExample() {
        initializeComponents();
    }
    private void initializeComponents() {
        createMenuBar();
    }

    private void createMenuBar() {
        ImageIcon icon = IconLoader.getScaledImageIconFromResource("exit-icon.png", 20, 20);
        JMenuItem menuItem = MenuGenerator.getMenuItem("Exit", KeyEvent.VK_E, icon, (event) -> System.exit(0));

        JMenu menu = MenuGenerator.getMenu("File", KeyEvent.VK_F);
        MenuGenerator.addItemsToMenu(menu, menuItem);

        JMenuBar menuBar = MenuGenerator.getMenuBarWithMenus(menu);
        frame.setJMenuBar(menuBar);
    }

       public static void main(String[] args) {
        new SimpleMenuExample().frame.setVisible(true);
    }
}

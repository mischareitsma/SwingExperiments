package com.zetcode.menus;

import com.zetcode.ComponentGenerator;
import com.zetcode.IconLoader;
import com.zetcode.LayoutGenerator;

import javax.swing.*;

public class SubMenuExample {
    private final JFrame frame = ComponentGenerator.generateJFrame("Simple Menu", 500, 400);
    private final JLabel label = new JLabel("");

    public SubMenuExample() {
        initializeComponents();
    }
    private void initializeComponents() {
        createMenuBar();
        LayoutGenerator.generateOneComponentLayout(frame,label);
    }

    private void createMenuBar() {


        ImageIcon newItemIcon = IconLoader.getScaledImageIconFromResource("new-file-icon.png", 20, 20);
        ImageIcon openItemIcon = IconLoader.getScaledImageIconFromResource("open-file-icon.png", 20, 20);
        ImageIcon saveItemIcon = IconLoader.getScaledImageIconFromResource("save-file-icon.png", 20, 20);
        ImageIcon exitIcon = IconLoader.getScaledImageIconFromResource("exit-icon.png", 20, 20);

        JMenuItem newItem = MenuGenerator.getMenuItem("New", newItemIcon, e -> label.setText("New"));
        JMenuItem openItem = MenuGenerator.getMenuItem("Open", openItemIcon, e -> label.setText("Open"));
        JMenuItem saveItem = MenuGenerator.getMenuItem("Save", saveItemIcon, e -> label.setText("Save"));

        JMenuItem subItemOne = MenuGenerator.getMenuItem("Import newsfeed list...", e -> label.setText("Newsfeed"));
        JMenuItem subItemTwo = MenuGenerator.getMenuItem("Import bookmarks...", e -> label.setText("Bookmarks"));
        JMenuItem subItemThree = MenuGenerator.getMenuItem("Import mail", e -> label.setText("Mail"));

        JMenuItem importItem = MenuGenerator.getMenuWithMenuItems("Import", subItemOne, subItemTwo, subItemThree);

        JMenuItem exitItem = MenuGenerator.getMenuItem("Exit", exitIcon, e -> System.exit(0));

        JMenu fileMenu = new JMenu("File");

        JMenuBar menuBar = MenuGenerator.getMenuBarWithMenus(fileMenu);
        MenuGenerator.addItemsToMenu(fileMenu, newItem, openItem, saveItem);
        fileMenu.addSeparator();
        fileMenu.add(importItem);
        fileMenu.add(exitItem);

        frame.setJMenuBar(menuBar);

    }

    public static void main(String[] args) {
        new SubMenuExample().frame.setVisible(true);
    }
}

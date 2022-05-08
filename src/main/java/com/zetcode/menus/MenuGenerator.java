package com.zetcode.menus;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MenuGenerator {

    private MenuGenerator() {}

    public static JMenuBar getMenuBarWithMenus(JMenu... menus) {
        JMenuBar menuBar = new JMenuBar();

        addMenusToMenuBar(menuBar, menus);

        return menuBar;
    }

    public static void addMenusToMenuBar(JMenuBar menuBar, JMenu... menus) {
        for(JMenu menu: menus) {
            menuBar.add(menu);
        }
    }

    public static JMenu getMenuWithMenuItems(String title, JMenuItem... items) {
        JMenu menu = new JMenu(title);

        addItemsToMenu(menu, items);

        return menu;
    }

    public static void addItemsToMenu(JMenu menu, JMenuItem... items) {
        for(JMenuItem item: items) {
            menu.add(item);
        }
    }

    public static JMenu getMenuWithMnemonicAndMenuItems(String title, int event, JMenuItem... items) {
        JMenu menu = getMenuWithMenuItems(title, items);
        menu.setMnemonic(event);
        return menu;
    }

    public static JMenuItem getMenuItemWithMenuItems(String text, JMenuItem... items) {
        JMenuItem menuItem = new JMenuItem(text);
        for (JMenuItem item: items) {
            menuItem.add(item);
        }
        return menuItem;
    }

    public static JMenuItem getMenuItem(String text) {
        return new JMenuItem(text);
    }

    public static JMenuItem getMenuItem(String text, int mnemonic) {
        return new JMenuItem(text, mnemonic);
    }

    public static JMenuItem getMenuItem(String text, ActionListener al) {
        JMenuItem menuItem = getMenuItem(text);
        menuItem.addActionListener(al);
        return menuItem;
    }

    public static JMenuItem getMenuItem(String text, ImageIcon icon) {
        return new JMenuItem(text, icon);
    }

    public static JMenuItem getMenuItem(String text, int mnemonic, ImageIcon icon) {
        JMenuItem item =getMenuItem(text);
        item.setMnemonic(mnemonic);
        item.setIcon(icon);
        return item;
    }

    public static JMenuItem getMenuItem(String text, int mnemonic, ImageIcon icon, ActionListener al) {
        JMenuItem item = getMenuItem(text, mnemonic, icon);
        item.addActionListener(al);
        return item;
    }

    public static JMenuItem getMenuItem(String text, ImageIcon icon, ActionListener al) {
        JMenuItem item = getMenuItem(text, icon);
        item.addActionListener(al);
        return item;
    }

    public static JMenu getMenu(String text) {
        return new JMenu(text);
    }

    public static JMenu getMenu(String text, int mnemonic) {
        JMenu menu = getMenu(text);
        menu.setMnemonic(mnemonic);
        return menu;
    }

}

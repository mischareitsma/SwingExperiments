package com.zetcode;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class IconLoader {
    private IconLoader() {
    }

    public static ImageIcon getImageIconFromResource(String iconFileName) throws RuntimeException {
        if (!iconFileName.startsWith("/")) iconFileName = "/" + iconFileName;
        try {
            return new ImageIcon(
                    ImageIO.read(IconLoader.class.getResourceAsStream(iconFileName))
            );
        } catch (IOException | NullPointerException e) {
            throw new RuntimeException("Failed to read icon image file", e);
        }
    }

    public static ImageIcon getScaledImageIconFromResource(String iconFileName, int width, int height) {
        ImageIcon imageIcon = getImageIconFromResource(iconFileName);
        Image image = imageIcon.getImage();
        return new ImageIcon(image.getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }

}



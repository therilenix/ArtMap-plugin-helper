package com.example.artmap;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class ImageLoader {

    public static PixelData[][] load(File file) {
        try {
            BufferedImage img = ImageIO.read(file);

            BufferedImage resized = new BufferedImage(32, 32, BufferedImage.TYPE_INT_RGB);
            resized.getGraphics().drawImage(img, 0, 0, 32, 32, null);

            PixelData[][] result = new PixelData[32][32];

            for (int y = 0; y < 32; y++) {
                for (int x = 0; x < 32; x++) {
                    int rgb = resized.getRGB(x, y);
                    result[x][y] = ColorMatcher.match(rgb);
                }
            }

            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

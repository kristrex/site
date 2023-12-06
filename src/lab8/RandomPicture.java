package lab8;

import javax.swing.*;
import java.awt.*;

public class RandomPicture extends JFrame {
    private final int WINDOW_WIDTH = 1280;
    private final int WINDOW_HEIGHT = 900;

    public RandomPicture(String imagePath) {
        setTitle("Image Display");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);

        JPanel panel = new JPanel();
        panel.add(imageLabel);

        add(panel);
    }

    public static void main(String[] args) {
        RandomPicture display = new RandomPicture("C:/Users/kristrex/Downloads/smile.jpg");
        display.setVisible(true);
    }
}
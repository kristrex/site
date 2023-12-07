package lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedPicture extends JFrame implements ActionListener {
    private final int WINDOW_WIDTH = 200;
    private final int WINDOW_HEIGHT = 300;
    private final int FRAME_COUNT = 6;
    private final int FRAME_DELAY = 100;

    private ImageIcon[] frames;
    private JLabel imageLabel;
    private Timer timer;
    private int currentFrame;

    public AnimatedPicture() {
        setTitle("Animated Image");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frames = new ImageIcon[FRAME_COUNT];
        for (int i = 0; i < FRAME_COUNT; i++) {
            frames[i] = new ImageIcon("C:/Users/kristrex/IdeaProjects/javaynik/src/lab8/an" + (i+1) + ".png");
        }

        imageLabel = new JLabel(frames[0]);
        JPanel panel = new JPanel();
        panel.add(imageLabel);

        add(panel);

        timer = new Timer(FRAME_DELAY, this);
        currentFrame = 0;
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        currentFrame = (currentFrame + 1) % FRAME_COUNT;
        imageLabel.setIcon(frames[currentFrame]);
    }

    public static void main(String[] args) {
        AnimatedPicture animation = new AnimatedPicture();
        animation.setVisible(true);
    }
}

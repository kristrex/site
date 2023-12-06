package lab8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShape extends JFrame {
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;

    public RandomShape() {
        setTitle("Random Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random random = new Random();
                for (int i = 0; i < 20; i++) {
                    int x = random.nextInt(WINDOW_WIDTH - 100);
                    int y = random.nextInt(WINDOW_HEIGHT - 100);
                    int width = random.nextInt(100) + 20;
                    int height = random.nextInt(100) + 20;
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                    int shapeType = random.nextInt(2);
                    switch (shapeType) {
                        case 0:
                            Rectangle a = new Rectangle(color, x, y, width, height);
                            a.draw(g);
                            break;
                        case 1:
                            Circle c = new Circle(color, x, y, width, height);
                            c.draw(g);
                            break;
                    }
                }
            }
        };

        add(panel);
    }

    public static void main(String[] args) {
        RandomShape shape = new RandomShape();
        shape.setVisible(true);
    }
}
package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TableFootball extends JFrame implements ActionListener {
    private JButton milanButton, madridButton;
    private JLabel result, lastScorer, winner;
    private int milanScore, madridScore;

    public TableFootball() {
        milanScore = 0;
        madridScore = 0;

        setTitle("Football Match: Milan vs Madrid");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//останавливаем прогу после закрытия приложения

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(159, 162, 171));

        milanButton = new JButton("AC Milan");
        milanButton.setBackground(new Color(157, 22, 22));
        milanButton.addActionListener(this);
        panel.add(milanButton, BorderLayout.WEST);

        madridButton = new JButton("Real Madrid");
        madridButton.setBackground(new Color(231, 231, 231));
        madridButton.addActionListener(this);
        panel.add(madridButton, BorderLayout.EAST);

        result = new JLabel("Result: " + milanScore + " X " + madridScore, SwingConstants.CENTER);
        result.setBackground(new Color(152, 115, 115));
        result.setOpaque(true);
        panel.add(result, BorderLayout.CENTER);

        lastScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
        lastScorer.setBackground(new Color(187, 220, 192));
        lastScorer.setOpaque(true);
        panel.add(lastScorer, BorderLayout.SOUTH);

        winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);
        panel.setSize(400,200);
        winner.setBackground(new Color(166, 107, 192));
        winner.setOpaque(true);//для смены цвета кнопки
        panel.add(winner, BorderLayout.NORTH);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == milanButton) {
            milanScore++;
            result.setText("Result: " + milanScore + " X " + madridScore);
            lastScorer.setText("Last Scorer: AC Milan");
        } else if (e.getSource() == madridButton) {
            madridScore++;
            result.setText("Result: " + milanScore + " X " + madridScore);
            lastScorer.setText("Last Scorer: Real Madrid");
        }

        if (milanScore > madridScore) {
            winner.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        TableFootball match = new TableFootball();
        match.setVisible(true);
    }
}
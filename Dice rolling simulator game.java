import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class DiceRollingSimulator extends JFrame implements ActionListener {

    private JLabel diceLabel;
    private JButton rollButton;
    private Random random;

    public DiceRollingSimulator() {
        setTitle("🎲 Dice Rolling Simulator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        random = new Random();

        diceLabel = new JLabel("🎲", SwingConstants.CENTER);
        diceLabel.setFont(new Font("Serif", Font.BOLD, 100));

        rollButton = new JButton("Roll Dice");
        rollButton.setFont(new Font("Arial", Font.BOLD, 20));
        rollButton.addActionListener(this);

        add(diceLabel, BorderLayout.CENTER);
        add(rollButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int diceValue = random.nextInt(6) + 1; // 1 to 6
        diceLabel.setText(String.valueOf(diceValue));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DiceRollingSimulator::new);
    }
}

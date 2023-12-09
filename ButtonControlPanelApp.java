import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonControlPanelApp extends JFrame {
    private JButton[][] buttons;
    private int activeButtonRow = -1;
    private int activeButtonCol = -1;

    public ButtonControlPanelApp() {
        super("Button Control Panel App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridLayout(4, 4));

        buttons = new JButton[4][4];

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = createButton();
                add(buttons[i][j]);
            }
        }

        setVisible(true);
    }

    private JButton createButton() {
        JButton button = new JButton();
        button.setBackground(Color.BLUE);
        button.setIcon(new ImageIcon("path/to/passive-icon.png"));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                int clickedRow = -1;
                int clickedCol = -1;

                // Dizide tıklanan butonun konumunu buluyoruz
                for (int i = 0; i < buttons.length; i++) {
                    for (int j = 0; j < buttons[i].length; j++) {
                        if (buttons[i][j] == clickedButton) {
                            clickedRow = i;
                            clickedCol = j;
                            break;
                        }
                    }
                }

                // Daha önce aktif olan butonu devre dışı bırakıyoruz
                if (activeButtonRow != -1 && activeButtonCol != -1) {
                    buttons[activeButtonRow][activeButtonCol].setBackground(Color.BLUE);
                    buttons[activeButtonRow][activeButtonCol].setIcon(new ImageIcon("path/to/passive-icon.png"));
                }

                // Tıklanan butonu etkinleştiriyoruz
                activeButtonRow = clickedRow;
                activeButtonCol = clickedCol;
                clickedButton.setBackground(Color.RED);
                clickedButton.setIcon(new ImageIcon("path/to/active-icon.png"));

                // GraphQL mutasyonunu çalıştırıyoruz (bunu kendi mantığınızla değiştirebilirsiniz)
                runGraphQLMutation();

                // Burada dinamik metin içeriğini ayarlayabiliriz
                // clickedButton.setText("Dinamik Metin");

            }
        });

        return button;
    }

    private void runGraphQLMutation() {
        // GraphQL mutasyon mantığınızı buraya uyguluyoruz
        System.out.println("Running GraphQL Mutation...");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonControlPanelApp();
            }
        });
    }
}
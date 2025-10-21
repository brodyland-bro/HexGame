import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Tutorial {
    private JFrame frame;
    private JPanel imagePanel, buttonPanel;
    private JLabel imageLabel;
    private JButton home, binaryButton, hexButton, convertButton;
    private ImageIcon[] images;

    public Tutorial(JFrame gameFrame) {
        initializeFrame();

        images = new ImageIcon[3];
        images[0] = new ImageIcon("Assets\\Images\\Binary.png");
        images[1] = new ImageIcon("Assets\\Images\\Hex.png");
        images[2] = new ImageIcon("Assets\\Images\\Converting.png");

        imagePanel = new JPanel();
        imagePanel.setPreferredSize(new Dimension(1200,800));
        imageLabel = new JLabel();
        imageLabel.setIcon(images[0]);
        imagePanel.add(imageLabel);

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(1200,200));
        initializeButtons(gameFrame);
        buttonPanel.add(home);
        buttonPanel.add(binaryButton);
        buttonPanel.add(hexButton);
        buttonPanel.add(convertButton);

        frame.add(imagePanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private void close(JFrame gameFrame) {
        frame.dispose();
        gameFrame.toFront();

    }

    private void initializeButtons(JFrame gameFrame) {
        home = new JButton("Home");
        home.addActionListener(e->close(gameFrame));
        home.setPreferredSize(new Dimension(250,150));
        home.setFont(new Font("Impact", Font.PLAIN, 25));
        home.setBackground(Color.WHITE);

        binaryButton = new JButton("Binary");
        binaryButton.addActionListener(e->imageLabel.setIcon(images[0]));
        binaryButton.setToolTipText("Learn more about binary");
        binaryButton.setPreferredSize(new Dimension(250,150));
        binaryButton.setFont(new Font("Impact", Font.PLAIN, 25));
        binaryButton.setBackground(Color.WHITE);

        hexButton = new JButton("Hexadecimal");
        hexButton.addActionListener(e->imageLabel.setIcon(images[1]));
        hexButton.setToolTipText("Learn more about hexadecimal");
        hexButton.setPreferredSize(new Dimension(250,150));
        hexButton.setFont(new Font("Impact", Font.PLAIN, 25));
        hexButton.setBackground(Color.WHITE);

        convertButton = new JButton("Converting");
        convertButton.addActionListener(e->imageLabel.setIcon(images[2]));
        convertButton.setToolTipText("Learn more about converting between hex & binary");
        convertButton.setPreferredSize(new Dimension(250,150));
        convertButton.setFont(new Font("Impact", Font.PLAIN, 25));
        convertButton.setBackground(Color.WHITE);
    }

    private void initializeFrame() {
        frame = new JFrame("Tutorial");
        frame.toFront();
        frame.setSize(1200, 1000);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
    }
}

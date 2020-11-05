package com.company;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public abstract class Kitchen extends JFrame implements ActionListener {
    JFrame kitchen;
    JProgressBar progressBar;
    JButton inventory;

    Kitchen() {

        JFrame kitchen = new JFrame("Kitchen");
        JProgressBar progressBar = new JProgressBar(JProgressBar.VERTICAL);
        progressBar.setStringPainted(true);
        progressBar.setEnabled(true);
        progressBar.setBounds(25, 35, 30, 600);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.GREEN);
        Icon bag = new ImageIcon("C:\\Users\\tobia\\IdeaProjects\\trash.png");
        JButton inventory = new JButton(bag);
        inventory.setBounds(750, 40, 45, 45);
        inventory.setOpaque(false);
        inventory.setContentAreaFilled(false);
        inventory.setBorderPainted(false);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreatePickup();
            }
        };
        inventory.addActionListener(actionListener);

        kitchen.setTitle("kitchen");
        kitchen.setSize(850, 850);
        kitchen.setLayout(null);
        JLabel background1;
        ImageIcon kit = new ImageIcon("C:\\Users\\tobia\\IdeaProjects\\Background.jpg");
        background1 = new JLabel("", kit, JLabel.CENTER);
        background1.setBounds(0, 0, 849, 716);
        kitchen.setVisible(true);
        kitchen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        try {
            kitchen.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\tobia\\IdeaProjects\\Background.jpg")))));

        } catch (IOException e) {
            e.printStackTrace();
        }
        kitchen.pack();
        kitchen.add(progressBar);
        kitchen.add(inventory);

        //ignorer alt under denne kommentar pls lortet virker ikke endnu :'(
        progressBar.addChangeListener(fill());
    }

    public ChangeListener fill() {

        int i = 0;
        try {
            while (i <= 100) {
                if (i < 45 && i > 0) {
                    progressBar.setString("Miljøsvin");

                } else if (i >= 45 && i <= 75) {
                    progressBar.setString("Miljøbevidst");
                } else {
                    progressBar.setString("Miljøhelt");
                }
                    progressBar.setValue(i + 10);
                    Thread.sleep(3000);
                    i +=20;

            }
        } catch (Exception e) {
        }
        return null;
    }
}







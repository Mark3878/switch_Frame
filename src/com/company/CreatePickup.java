package com.company;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;

public class CreatePickup extends JFrame {

    static JFrame itemPickup;

    public CreatePickup() {
        itemPickup = new JFrame("items");
        itemPickup.setBounds (300,200, 300, 300);
        itemPickup.setLayout (null);
        itemPickup.setVisible(true);
        itemPickup.setTitle("items");
        itemPickup.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JLabel background1;
        ImageIcon itm =  new ImageIcon("C:\\Users\\tobia\\IdeaProjects\\trash2.png");
        background1 = new JLabel ("", itm, JLabel.CENTER);
        background1.setBounds(0,0,300,300);


        try {
            itemPickup.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\tobia\\IdeaProjects\\trash2.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        itemPickup.pack();
    }

}


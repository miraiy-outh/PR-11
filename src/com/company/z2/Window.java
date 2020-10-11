package com.company.z2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
    Window() {
        setSize(700, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("NORTHWEST");
        label1.setBounds(0, 0, 100, 25);
        JLabel label2 = new JLabel("WEST");
        label2.setBounds(0, 200, 100, 25);
        JLabel label3 = new JLabel("SOUTHWEST");
        label3.setBounds(0, 400, 100, 25);
        JLabel label4 = new JLabel("NORTH");
        label4.setBounds(200, 0, 100, 25);
        JLabel label5 = new JLabel("CENTER");
        label5.setBounds(200, 200, 100, 25);
        JLabel label6 = new JLabel("SOUTH");
        label6.setBounds(200, 400, 100, 25);
        JLabel label7 = new JLabel("NORTHEAST");
        label7.setBounds(400, 0, 100, 25);
        JLabel label8 = new JLabel("EAST");
        label8.setBounds(400, 200, 100, 25);
        JLabel label9 = new JLabel("SOUTHEAST");
        label9.setBounds(400, 400, 100, 25);

        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label9);

        Rectangle r = new Rectangle();
        add(r);
        setVisible(true);
        setLocationRelativeTo(null);
        Timer time = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point point = MouseInfo.getPointerInfo().getLocation();
                double x = point.getX();
                double y = point.getY();
                if (0 <= x && x < 200) {
                    if (0 <= y && y <= 200) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в СЗАО");
                    }
                    else if (200 < y && y <= 400) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
                    }
                    else if (400 < y && y <= 600){
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮЗАО");
                    }
                }
                else if (200 < x && x <= 400) {
                    if (0 <= y && y <= 200) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
                    }
                    else if (200 < y && y <= 400) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
                    }
                    else if (400 < y && y <= 600){
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО");
                    }
                }
                else if (400 < x && x <= 600){
                    if (0 <= y && y <= 200) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в СВАО");
                    }
                    else if (200 < y && y < 400) {
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
                    }
                    else if (400 < y && y <= 600){
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮВАО");
                    }
                }
            }
        });
        time.start();
    }
}

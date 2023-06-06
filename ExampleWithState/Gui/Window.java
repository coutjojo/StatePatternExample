package edu.dhbw.exam.StateDesign.Example.Gui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private static Window instance = null;
    private final Dimension windowDimension = new Dimension(1000,800);
    private JLabel elevatorPicture = null;

    private JPanel elevatorControl = null;
    String title = null;

    private Window(String title){
        this.title = title;
        init();
    }

    private void init(){
        this.setTitle(this.title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(windowDimension);
        this.setLayout(new BorderLayout());
        guiInit();
        this.add(elevatorPicture,BorderLayout.WEST);
        this.setVisible(true);


    }

    private void guiInit(){
        elevatorPicture = new JLabel();
        ImageIcon image = new ImageIcon("src/edu/dhbw/StateDesign/Example/FahrstuhlSprites/DoorClosed.jpg");
        elevatorPicture.setIcon(image);
        Dimension size = elevatorPicture.getPreferredSize();
        elevatorPicture.setBounds(50, 30, size.width*2, size.height*2);


    }

    public static synchronized Window getInstance() {
        if(instance == null){
            instance = new Window("State Design Pattern");
        }
        return instance;
    }
}

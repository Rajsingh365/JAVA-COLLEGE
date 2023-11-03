package Q14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends Frame implements ActionListener  {
    Button register;

    TextField nameText;
    TextField addressText;
    TextField birthdayText;
    GUI(){
        this.setLayout(null);
        Label name = new Label("Name: ");
        Label address = new Label("Address: ");
        Label birthday= new Label("Birthday: ");
        Label gender = new Label("Gender: ");
        Label job = new Label("Job: ");
        register = new Button("Register: ");
        Button exit = new Button("Exit: ");

        name.setBounds(20,50,70,25);
        address.setBounds(20,80,70,25);
        birthday.setBounds(20,110,70,25);
        gender.setBounds(20,140,70,25);
        job.setBounds(20,170,70,25);

        register.setBounds(20,200,70,20);
        register.addActionListener(this);
        exit.setBounds(100,200,70,20);

        this.add(name);
        this.add(address);
        this.add(birthday);
        this.add(gender);
        this.add(job);

        this.add(register);
        this.add(exit);

        nameText = new TextField();
        addressText = new TextField();
        birthdayText = new TextField();
        nameText.setBounds(75,50,100,25);
        addressText.setBounds(75,80,100,25);
        birthdayText.setBounds(75,110,100,25);
        this.add(nameText);
        this.add(addressText);
        this.add(birthdayText);

       Choice list = new Choice();
        list.add("Male");
        list.add("Female");
        list.setBounds(100,140,70,25);
        list.setFont(new Font("Plain",Font.BOLD,10));
        this.add(list);
        CheckboxGroup jobType = new CheckboxGroup();
        Checkbox student = new Checkbox("Student",jobType,false);
        Checkbox teacher = new Checkbox("Teacher",jobType,false);
        student.setBounds(100,170,70,25);
        teacher.setBounds(180,170,70,25);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Frame frame = (Frame)e.getSource();
                frame.dispose();
            }
        });
        student.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Student");
            }
        });
        teacher.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Teacher");
            }
        });
        this.add(student);
        this.add(teacher);
        this.setSize(400,400);
//        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==register)
            System.out.println("Register");
    }
}
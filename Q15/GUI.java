package Q15;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {
    Frame frame;
    GUI(){
        frame=new Frame("Student Register Form");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                Frame frame = (Frame)e.getSource();
                frame.dispose();
            }
        });
        frame.setLayout(null);
        Label head= new Label("Register a new Student");
        head.setFont(new Font("Sans-serif",Font.BOLD,20));
        head.setBounds(20,50,300,50);
        frame.add(head);
        Label name = new Label("Name: ");
        Label gender = new Label("Gender: ");
        Label mailid = new Label("Mail ID: ");
        Label mobileno = new Label("Mobile No.: ");
        Label password = new Label("Password: ");
        Label repassword = new Label("Re-Password: ");
        Label courses = new Label("Courses: ");
        Label branch = new Label("Branch: ");
        Label semester = new Label("Semester: ");

        name.setBounds(20,110,80,25);
        gender.setBounds(20,140,80,25);
        mailid.setBounds(20,170,80,25);
        mobileno.setBounds(20,200,80,25);
        password.setBounds(20,230,80,25);
        repassword.setBounds(20,260,80,25);
        courses.setBounds(20,290,80,25);
        branch.setBounds(20,320,80,25);
        semester.setBounds(20,350,80,25);

        frame.add(name);
        frame.add(gender);
        frame.add(mailid);
        frame.add(mobileno);
        frame.add(password);
        frame.add(repassword);
        frame.add(courses);
        frame.add(branch);
        frame.add(semester);

        TextField nameText =new TextField("");
        TextField mailidText= new TextField();
        TextField mobilenoText= new TextField();
        TextField passwordText = new TextField();
        TextField repasswordText=new TextField();
        passwordText.setEchoChar('*');
        repasswordText.setEchoChar('*');
        nameText.setBounds(110,110,80,25);
        CheckboxGroup genderop = new CheckboxGroup();
        Checkbox male =new Checkbox("Male",genderop,false);
        Checkbox female = new Checkbox("female",genderop,false);
        male.setBounds(110,140,80,25);
        female.setBounds(200,140,80,25);
        mailidText.setBounds(110,170,80,25);
        mobilenoText.setBounds(110,200,80,25);
        passwordText.setBounds(110,230,80,25);
        repasswordText.setBounds(110,260,80,25);
//        coursesText.setBounds(20,290,80,25);
//        branchText.setBounds(20,320,80,25);
//        semesterText.setBounds(20,350,80,25);

        Choice courseop = new Choice();
        courseop.add("BE/B-TECH");
        courseop.add("ME/M-TECH");
        courseop.setBounds(110,290,80,25);

        Choice branchop = new Choice();
        branchop.add("Computer Engineering");
        branchop.add("Information Technology");
        branchop.add("AI&DS");
        branchop.setBounds(110,320,150,25);

        Choice semesterop = new Choice();
        semesterop.add("Sem-1");
        semesterop.add("Sem-2");
        semesterop.add("Sem-3");
        semesterop.add("Sem-4");
        semesterop.add("Sem-5");
        semesterop.add("Sem-6");
        semesterop.add("Sem-7");
        semesterop.add("Sem-8");
        semesterop.setBounds(110,350,70,25);
        frame.add(nameText);
        frame.add(male);
        frame.add(female);
        frame.add(mailidText);
        frame.add(mobilenoText);
        frame.add(passwordText);
        frame.add(repasswordText);
//        frame.add(coursesText);
//        frame.add(branchText);
//        frame.add(semesterText);

        frame.add(courseop);
        frame.add(branchop);
        frame.add(semesterop);
        Button register = new Button("Register");
        register.setBounds(150,400,100,40);
        frame.add(register);

        frame.setSize(400,450);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }
}

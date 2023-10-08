import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwing implements ActionListener {
    JFrame window;

    JButton button;

    JavaSwing(){
        window=new JFrame();
        window.setLayout(null);
        window.setVisible(true);
        window.setSize(500,500);
        window.getContentPane().setBackground(Color.blue);

        button=new JButton("AccioJob");
        button.setSize(100,50);

        button.addActionListener(this);

        button.setLocation(200,225);
        window.add(button);
    }

    public static void main(String[] args) {
        JavaSwing obj=new JavaSwing();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        window.getContentPane().setBackground(Color.black);
    }
}

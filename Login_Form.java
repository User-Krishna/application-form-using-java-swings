import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class LoginMain extends JFrame implements ActionListener {
    Container c;
    JLabel l1,l2;
    JTextField user;
    JPasswordField pass;
    JButton btn;
    LoginMain(){
        setTitle("Login Form");
        setSize(800,400);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ///First create the container
        c=this.getContentPane();
        c.setLayout(null);

        //Create label
        l1=new JLabel("Username");
        l2=new JLabel("Password");
        l1.setBounds(10,10,120,20);
        l2.setBounds(10,60,120,20);
        c.add(l1);
        c.add(l2);

        //create text field
        user=new JTextField();
        user.setBounds(110,10,120,20);
        c.add(user);

        //create password field
        pass=new JPasswordField();
        pass.setBounds(110,60,120,20);
        c.add(pass);

        //create button
        btn=new JButton("Login");
        btn.setBounds(40,100,100,30);
        Cursor cr=new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cr);
        c.add(btn);

        //calling add ActionListener
        btn.addActionListener(this);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("User Name:"+user.getText());
        System.out.println("Password:"+pass.getText());
    }
}

public class Login_Form {
    public static void main(String [] args){
        LoginMain f=new LoginMain();
    }
}

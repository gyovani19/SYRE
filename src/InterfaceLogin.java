import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceLogin extends JFrame {
    private JPanel panelLogin;
    private JTextField login;
    private JButton loginButton;
    private JPasswordField passwordField1;


    public InterfaceLogin() {
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(loginButton, login.getText() + " entrou");
            }
        });
    }



    public static void main(String[]args){
        InterfaceLogin L = new InterfaceLogin();
        L.setContentPane(L.panelLogin);
        L.setTitle("Login");
        L.setSize(800, 800);
        L.setVisible(true);
        L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}


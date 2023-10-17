import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceReserva extends JFrame {
    private JTextField textField1;
    private JTextField professor;
    private JButton reservarButton;
    private JPanel reservaPanel;
    private JLabel codigo;

    public InterfaceReserva() {
        reservarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(reservarButton, professor.getText() + " reservou o lab");
            }
        });
    }

    public static void main(String[] args) {
        InterfaceReserva L = new InterfaceReserva();
        L.setContentPane(L.reservaPanel);
        L.setTitle("Login");
        L.setSize(800, 800);
        L.setVisible(true);
        L.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

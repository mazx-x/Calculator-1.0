import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SettingsMenu extends JDialog {
    private JPanel mainPanel;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel oKCancelPanel;
    private JPanel settingsPanel;
    private JPanel buttonPanel;

    public SettingsMenu() {
        setContentPane(mainPanel);
        setModal(true);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(buttonOK);
        setMinimumSize(new Dimension(200,200));

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });
    }

    private void onOK() {
        // add your code here
        JOptionPane.showMessageDialog(mainPanel,"Yo it worked");
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        mainPanel =new JPanel();
        buttonOK =new JButton();
        buttonCancel =new JButton();
        oKCancelPanel =new JPanel();
        settingsPanel =new JPanel();
        buttonPanel =new JPanel();

    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DodajDzien extends JDialog {
    private Projekt frame;
    private JPanel panel1;
    private JTextField textField1;
    private JButton dodajButton;
    private JComboBox FormularzComboBox;

    public JComboBox getFormularzComboBox() {
        return FormularzComboBox;
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public DodajDzien(Projekt e) {
        frame = e;
        setContentPane(panel1);
        pack();

        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                e.dodajDzienFormularz(FormularzComboBox.getSelectedItem().toString(),textField1.getText());
            }
        });
    }
}

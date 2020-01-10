import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jedzenie extends JDialog {
    private JPanel panel1;
    private JTextField nazwa ;
    private JTextField porcja;
    private JTextField kcal;
    private JTextField białko;
    private JTextField wegle;
    private JTextField tluszcze;
    private JButton dodajButton;
    private JButton anulujButton;
    private Projekt frame;

    public JTextField getNazwa() {
        return nazwa;
    }

    public JTextField getPorcja() {
        return porcja;
    }

    public JTextField getKcal() {
        return kcal;
    }

    public JTextField getBiałko() {
        return białko;
    }

    public JTextField getWegle() {
        return wegle;
    }

    public JTextField getTluszcze() {
        return tluszcze;
    }

    public Jedzenie(Projekt e) {
        frame = e;
        setContentPane(panel1);
        pack();
        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (e.getFlaga()==1){
               try {
                   e.sniadanie(nazwa.getText(), Double.parseDouble(kcal.getText()), Double.parseDouble(porcja.getText()), Double.parseDouble(białko.getText()), Double.parseDouble(wegle.getText()), Double.parseDouble(tluszcze.getText()));
               }
               catch (NumberFormatException e) {
                   if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                   {
                       System.out.println("Aby dodac posiłek musisz go najpierw wprowadzić");
                   }
                   else
                   {
                       System.out.println("Podane wartości muszą być liczbami!!!");
                   }
               }
               }
                if(e.getFlaga()==2)
                {
                    try {
                        e.drugieSniadanie(nazwa.getText(), Double.parseDouble(kcal.getText()), Double.parseDouble(porcja.getText()), Double.parseDouble(białko.getText()), Double.parseDouble(wegle.getText()), Double.parseDouble(tluszcze.getText()));
                    }
                    catch (NumberFormatException e) {
                        if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                        {
                            System.out.println("Aby dodac posiłek musisz go najpierw wprowadzić");
                        }
                        else
                        {
                            System.out.println("Podane wartości muszą być liczbami!!!");
                        }
                    }
                }
                if(e.getFlaga()==3)
                {
                    try {
                        e.obiad(nazwa.getText(), Double.parseDouble(kcal.getText()), Double.parseDouble(porcja.getText()), Double.parseDouble(białko.getText()), Double.parseDouble(wegle.getText()), Double.parseDouble(tluszcze.getText()));
                    }
                    catch (NumberFormatException e) {
                        if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                        {
                            System.out.println("Aby dodac posiłek musisz go najpierw wprowadzić");
                        }
                        else
                        {
                            System.out.println("Podane wartości muszą być liczbami!!!");
                        }
                    }
                }
                if(e.getFlaga()==4)
                {
                    try {
                        e.przekaska(nazwa.getText(), Double.parseDouble(kcal.getText()), Double.parseDouble(porcja.getText()), Double.parseDouble(białko.getText()), Double.parseDouble(wegle.getText()), Double.parseDouble(tluszcze.getText()));
                    }
                    catch (NumberFormatException e) {
                        if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                        {
                            System.out.println("Aby dodac posiłek musisz go najpierw wprowadzić");
                        }
                        else
                        {
                            System.out.println("Podane wartości muszą być liczbami!!!");
                        }
                    }
                }
                if(e.getFlaga()==5)
                {
                    try {
                        e.kolacja(nazwa.getText(), Double.parseDouble(kcal.getText()), Double.parseDouble(porcja.getText()), Double.parseDouble(białko.getText()), Double.parseDouble(wegle.getText()), Double.parseDouble(tluszcze.getText()));
                    }
                    catch (NumberFormatException e) {
                        if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                        {
                            System.out.println("Aby dodac posiłek musisz go najpierw wprowadzić");
                        }
                        else
                        {
                            System.out.println("Podane wartości muszą być liczbami!!!");
                        }
                    }
                }


            }
        });
        anulujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
            }
        });
    }
}

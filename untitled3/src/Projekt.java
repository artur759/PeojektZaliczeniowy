
import java.util.Date;
import javax.swing.*;
import java.awt.event.*;

public class Projekt extends JDialog {
    private JTextField nazwaDnia;
    private JTextField dataDzien;
    private JButton dodajNowyDzieńButton;
    private JComboBox dzienComboBox;
    private JTextField dodajPosilekKcal;
    private JTextField dodajPosielPorcja;
    private JTextField dodajPosilekBialko;
    private JTextField dodajPosilekWeglowodany;
    private JTextField dodajPosilekTluszcze;
    private JTextField dodajPosilekNazwa;
    private JTextField kcalSniadanie;
    private JTextField bialkoSniadanie;
    private JTextField weglowodanySniadanie;
    private JTextField tluszczeSniadanie;

    private JTextField kaloriePosumowanie;
    private JTextField bialkoPodsumowanie;
    private JTextField weglowodanyPodsumowanie;
    private JTextField tluszcePodsumowanie;
    private JComboBox plecParametryComboBox;
    private JTextField wagaParametry;
    private JTextField obwodTaliParametry;
    private JTextField obwodBioderParametry;
    private JComboBox aktywnoscParametryComboBox;
    private JTextField wiekParametry;
    private JButton policzZapotrzebowanieKcal;
    private JTextField zapotrzebowanieKcalWyniki;
    private JButton policzBMI;
    private JTextField bmiWyniki;
   // private JTextField bmiKomentarz;
    private JButton policzWHR;
    private JTextField whrWyniki;
   // private JTextField whrKomentarz;
    private JButton policzBMR;
    private JTextField bmrWyniki;
    private JTextField celCel;
    private JComboBox celWartosc;
    private JTextField noweKcalCel;
    private JTextField czasRealizacjiCel;
    private JButton policzCel;
   // private JTextField menuDrugie;
    private JTextField tluszczeDrugie;
    private JTextField weglowodanyDrugie;
    private JTextField bialkoDrugie;
    private JTextField kcalDrugie;
    private JTextField kcalObiad;
    private JTextField bialkoObiad;
    private JTextField weglowodanyObiad;
    private JTextField tluszceObiad;
   // private JTextField menuObiad;
    private JTextField kcalPrzekaska;
    private JTextField bialkoPrzekaska;
    private JTextField weglowodanyPrzekaska;
    private JTextField tluszczePrzekaska;
   // private JTextField menuPrzekaska;
   // private JTextField menuKolacja;
    private JTextField tluszceKolacja;
    private JTextField weglowodanyKolacja;
    private JTextField bialkoKolacja;
    private JTextField kcalKolacja;
    private JPanel Główny;
    private JComboBox menuComboBox;
    private JButton dodajSniadanie;
    private JButton dodajDrugie;
    private JButton dodajObiad;
    private JButton dodajPrzekaska;
    private JButton dodajKolacja;
    private JTextField wzrostParametry;
    private JPanel parametryPanel;
    private JPanel wzkaznikiPanel;
    private JPanel celPanel;
    private JTextArea menuSniadanie;
    private JTextArea menuKolacja;
    private JTextArea menuPrzekaska;
    private JTextArea menuDrugie;
    private JTextArea menuObiad;
    private JButton usunButton;

    private static int licznik = 1;
    private static Dzien w;
    Dzien y [] = new Dzien[9999];
    private  Porcja sniad;
    private Porcja drugieSniad;
    private Porcja obiadek;
    private Porcja przek;
    private Porcja kol;
    Cel c = new Cel();
    Parametry parametr = new Parametry();
    private double flaga;

    public double getFlaga() {
        return flaga;
    }
    public void dodajDzien(String a, String b)
    {
        y[licznik] = new Dzien(a,b);
    }
    public void  sniadanie(String nazwa, Double kcal, Double porcja, Double bialko, Double tluszcze, Double wegle)
    {

            Posilek pos = w.zjedz(nazwa,kcal,porcja,bialko,tluszcze,wegle);
            bialkoSniadanie.setText(Double.toString(sniad.podliczBialko(pos)));
            kcalSniadanie.setText(Double.toString(sniad.podliczKcal(pos)));
            tluszczeSniadanie.setText(Double.toString(sniad.podliczTluszcze(pos)));
            weglowodanySniadanie.setText(Double.toString(sniad.podliczWegle(pos)));
            menuSniadanie.setText(sniad.dodajMenu(pos));
            odswiez();

    }
    public void drugieSniadanie(String nazwa, Double kcal, Double porcja, Double bialko, Double tluszcze, Double wegle)
    {
        Posilek pos = w.zjedz(nazwa,kcal,porcja,bialko,tluszcze,wegle);
        bialkoDrugie.setText(Double.toString(drugieSniad.podliczBialko(pos)));
        kcalDrugie.setText(Double.toString(drugieSniad.podliczKcal(pos)));
        tluszczeDrugie.setText(Double.toString(drugieSniad.podliczTluszcze(pos)));
        weglowodanyDrugie.setText(Double.toString(drugieSniad.podliczWegle(pos)));
        menuDrugie.setText(drugieSniad.dodajMenu(pos));
        odswiez();
    }
    public void obiad(String nazwa, Double kcal, Double porcja, Double bialko, Double tluszcze, Double wegle)
    {
        Posilek pos = w.zjedz(nazwa,kcal,porcja,bialko,tluszcze,wegle);
        bialkoObiad.setText(Double.toString(obiadek.podliczBialko(pos)));
        kcalObiad.setText(Double.toString(obiadek.podliczKcal(pos)));
        tluszceObiad.setText(Double.toString(obiadek.podliczTluszcze(pos)));
        weglowodanyObiad.setText(Double.toString(obiadek.podliczWegle(pos)));
        menuObiad.setText(obiadek.dodajMenu(pos));
        odswiez();
    }
    public void przekaska(String nazwa, Double kcal, Double porcja, Double bialko, Double tluszcze, Double wegle)
    {
        Posilek pos = w.zjedz(nazwa,kcal,porcja,bialko,tluszcze,wegle);
        bialkoPrzekaska.setText(Double.toString(przek.podliczBialko(pos)));
        kcalPrzekaska.setText(Double.toString(przek.podliczKcal(pos)));
        tluszczePrzekaska.setText(Double.toString(przek.podliczTluszcze(pos)));
        weglowodanyPrzekaska.setText(Double.toString(przek.podliczWegle(pos)));
        menuPrzekaska.setText(przek.dodajMenu(pos));
        odswiez();
    }
    public void kolacja(String nazwa, Double kcal, Double porcja, Double bialko, Double tluszcze, Double wegle)
    {
        Posilek pos = w.zjedz(nazwa,kcal,porcja,bialko,tluszcze,wegle);
        bialkoKolacja.setText(Double.toString(kol.podliczBialko(pos)));
        kcalKolacja.setText(Double.toString(kol.podliczKcal(pos)));
        tluszceKolacja.setText(Double.toString(kol.podliczTluszcze(pos)));
        weglowodanyKolacja.setText(Double.toString(kol.podliczWegle(pos)));
        menuKolacja.setText(kol.dodajMenu(pos));
        odswiez();
    }
    public void sprawdz()
    {

        for(int i =0; i<licznik;i++) {
            if (dzienComboBox.getSelectedItem().equals(y[i].getNazwa()))
                w = y[i];
        }
        sniad = w.getSniad();
        drugieSniad=w.getDrugieSniad();
        obiadek=w.getObiadek();
        kol = w.getKol();
        przek= w.getPrzek();

    }
    public void ustaw()
    {
        nazwaDnia.setText(w.getNazwa());
        dataDzien.setText(w.getData());
    }
    public void dodajDzienFormularz(String a, String b)
    {
        try {
            dodajDzien(a,b);
            dzienComboBox.addItem(y[licznik].getNazwa());
            licznik += 1;
        }
        catch (NumberFormatException e) {
            if (e.toString().equals("java.lang.NumberFormatException: empty String"))
            {
                System.out.println("Aby dodac dzień musisz go najpierw wprowadzić");
            }
            else
            {
                System.out.println("Podane wartości muszą datą!");
            }
        }
    }
    public void odswiez()
    {
        kaloriePosumowanie.setText(Double.toString(w.getKcalDzien()));
        bialkoPodsumowanie.setText(Double.toString(w.getBialkoDzien()));
        tluszcePodsumowanie.setText(Double.toString(w.getTluszczeDzien()));
        weglowodanyPodsumowanie.setText(Double.toString(w.getWeglowodanyDzien()));
    }
    public Projekt() {

        menuDrugie.setVisible(false);
        menuObiad.setVisible(false);
        menuPrzekaska.setVisible(false);
        menuKolacja.setVisible(false);
        celPanel.setVisible(false);
        wzkaznikiPanel.setVisible(false);

        y[0] = new Dzien("poniedzialek","31.11.2001");
        sprawdz();
        timer.start();
        dodajNowyDzieńButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                  DodajDzien n123 = new DodajDzien(Projekt.this);
                n123.pack();
                n123.setVisible(true);
            }
        });
        dodajSniadanie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                flaga = 1;
                Jedzenie n123 = new Jedzenie(Projekt.this);
                n123.pack();
                n123.setVisible(true);
            }
        });
        dodajDrugie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                flaga = 2;
                Jedzenie n123 = new Jedzenie(Projekt.this);
                n123.pack();
                n123.setVisible(true);
            }
        });
        dodajObiad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                flaga = 3;
                Jedzenie n123 = new Jedzenie(Projekt.this);
                n123.pack();
                n123.setVisible(true);
            }
        });
        dodajPrzekaska.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                flaga = 4;
                Jedzenie n123 = new Jedzenie(Projekt.this);
                n123.pack();
                n123.setVisible(true);
                }
        });
        dodajKolacja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                flaga = 5;
                Jedzenie n123 = new Jedzenie(Projekt.this);
                n123.pack();
                n123.setVisible(true);
            }
        });
        policzZapotrzebowanieKcal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try{
                Double a = parametr.bmr(plecParametryComboBox.getSelectedItem().toString(),Double.parseDouble(wiekParametry.getText()),Double.parseDouble(wzrostParametry.getText()),Double.parseDouble(wagaParametry.getText()));
                zapotrzebowanieKcalWyniki.setText(Double.toString(parametr.całkowiteZapotrzebowanieKcal((aktywnoscParametryComboBox.getItemAt(aktywnoscParametryComboBox.getSelectedIndex()).toString()),a)));
                }
                catch (NumberFormatException e) {
                    if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                    {
                        System.out.println("Aby policzyć zapotrzebowanie kaloryczne muszisz podać  płeć, wiek, wzrost i wagę !!!");
                    }
                    else
                    {
                        System.out.println("Podane wartości muszą być liczbami!!!");
                    }
                }

            }
        });
        policzBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {

                    bmiWyniki.setText(Double.toString(parametr.bmi(Double.parseDouble(wagaParametry.getText()), Double.parseDouble(wzrostParametry.getText()))));
                  //  bmiKomentarz.setText(parametr.komentarzBMI(parametr.bmi(Double.parseDouble(wagaParametry.getText()), Double.parseDouble(wzrostParametry.getText()))));
                }
                catch (NumberFormatException e) {
                    if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                    {
                        System.out.println("Aby policzyć BMI musisz podać wzrost i wagę !!!");
                    }
                    else
                    {
                        System.out.println("Podane wartości muszą być liczbami!!!");
                    }
                }
            }
        });
        policzWHR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    Double a = parametr.whr(Double.parseDouble(obwodTaliParametry.getText()), Double.parseDouble(obwodBioderParametry.getText()));
                    whrWyniki.setText(Double.toString(a));
                  //  whrKomentarz.setText(parametr.komentarzWHR(plecParametryComboBox.getSelectedItem().toString(), a));
                }
                catch (NumberFormatException e) {
                    if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                    {
                        System.out.println("Aby policzyć WHR muszisz podać obwód tali i bioder !!!");
                    }
                    else
                        {
                            System.out.println("Podane wartości muszą być liczbami!!!");
                        }
               }
            }
        });
        policzBMR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try{

                    bmrWyniki.setText(Double.toString(parametr.bmr(plecParametryComboBox.getSelectedItem().toString(), Double.parseDouble(wiekParametry.getText()), Double.parseDouble(wzrostParametry.getText()), Double.parseDouble(wagaParametry.getText()))));
                }
                catch (NumberFormatException e) {
                    if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                    {
                        System.out.println("Aby policzyć BMR muszisz podać  płeć, wiek, wzrost i wagę !!!");
                    }
                    else
                    {
                        System.out.println("Podane wartości muszą być liczbami!!!");
                    }
                }
            }
        });
        policzCel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try{
                    Double a = parametr.bmr(plecParametryComboBox.getSelectedItem().toString(),Double.parseDouble(wiekParametry.getText()),Double.parseDouble(wzrostParametry.getText()),Double.parseDouble(wagaParametry.getText()));
                   parametr.całkowiteZapotrzebowanieKcal((aktywnoscParametryComboBox.getItemAt(aktywnoscParametryComboBox.getSelectedIndex()).toString()),a);
                   parametr.setWaga(Double.parseDouble(wagaParametry.getText()));
                   noweKcalCel.setText(Double.toString(c.zmienMase(parametr,celWartosc.getSelectedIndex(),Double.parseDouble(celCel.getText()))));
                   czasRealizacjiCel.setText(Double.toString(c.czas(parametr,Double.parseDouble(celCel.getText()),celWartosc.getSelectedIndex())));
            }
                catch (NumberFormatException e) {
                    if (e.toString().equals("java.lang.NumberFormatException: empty String"))
                    {
                        System.out.println("Aby policzyć nowe zapotrzebowanie kaloryczne i czas realizacji celu musisz podać aktualną wagę, swój cel oraz dobrać tygodniowe tempo zminay masy");
                    }
                    else
                    {
                        System.out.println("Podane wartości muszą być liczbami!!!");
                    }
                }
            }
        });

        dzienComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sprawdz();
                kcalSniadanie.setText(Double.toString(sniad.getKcalPorc()));
                bialkoSniadanie.setText(Double.toString(sniad.getBialkoPorcja()));;
                tluszczeSniadanie.setText(Double.toString(sniad.getTluszczePorcja()));
                weglowodanySniadanie.setText(Double.toString(sniad.getWeglowodanyPorcja()));
                menuSniadanie.setText(sniad.getMenu());
                kcalDrugie.setText(Double.toString(drugieSniad.getKcalPorc()));
                bialkoDrugie.setText(Double.toString(drugieSniad.getBialkoPorcja()));;
                tluszczeDrugie.setText(Double.toString(drugieSniad.getTluszczePorcja()));
                weglowodanyDrugie.setText(Double.toString(drugieSniad.getWeglowodanyPorcja()));
                menuDrugie.setText(drugieSniad.getMenu());
                kcalObiad.setText(Double.toString(obiadek.getKcalPorc()));
                bialkoObiad.setText(Double.toString(obiadek.getBialkoPorcja()));;
                tluszceObiad.setText(Double.toString(obiadek.getTluszczePorcja()));
                weglowodanyObiad.setText(Double.toString(obiadek.getWeglowodanyPorcja()));
                menuObiad.setText(obiadek.getMenu());
                kcalPrzekaska.setText(Double.toString(przek.getKcalPorc()));
                bialkoPrzekaska.setText(Double.toString(przek.getBialkoPorcja()));;
                tluszczePrzekaska.setText(Double.toString(przek.getTluszczePorcja()));
                weglowodanyPrzekaska.setText(Double.toString(przek.getWeglowodanyPorcja()));
                menuPrzekaska.setText(przek.getMenu());
                kcalKolacja.setText(Double.toString(kol.getKcalPorc()));
                bialkoKolacja.setText(Double.toString(kol.getBialkoPorcja()));;
                tluszceKolacja.setText(Double.toString(kol.getTluszczePorcja()));
                weglowodanyKolacja.setText(Double.toString(kol.getWeglowodanyPorcja()));
                menuKolacja.setText(kol.getMenu());
                odswiez();
            }
        });
        menuComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (menuComboBox.getSelectedItem().toString().equals("Podaj parametry"))
                {
                    parametryPanel.setVisible(true);
                    celPanel.setVisible(false);
                    wzkaznikiPanel.setVisible(false);
                }
                if (menuComboBox.getSelectedItem().toString().equals("Ustaw cel"))
                {
                    parametryPanel.setVisible(false);
                    celPanel.setPreferredSize(parametryPanel.getPreferredSize());
                    celPanel.setVisible(true);
                    wzkaznikiPanel.setVisible(false);
                }
                if (menuComboBox.getSelectedItem().toString().equals("Wskazniki"))
                {
                    parametryPanel.setVisible(false);
                    celPanel.setVisible(false);
                    wzkaznikiPanel.setVisible(true);
                }
            }
        });


        usunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(dzienComboBox.getItemCount()>1)
                dzienComboBox.removeItemAt(dzienComboBox.getSelectedIndex());
            }
        });

        dodajSniadanie.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                menuSniadanie.setVisible(true);
                menuKolacja.setVisible(false);
                menuObiad.setVisible(false);
                menuDrugie.setVisible(false);
                menuPrzekaska.setVisible(false);
            }
        });
        dodajDrugie.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                menuSniadanie.setVisible(false);
                menuKolacja.setVisible(false);
                menuObiad.setVisible(false);
                menuDrugie.setVisible(true);
                menuPrzekaska.setVisible(false);
            }
        });
        dodajObiad.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                menuSniadanie.setVisible(false);
                menuKolacja.setVisible(false);
                menuObiad.setVisible(true);
                menuDrugie.setVisible(false);
                menuPrzekaska.setVisible(false);
            }
        });
        dodajPrzekaska.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseEntered(e);
                menuSniadanie.setVisible(false);
                menuKolacja.setVisible(false);
                menuObiad.setVisible(false);
                menuDrugie.setVisible(false);
                menuPrzekaska.setVisible(true);}
        });
        dodajKolacja.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                menuSniadanie.setVisible(false);
                menuKolacja.setVisible(true);
                menuObiad.setVisible(false);
                menuDrugie.setVisible(false);
                menuPrzekaska.setVisible(false);
            }
        });


    }
    Timer timer = new Timer (100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            ustaw();
        }

    });
    public static void main(String[] args) {
        JFrame frame = new JFrame("Projekt");
        frame.setContentPane(new Projekt().Główny);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class InterfazProcesamiento extends JPanel {
    private JMenuBar jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JLabel jcomp6;
    private JLabel jcomp7;
    private JLabel jcomp8;
    private JLabel jcomp9;
    private JLabel jcomp10;
    private JLabel jcomp11;
    private JLabel jcomp12;
    private JLabel jcomp13;
    private JLabel jcomp14;
    private JLabel jcomp15;
    private JLabel jcomp16;
    private JLabel jcomp17;
    private JLabel jcomp18;

    public InterfazProcesamiento() {
        //construct preComponents
        JMenu informaciónMenu = new JMenu ("INFORMACIÓN");
        JMenuItem option_1Item = new JMenuItem ("Option 1");
        informaciónMenu.add (option_1Item);
        JMenuItem option_2Item = new JMenuItem ("Option 2");
        informaciónMenu.add (option_2Item);
        JMenu inicioMenu = new JMenu ("INICIO");
        JMenuItem option_1Item1 = new JMenuItem ("Option 1");
        inicioMenu.add (option_1Item1);
        JMenuItem option_2Item2 = new JMenuItem ("Option 2");
        inicioMenu.add (option_2Item2);
        JMenu registroMenu = new JMenu ("REGISTRO");
        JMenuItem option_1Item3 = new JMenuItem ("Option 1");
        registroMenu.add (option_1Item3);
        JMenuItem option_2Item4 = new JMenuItem ("Option 2");
        registroMenu.add (option_2Item4);
        JMenu usuarioMenu = new JMenu ("USUARIO");
        JMenuItem option_1Item5 = new JMenuItem ("Option 1");
        usuarioMenu.add (option_1Item5);
        JMenuItem option_2Item6 = new JMenuItem ("Option 2");
        usuarioMenu.add (option_2Item6);

        //construct components
        jcomp1 = new JMenuBar();
        jcomp1.add (informaciónMenu);
        jcomp1.add (inicioMenu);
        jcomp1.add (registroMenu);
        jcomp1.add (usuarioMenu);
        jcomp2 = new JLabel ("Reciplanet");
        jcomp3 = new JLabel ("SU PERFIL FUE CREADO CORRECTAMENTE");
        jcomp4 = new JLabel ("calculando zona con mas riesgo ambiental");
        jcomp5 = new JLabel ("porfavor espere un momento...");
        jcomp6 = new JLabel ("usted se encuentra ubicado en medellin:");
        jcomp7 = new JLabel ("zonas con mayor impacto ambiental:");
        jcomp8 = new JLabel ("2. Laureles");
        jcomp9 = new JLabel ("3. La Estrella");
        jcomp10 = new JLabel ("4. El Poblado");
        jcomp11 = new JLabel ("1. Envigado");
        jcomp12 = new JLabel ("Calculando su huella de carbono...");
        jcomp13 = new JLabel ("En su registro usted digito exitosamente 2.000 kg ");
        jcomp14 = new JLabel ("Residuos = 2 toneladas");
        jcomp15 = new JLabel ("Factor de emision = 0.7 toneladas de C02");
        jcomp16 = new JLabel ("HUELLA DE CARBONO");
        jcomp17 = new JLabel ("1.4 TONELADAS DE CO2");
        jcomp18 = new JLabel ("Su huella de carbono Afecta el medio ambiente");

        //adjust size and set layout
        setPreferredSize (new Dimension (749, 332));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);
        add (jcomp15);
        add (jcomp16);
        add (jcomp17);
        add (jcomp18);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (30, 15, 560, 40);
        jcomp2.setBounds (625, 25, 100, 25);
        jcomp3.setBounds (225, 70, 260, 30);
        jcomp4.setBounds (50, 110, 340, 25);
        jcomp5.setBounds (50, 125, 245, 25);
        jcomp6.setBounds (60, 150, 235, 30);
        jcomp7.setBounds (80, 180, 220, 30);
        jcomp8.setBounds (80, 235, 100, 25);
        jcomp9.setBounds (80, 260, 100, 25);
        jcomp10.setBounds (80, 285, 100, 25);
        jcomp11.setBounds (80, 210, 100, 25);
        jcomp12.setBounds (405, 110, 215, 25);
        jcomp13.setBounds (405, 130, 340, 25);
        jcomp14.setBounds (405, 185, 320, 30);
        jcomp15.setBounds (405, 210, 245, 25);
        jcomp16.setBounds (405, 245, 160, 25);
        jcomp17.setBounds (445, 270, 165, 25);
        jcomp18.setBounds (475, 300, 280, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new InterfazProcesamiento());
        frame.pack();
        frame.setVisible (true);
    }
}


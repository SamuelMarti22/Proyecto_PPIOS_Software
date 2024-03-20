import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class InterfazEntrada extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JLabel jcomp5;
    private JLabel jcomp6;
    private JTextField jcomp7;
    private JTextField jcomp8;
    private JLabel jcomp9;
    private JTextField jcomp10;
    private JLabel jcomp11;
    private JTextField jcomp12;
    private JLabel jcomp13;
    private JTextField jcomp14;
    private JButton jcomp15;
    private JLabel jcomp16;
    private JButton jcomp17;
    private JButton jcomp18;
    private JButton jcomp19;
    private JButton jcomp20;
    private JLabel jcomp21;
    private JMenuBar jcomp22;
    private JLabel jcomp23;
    private JTextField jcomp24;
    private JLabel jcomp25;
    private JLabel jcomp26;
    private JTextField jcomp27;
    private JLabel jcomp28;
    private JTextField jcomp29;

    public InterfazEntrada() {
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
        jcomp1 = new JLabel ("Ingrese su correo:");
        jcomp2 = new JLabel ("contraseña:");
        jcomp3 = new JLabel ("Ingrese su nombre:");
        jcomp4 = new JTextField (5);
        jcomp5 = new JLabel ("Bienvenido a reciplanet");
        jcomp6 = new JLabel ("Registrarse");
        jcomp7 = new JTextField (5);
        jcomp8 = new JTextField (5);
        jcomp9 = new JLabel ("barrio:");
        jcomp10 = new JTextField (5);
        jcomp11 = new JLabel ("Con cuantas personas vive:");
        jcomp12 = new JTextField (5);
        jcomp13 = new JLabel ("Ingrese denuncias sobre puntos criticos de la ciudad");
        jcomp14 = new JTextField (5);
        jcomp15 = new JButton ("Enviar");
        jcomp16 = new JLabel ("Califica esta aplicacion");
        jcomp17 = new JButton ("1-3");
        jcomp18 = new JButton ("6-9");
        jcomp19 = new JButton ("3-6");
        jcomp20 = new JButton ("10");
        jcomp21 = new JLabel ("Kg de desechos preparados:");
        jcomp22 = new JMenuBar();
        jcomp22.add (informaciónMenu);
        jcomp22.add (inicioMenu);
        jcomp22.add (registroMenu);
        jcomp22.add (usuarioMenu);
        jcomp23 = new JLabel ("reciplanet");
        jcomp24 = new JTextField (5);
        jcomp25 = new JLabel ("Cuantos Kg de desecho fueron dispuestos de manera ");
        jcomp26 = new JLabel ("correcta:");
        jcomp27 = new JTextField (5);
        jcomp28 = new JLabel ("Añadir noticia o Informacion:");
        jcomp29 = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension (696, 481));
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
        add (jcomp19);
        add (jcomp20);
        add (jcomp21);
        add (jcomp22);
        add (jcomp23);
        add (jcomp24);
        add (jcomp25);
        add (jcomp26);
        add (jcomp27);
        add (jcomp28);
        add (jcomp29);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (75, 110, 120, 30);
        jcomp2.setBounds (75, 175, 100, 25);
        jcomp3.setBounds (75, 140, 120, 30);
        jcomp4.setBounds (190, 115, 100, 25);
        jcomp5.setBounds (20, 50, 155, 30);
        jcomp6.setBounds (65, 85, 100, 25);
        jcomp7.setBounds (190, 145, 100, 25);
        jcomp8.setBounds (150, 175, 100, 25);
        jcomp9.setBounds (75, 205, 100, 25);
        jcomp10.setBounds (115, 205, 100, 25);
        jcomp11.setBounds (75, 235, 255, 25);
        jcomp12.setBounds (235, 235, 100, 25);
        jcomp13.setBounds (20, 290, 320, 40);
        jcomp14.setBounds (20, 330, 300, 85);
        jcomp15.setBounds (220, 425, 100, 30);
        jcomp16.setBounds (510, 420, 220, 25);
        jcomp17.setBounds (460, 445, 55, 35);
        jcomp18.setBounds (580, 445, 55, 35);
        jcomp19.setBounds (520, 445, 55, 35);
        jcomp20.setBounds (640, 445, 55, 35);
        jcomp21.setBounds (365, 80, 205, 25);
        jcomp22.setBounds (20, 10, 565, 35);
        jcomp23.setBounds (605, 15, 100, 25);
        jcomp24.setBounds (365, 110, 325, 25);
        jcomp25.setBounds (365, 150, 320, 25);
        jcomp26.setBounds (365, 165, 100, 25);
        jcomp27.setBounds (365, 190, 325, 25);
        jcomp28.setBounds (365, 245, 185, 30);
        jcomp29.setBounds (365, 285, 320, 125);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new InterfazEntrada());
        frame.pack();
        frame.setVisible (true);
    }
}



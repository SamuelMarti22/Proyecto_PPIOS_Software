import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class InterfazSalida extends JPanel {
    private JMenuBar jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JLabel jcomp4;
    private JRadioButton jcomp5;
    private JLabel jcomp6;
    private JLabel jcomp7;
    private JRadioButton jcomp8;
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
    private JLabel jcomp19;
    private JLabel jcomp20;
    private JTextField jcomp21;
    private JSlider jcomp22;
    private JLabel jcomp23;
    private JLabel jcomp24;
    private JLabel jcomp25;
    private JLabel jcomp26;
    private JLabel jcomp27;
    private JRadioButton jcomp28;
    private JLabel jcomp29;
    private JRadioButton jcomp30;
    private JLabel jcomp31;
    private JLabel jcomp32;
    private JLabel jcomp33;
    private JLabel jcomp34;
    private JRadioButton jcomp35;
    private JLabel jcomp36;
    private JLabel jcomp37;
    private JButton jcomp38;
    private JButton jcomp39;
    private JButton jcomp40;
    private JButton jcomp41;

    public InterfazSalida() {
        //construct preComponents
        JMenu informacionMenu = new JMenu ("INFORMACION");
        JMenuItem option_1Item = new JMenuItem ("Option 1");
        informacionMenu.add (option_1Item);
        JMenuItem option_2Item = new JMenuItem ("Option 2");
        informacionMenu.add (option_2Item);
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
        jcomp1.add (informacionMenu);
        jcomp1.add (inicioMenu);
        jcomp1.add (registroMenu);
        jcomp1.add (usuarioMenu);
        jcomp2 = new JLabel ("Reciplanet");
        jcomp3 = new JLabel ("Informacion sobre riesgo ambiental en zonas cercanas:");
        jcomp4 = new JLabel ("Cerca de su vivienda Por el sector del estadio hay ");
        jcomp5 = new JRadioButton ("");
        jcomp6 = new JLabel ("una acumulacion de residuos que afectan a la ");
        jcomp7 = new JLabel ("poblacion de este sector. ");
        jcomp8 = new JRadioButton ("");
        jcomp9 = new JLabel ("Debido a que los camiones de basura no se ");
        jcomp10 = new JLabel ("encuentran en funcionamiento debido a ");
        jcomp11 = new JLabel ("fallas mecanicas hay una acumulacion");
        jcomp12 = new JLabel ("considerable de desechos.");
        jcomp13 = new JLabel ("ZONAS CON MALOS HABITOS");
        jcomp14 = new JLabel ("La frontera");
        jcomp15 = new JLabel ("Estadio");
        jcomp16 = new JLabel ("Los colores");
        jcomp17 = new JLabel ("Alto de palmas");
        jcomp18 = new JLabel ("Itagui");
        jcomp19 = new JLabel ("provenza");
        jcomp20 = new JLabel ("Vote por mas zonas:");
        jcomp21 = new JTextField (5);
        jcomp22 = new JSlider (0, 100);
        jcomp23 = new JLabel ("Meta de tu zona (Comuna 13)");
        jcomp24 = new JLabel ("Disposicion y preparacion de tus basuras domesticas");
        jcomp25 = new JLabel ("La primera recomendacion sera diferenciar los tipos de basura que desecharas, si son papel ");
        jcomp26 = new JLabel ("o carton, vidrio, plastico, metal y residuos organicos, cada una de estos tipos de basura tienen");
        jcomp27 = new JLabel ("");
        jcomp28 = new JRadioButton ("");
        jcomp29 = new JLabel ("su lugar.");
        jcomp30 = new JRadioButton ("");
        jcomp31 = new JLabel ("La segunda recomendacion sera utilizar diferentes canecas de colores para distinguir el tipo");
        jcomp32 = new JLabel ("de basura que se desea desechar, segun la informacion personal le recomendamos realizar");
        jcomp33 = new JLabel ("esta preparacion para darle mejor trato a tus basuras.");
        jcomp34 = new JLabel ("RECOLECCION DE BASURAS EN TU ZONA");
        jcomp35 = new JRadioButton ("");
        jcomp36 = new JLabel ("TODOS LOS DIAS A LAS 7 AM EN SECTOR PARQUE - CANECAS GRANDES");
        jcomp37 = new JLabel ("PORFAVOR CALIFICA ESTA APLICACION");
        jcomp38 = new JButton ("1-3");
        jcomp39 = new JButton ("10");
        jcomp40 = new JButton ("6-9");
        jcomp41 = new JButton ("3-6");

        //set components properties
        jcomp22.setOrientation (JSlider.HORIZONTAL);
        jcomp22.setMinorTickSpacing (1);
        jcomp22.setMajorTickSpacing (5);
        jcomp22.setPaintTicks (true);
        jcomp22.setPaintLabels (true);

        //adjust size and set layout
        setPreferredSize (new Dimension (978, 554));
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
        add (jcomp30);
        add (jcomp31);
        add (jcomp32);
        add (jcomp33);
        add (jcomp34);
        add (jcomp35);
        add (jcomp36);
        add (jcomp37);
        add (jcomp38);
        add (jcomp39);
        add (jcomp40);
        add (jcomp41);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (25, 15, 745, 55);
        jcomp2.setBounds (835, 30, 100, 25);
        jcomp3.setBounds (25, 95, 360, 35);
        jcomp4.setBounds (40, 135, 300, 25);
        jcomp5.setBounds (20, 135, 20, 25);
        jcomp6.setBounds (40, 150, 305, 30);
        jcomp7.setBounds (40, 175, 285, 20);
        jcomp8.setBounds (20, 225, 20, 25);
        jcomp9.setBounds (40, 225, 275, 25);
        jcomp10.setBounds (40, 240, 260, 30);
        jcomp11.setBounds (40, 260, 245, 30);
        jcomp12.setBounds (40, 280, 230, 25);
        jcomp13.setBounds (25, 350, 225, 25);
        jcomp14.setBounds (25, 385, 95, 30);
        jcomp15.setBounds (25, 420, 100, 25);
        jcomp16.setBounds (105, 390, 100, 25);
        jcomp17.setBounds (105, 420, 100, 25);
        jcomp18.setBounds (25, 455, 100, 25);
        jcomp19.setBounds (105, 455, 100, 25);
        jcomp20.setBounds (25, 490, 205, 25);
        jcomp21.setBounds (25, 515, 100, 25);
        jcomp22.setBounds (390, 130, 565, 60);
        jcomp23.setBounds (595, 95, 270, 25);
        jcomp24.setBounds (395, 205, 575, 30);
        jcomp25.setBounds (405, 245, 580, 25);
        jcomp26.setBounds (405, 265, 535, 25);
        jcomp27.setBounds (630, 245, 195, 25);
        jcomp28.setBounds (385, 245, 20, 25);
        jcomp29.setBounds (405, 285, 100, 25);
        jcomp30.setBounds (390, 335, 20, 25);
        jcomp31.setBounds (410, 335, 530, 25);
        jcomp32.setBounds (410, 355, 530, 25);
        jcomp33.setBounds (410, 375, 525, 25);
        jcomp34.setBounds (400, 420, 260, 25);
        jcomp35.setBounds (400, 460, 20, 25);
        jcomp36.setBounds (425, 460, 420, 25);
        jcomp37.setBounds (695, 485, 235, 30);
        jcomp38.setBounds (680, 510, 60, 35);
        jcomp39.setBounds (900, 510, 60, 35);
        jcomp40.setBounds (825, 510, 65, 35);
        jcomp41.setBounds (755, 510, 60, 35);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new InterfazSalida());
        frame.pack();
        frame.setVisible (true);
    }
}


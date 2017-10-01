package TerGrafico;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.JThermometer;
import org.jfree.data.general.DefaultValueDataset;

/**
 * * A demonstration application for the thermometer plot. * Un demostracion
 * para la aplicacion de un termometro * * @author Bryan Scott * @mofify by
 * Darwin Betancourt Castillo
 */

public class ThermometerDemo1 extends JPanel implements ActionListener {

    /**
     * Options for the value label position combo box.
     */
    protected static final String[] OPTIONS = {"Nenhuma", "Direita", "Esquerda", "Centro"};
    /**
     * Panel 1.
     */
    private JPanel jPanel1 = new JPanel();
    /**
     * Borderlayout 3.
     */
    private BorderLayout borderLayout3 = new BorderLayout();
    /**
     * Panel 2.
     */
    private JPanel jPanel2 = new JPanel();
    /**
     * Decrement button for thermometer ?.
     */
    private JButton btnDown = new JButton();
    /**
     * Increment button for thermometer ?.
     */
    private JButton btnUp = new JButton();
    /**
     * Grid layout 1.
     */
    private GridLayout gridLayout1 = new GridLayout();
    /**
     * Thermometer 2.
     */
    private JThermometer thermo2 = new JThermometer();

    public JThermometer getThermo2() {
        return thermo2;
    }

    public void setThermo2(JThermometer thermo2) {
        this.thermo2 = thermo2;
    }
    /**
     * Borderlayout 1.
     */
    private BorderLayout borderLayout1 = new BorderLayout();
    /**
     * Panel 3.
     */
    private JPanel jPanel3 = new JPanel();
    /**
     * Grid layout 3.
     */
    private GridLayout gridLayout3 = new GridLayout();
    /**
     * Combo box 2 for value label position.
     */
    private JComboBox pickShow2 = new JComboBox(OPTIONS);
    /**
     * Borderlayout 4.
     */
    private BorderLayout borderLayout4 = new BorderLayout();

    /**
     * * Default constructor.
     */

    public ThermometerDemo1() {
        try {
            jbInit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * * Controla los eventos de los botones
     *
     * @param e ActionEvent
     */

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();
            if (boton.getName().matches("btnUp")) {
                setValue(1);
            }
            if (boton.getName().matches("btnDown")) {
                setValue(-1);
            }
        }
    }

    /**
     * * Initialises the class. * * @throws Exception for any exception.
     */
    void jbInit() throws Exception {
        thermo2.setValue(0);
        thermo2.setOutlinePaint(null);
        thermo2.setUnits(0);
        thermo2.setForeground(Color.blue);
        thermo2.setBackground(Color.white);
// Se establece el rango de 0 a 100 thermo2.setRange(0.0,100.0);
// El numero inicial representa el color (Solo hay tres colores y el color por defecto gris)
// 0 = verde, 1=anaranjado 2=rojo
        thermo2.setSubrangeInfo(2, 80.0, 100.0, 22.0, 40.0);
        thermo2.setSubrangeInfo(1, 50.0, 80.0, 18.0, 26.0);
        thermo2.setSubrangeInfo(0, 0.0, 50.0, 0.0, 100.0);
        thermo2.addSubtitle("Controle Temperatura", new Font("SansSerif", Font.PLAIN, 16));
// Se establece el formato del valor del grafico
//thermo2.setValueFormat(new DecimalFormat("#0.0"));
        thermo2.setValueFormat(new DecimalFormat("#0"));
// Layout para el JPanel principal setLayout(gridLayout1);
        jPanel1.setLayout(borderLayout3);
        btnDown.setText("Diminuir");
        btnDown.setName("btnDown");
        btnDown.addActionListener(this);
        btnUp.setText("Subir");
        btnUp.setName("btnUp");
        btnUp.addActionListener(this);
        pickShow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setShowValue();
            }
        });
        jPanel3.setLayout(gridLayout3);
        jPanel3.add(pickShow2, null);
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
// Contenedor de los botones del panel 4
        jPanel2.add(btnDown, null);
        jPanel2.add(btnUp, null);
        jPanel1.add(jPanel3, BorderLayout.NORTH);
// Se agrega el thermometro al panel
        jPanel1.add(thermo2, BorderLayout.CENTER); // Contenedor del panel 4
        jPanel1.add(jPanel2, BorderLayout.SOUTH);
        // Se agrega el panel del nivel 
        add(jPanel1, null); 
    }
        
    /*
    public static void main(String[] args) {
        final ThermometerDemo1 panel = new ThermometerDemo1();
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new BorderLayout(5, 5));
        frame.setDefaultCloseOperation(3);
        frame.setTitle("Temperatura");
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setSize(400, 400);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
        frame.setVisible(true);
    }
    */

    /**
     * * Sets the value of the thermometer. * * @param value Valor del nivel del
     * termometro
     */
    private void setValue(double value) {
        try {
            thermo2.setValue(thermo2.getValue().doubleValue() + value);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * * Sets the value label position for one of the thermometers.
     */
    private void setShowValue() {
        thermo2.setValueLocation(pickShow2.getSelectedIndex());
    }
    
    
}

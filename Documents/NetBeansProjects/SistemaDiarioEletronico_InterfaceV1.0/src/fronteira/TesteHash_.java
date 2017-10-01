package fronteira;

import static fronteira.TelaRelatorioDeFaltas.toTableModel;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class TesteHash_ extends javax.swing.JFrame {

    
    public TesteHash_() {
        //initComponents();
         ArrayList<String> lista = new ArrayList();
        final HashMap<String,ArrayList<String>> st=new HashMap<String,ArrayList<String>>(); 
        //HashMap<String, ArrayList<String>> faltas = new HashMap<String,ArrayList<String>>();
        lista.add("10/10/2015"+"\n");
        lista.add("11/10/2015"+"\n");
        lista.add("11/10/2015"+"\n");
        lista.add("11/10/2015"+"\n");
        lista.add("11/10/2015"+"\n");
        lista.add("11/10/2015"+"\n");
        lista.add("11/10/2015"+"\n");
        lista.add("11/10/2015"+"\n");
        lista.add("11/10/2015"+"\n");
        lista.add("11/10/2015"+"\n");
        String data="Gerferson";
        st.put(data, lista);
        String d="mario";
         st.put(d, lista);
         String u="rodrigues";
         st.put(u, lista);
         String z="claudio";
         st.put(z, lista);
       //JTable jTable1 =new JTable(toTableModel(st));
        JTable jT = new JTable (toTableModel(st));
        JPanel p=new JPanel();
        
        p.add(jT);
        JButton a=new JButton();
        
        JFrame f=new JFrame(); 
        f.add(p); 
        f.add(jT);
        f.setSize(200,200);
        //f.setDefaultCloseOperation( EXIT_ON_CLOSE );  
        f.pack(); 
        f.setVisible(true);
        
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteHash_();
               
                
            }
        });
    }
     public static TableModel toTableModel(HashMap<?,?> map) { 
         String[] columnNames = {"       Nomes", "        Datas"}; 
        DefaultTableModel model = new DefaultTableModel( columnNames,0 ); 
        model.addRow(columnNames);
        for (HashMap.Entry<?,?> entry : map.entrySet()) { 
            
            model.addRow(new Object[] {entry.getKey(), entry.getValue() }); 
        } 
        return model; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

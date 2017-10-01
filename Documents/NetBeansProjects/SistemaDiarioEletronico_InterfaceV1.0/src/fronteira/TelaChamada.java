
package fronteira;
 import java.awt.*;  
import java.awt.event.*;  
import java.util.*;  
import javax.swing.*;  
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.*;
public class TelaChamada extends javax.swing.JFrame {

    int i=0;
    JButton btn;
    public TelaChamada() {
        //initComponents(); 
        String[] columnNames = {"Nomes", "11/11/2015","11/12/2015"};  
        Object[][] data =  
        {  
            {"gerferson" , "Faltou", "Faltou"},  
            {"fernanda", "Faltou", "Faltou"},  
            {"rodrigo", "Faltou", "Faltou"},  
            {"lucas", "Faltou", "Faltou"}  
        };  
   
        DefaultTableModel model = new DefaultTableModel(data, columnNames);  
        JTable table = new JTable( model )  
        {  
              
            public Class getColumnClass(int column)  
            {  
                return getValueAt(0, column).getClass();  
            }  
        };  
   
        JScrollPane scrollPane = new JScrollPane( table );  
        getContentPane().add( scrollPane );  
   
        //  Create button column  
        for(int i=1;i<3;i++){
        TelaChamada.ButtonColumn buttonColumn = new TelaChamada.ButtonColumn(table, i);
        }
       
        btn = new JButton("Enviar");
        add(btn, "South");
       
    }  
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Chamada"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        
         TelaChamada frame = new TelaChamada();  
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );  
        frame.pack();  
        frame.setVisible(true);  
            
        
    }
class ButtonColumn extends AbstractCellEditor  
        implements TableCellRenderer, TableCellEditor, ActionListener  
    {  
        JTable table;  
        JButton renderButton;  
        JButton editButton;  
        String text;  
   
        public ButtonColumn(JTable table, int column)  
        {  
            super();  
            this.table = table;  
            renderButton = new JButton();  
   
            editButton = new JButton();  
            editButton.setFocusPainted( false );
            editButton.addActionListener(this );  
   
            TableColumnModel columnModel = table.getColumnModel();  
            columnModel.getColumn(column).setCellRenderer( this );  
            columnModel.getColumn(column).setCellEditor( this );  
        }  
   
        public Component getTableCellRendererComponent(  
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)  
        {  
            if (hasFocus)  
            {  
                renderButton.setForeground(table.getForeground());  
                renderButton.setText("");  
            }  
            else if (isSelected)  
            {  
                renderButton.setForeground(table.getSelectionForeground());  
                 renderButton.setBackground(table.getSelectionBackground());  
            }  
            else  
            {  
                renderButton.setForeground(table.getForeground());  
                renderButton.setText("") ;  
            }  
   
            renderButton.setText( (value == null) ? "" : value.toString() );  
            return renderButton;  
            
        }  
   
        public Component getTableCellEditorComponent(  
            JTable table, Object value, boolean isSelected, int row, int column)  
        {
            //text = (value == null) ? "" : value.toString();  
            //editButton.setText("Faltou");  
            //editButton.setFocusPainted( true );
            return editButton;  
        }  
   
        public Object getCellEditorValue()  
        {  
                   
                return "Presença";       
        }  
        
        
   
        public void actionPerformed(ActionEvent e)  
        {  
            fireEditingStopped();   
            System.out.println( e.getActionCommand() + " : " + table.getSelectedRow());  
        }  
        
       
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
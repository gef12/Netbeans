package Fronteira;

import javax.swing.*;  
import java.awt.*;  
import javax.swing.table.*;
import java.awt.event.*;  
public class TesteMouseSelecionar extends JFrame{
   private int linhaMouse = -1;
   private JTable tabela;
   public TesteMouseSelecionar(){  
     super("Exemplo de uma tabela simples");  
     String[] colunas = {"Cidade", "Estado", "Habitantes"};  
     Object[][] conteudo = {  
         {"Goiânia", "GO", "43.023.432"},  
         {"São Paulo", "SP", "5.343.234"},  
         {"Rio de Janeiro", "RJ", "6.434.212"},  
         {"Jussara", "GO", "87.454"},  
         {"Barra do Garças", "MT", "64.344"}  
     };
     tabela = new JTable(conteudo, colunas);  
     tabela.setPreferredScrollableViewportSize(new Dimension(350, 100));
     //listener para detectar o movimento do mouse
     ListenerTabela lt = new ListenerTabela();
     tabela.addMouseMotionListener(lt);
     this.addMouseMotionListener(lt);
     //renderer para desenhar a tabela       
     RendererMouse rm = new RendererMouse();
     tabela.getColumn("Cidade").setCellRenderer(rm);  
     tabela.getColumn("Estado").setCellRenderer(rm);  
     tabela.getColumn("Habitantes").setCellRenderer(rm);  
     Container c = getContentPane();  
     c.setLayout(new FlowLayout());  
     JScrollPane scrollPane = new JScrollPane(tabela);  
     c.add(scrollPane);  
     setSize(400, 300);  
     setVisible(true);  
   }  
   public static void main(String args[]){  
     TesteMouseSelecionar app = new TesteMouseSelecionar();  
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
   }  
   //este listener detecta o movimento do mouse e armazena a linha
   class ListenerTabela extends MouseMotionAdapter
   {
      public void mouseMoved(MouseEvent e)
      {
         if(e.getSource() == tabela){
            linhaMouse = tabela.rowAtPoint(e.getPoint());
         }else{
            linhaMouse = -1;    //linha -1 significa que o mouse está fora da tabela
         }
         tabela.repaint();
      }
   }
   class RendererMouse implements TableCellRenderer{  
      public Component getTableCellRendererComponent(       
         JTable table,       
         Object value,       
         boolean isSelected,       
         boolean hasFocus,       
         int row,       
         int column)       
     {       
         Component result = table.getTableHeader().getDefaultRenderer().getTableCellRendererComponent(       
             table,       
             value,       
             isSelected,       
             hasFocus,       
             row,       
             column       
         );       
         if(isSelected){ 
             result.setForeground(Color.white);       
             result.setBackground(Color.blue);
         //linha em que o mouse passou
         } else if(row == linhaMouse) {
             result.setForeground(Color.black);       
             result.setBackground(Color.orange);       
         } else {     
             result.setForeground(Color.black);       
             result.setBackground(Color.white);     
         }     
         return result;       
      }    
   }  
}
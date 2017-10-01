/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import entidade.Aluno;
import entidade.Aula;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Cláudio G
 */
public class TelaRelatorioDeFaltasAluno extends javax.swing.JFrame {
   
    JPanel painelFundo;
    JTable tabela;
    JScrollPane barraRolagem; 
    
    public TelaRelatorioDeFaltasAluno() {
        //initComponents();
        //super ("Relatorio de Faltas");
        /*
        Diario d =new Diario();
        Aluno a=new Aluno( "nome","email", "nomeUsuario",  "senha", " matricula");
       
        
        Horario horario = new Horario(1, 30);
        Local local=new Local("nome", "descricao");
         TipoAula t=null;
       Date dat = null;
         
        
        
        Aula aula=new Aula("descricao", 10, dat, t, horario,  local);
        d.inserirFalta(a, aula);
        System.out.println(d.toString());
        */
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Realtorio  de Faltas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    public void criaJanela(){
         ArrayList<String> lista = new ArrayList();
        final HashMap<Aluno ,ArrayList<String>> st=new HashMap(); 
        HashMap<Aluno, ArrayList<Aula>> faltas = new HashMap();
        Aluno aluno = new Aluno("Gerferson", "gerferson@ufv.br", "gerferson", "1234", "EF01763");
       // Date data = new Date("1");
        //Aula aula = new Aula("aula", "1", data, "1", "2", "3", "4"); instanciar aula 
        lista.add("Ger");
        //String data="EF01763";
        st.put(aluno, lista);
        //painelFundo = new JPanel();
        //painelFundo.setLayout(new GridLayout(1, 1));
        //tabela = new JTable(toTableModel(st));
        //barraRolagem = new JScrollPane(tabela);
        //painelFundo.add(barraRolagem); 
        
        //getContentPane().add(painelFundo);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(500, 120);
        //setVisible(true);
       
        tabela =new JTable(toTableModel(st)); 
        JPanel p=new JPanel();
        p.add(tabela); 
        JFrame f=new JFrame(); 
        f.add(p); 
        f.setSize(200,200);
         f.pack();
        f.setVisible(true); 
       
        //f.setDefaultCloseOperation( EXIT_ON_CLOSE );  
        

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
    
    public static void main(String[] args) {
        TelaRelatorioDeFaltasAluno telaDiario = new TelaRelatorioDeFaltasAluno();
        telaDiario.criaJanela();
    }
    
    private javax.swing.JTable tab;
    }


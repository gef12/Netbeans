package entidade;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;

/**
 * @author Aislan
 */
public class Aula implements Serializable{
    private String descricao;
    private int duracaoEmMinutos; 
    private Date data;
    private Horario horario;
    private Local local;
    private TipoAula tipo;
    private final DateFormat formataData = DateFormat.getDateInstance(); //formatar a data para sair no padrão brasileiro DD/MM/AAAA
    
    
    public Aula(String descricao, int duracaoEmMinutos, Date data, TipoAula tipo, Horario horario, Local local){
        this.descricao = descricao;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.data = data;
        this.tipo = tipo;
        this.horario = horario;
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Date getData() {
        
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public TipoAula getTipo() {
        return tipo;
    }

    public void setTipo(TipoAula tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return " ------ AULA ------ \n" + 
                "Descrição=> " + descricao + "  Duração=> " + duracaoEmMinutos +"min " + "  Tipo=> " + tipo + "   Data=> " + 
                formataData.format(data) + "   " + horario + "\n" + local +"\n";
    }
    
}
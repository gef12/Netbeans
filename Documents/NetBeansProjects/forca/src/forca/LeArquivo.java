package forca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeArquivo {
	
	private Scanner input;
	
	//m�todo para abrir o arquivo
	//par�metro - nome do arquivo a ser lido
	public void openFile (String arquivo) throws FileNotFoundException {
		try {
			input = new Scanner (new File ("C:\\Users\\Gerferson\\Documents\\NetBeansProjects\\forca\\arquivos\\NIVEL4.TXT"));
		}
		catch (FileNotFoundException erro){
			throw new FileNotFoundException ("ARQUIVO NaO ENCONTRADO");
		}
	}
	
	//m�todo que l� o arquivo e armazena as inform��es no registro
	public VetorPalavraImagem readFile () throws Exception {
		PalavraImagem reg; 
		VetorPalavraImagem vetor;
		String linha;
		int tam;
		try {
			linha = input.nextLine();
			tam = Integer.parseInt(linha);
			vetor = new VetorPalavraImagem (tam);
			while (input.hasNext()) {
				linha = input.nextLine();
				try{
					reg = new PalavraImagem(linha);
				}
				catch (Exception erro){
					throw new Exception ("LINHA DO ARQUIVO NãO CONTéM TODOS OS COMPONENTES");
				}
				vetor.insereVetor(reg);
			}
			input.close();
			return vetor;
		}
		catch (NoSuchElementException erro){
			throw new NoSuchElementException ("ARQUIVO VAZIO");
		}
		catch (IllegalStateException erro){
			throw new IllegalStateException ("ERRO AO LER O ARQUIVO");
		}
		catch (ArrayIndexOutOfBoundsException erro){
			throw new ArrayIndexOutOfBoundsException ("VETOR MENOR QUE N�MERO DE ELEMENTOS DO ARQUIVO");
		}
		
	}
	
	//m�todo para fechar o arquivo
	public void closeFile () {
		if (input != null) {
			input.close ();
		}
	}
}

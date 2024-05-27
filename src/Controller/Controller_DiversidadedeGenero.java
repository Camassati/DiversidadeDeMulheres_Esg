package Controller;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Controller_DiversidadedeGenero {
	private JPanel panel;
	private JTextField textNome;
	private JTextField textCargo;
	private String nome;
	private String cargo;
	
	public String getNome(){
		return this.nome;
	}
	public String setNome(String nome) 
	{
		this.nome = nome;
		return this.nome;
	}
	
	public String getCargo(){
		return this.cargo;
	}
	public String setCargo(String cargo) 
	{
		this.cargo = cargo;
		return this.cargo;
	}
	
	public void identificacao() {
		
		JLabel lblNewLabel = new JLabel("QUANTIDADE FUNCIONARIOS:");
       
	}
}

package Model;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Model_DiversidadedeGenero {

	 	protected JFrame frmApsCcp;
	    private JPanel panel; 
	    private JRadioButton mulher;
	    private JRadioButton mPLBaixa;//Mulheres em posição de liderança primeiro nivel
	    private JRadioButton mPLALTA; // Mulheres em poisção de liderança alta gestão
	    private JRadioButton mPL;// Mulheres em posição de liderança
	    private JRadioButton meta; // Meta de Mulheres na áreas
	    private JRadioButton mC; // Mulheres em todas as carreira
	    private JRadioButton mPLGdR; // Mulheres em posição de liderança geração de receita
	    private JRadioButton equidadeSalarial; 

	    private final ButtonGroup buttonGroup = new ButtonGroup();
	    private JTextField text1;

	    public void validation(boolean v ){
	    	if(v == true) {
	    		frmApsCcp.setVisible(true);
	    	}
	    	else {
	    		System.out.println("Deu errado");
	    	}
	    }
	    
	    public Model_DiversidadedeGenero() 
	    {
	    	launcher();
	    }

	    /**
	     * Initialize the contents of the frame.
	     */
	    private void launcher() {
	        this.frmApsCcp = new JFrame();
	      
	        frmApsCcp.setResizable(false);
	        frmApsCcp.setAlwaysOnTop(false);
	        frmApsCcp.getContentPane().setMaximumSize(new Dimension(2000, 1800));
	        frmApsCcp.setMaximumSize(new Dimension(1800, 1200));
	        frmApsCcp.setForeground(new Color(0, 0, 0));
	        frmApsCcp.setTitle("APS CC3P07");
	        frmApsCcp.getContentPane().setBackground(new Color(102, 153, 51));
	        frmApsCcp.setBounds(100, 100, 951, 642);
	        frmApsCcp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	                JButton btnNewButton = new JButton("EXIBIR GRAFICO");
	                btnNewButton.setBackground(new Color(204, 204, 153));
	                btnNewButton.setBounds(652, 547, 227, 23);
	                btnNewButton.addActionListener(new ActionListener() {
	                	
	                 
	                	
	                	public void actionPerformed(java.awt.event.ActionEvent evt) {
	                		 

	                        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	                        /**
	                         * IF PARA OS RADIOBUTTONS SELECIONADOS APARECEREM NA TABELA.
	                         */
	                        	if(mulher.isSelected()) {
						JOptionPane.showMessageDialog(null,"Exibindo: dados em % de mulheres");
						
						 /**
					     * INSERINDO VALORES NA TABELA.
					     */
					

	                        dataset.setValue(16,  "", "2015");
	                        dataset.setValue(16,  "", "2016");   
	                        dataset.setValue(16,  "", "2017");
	                        dataset.setValue(16,  "", "2018");
	                        dataset.setValue(16,  "", "2019");
	                        dataset.setValue(17,  "", "2020");
	                        dataset.setValue(17,  "", "2021");
	                        dataset.setValue(17,  "", "2022");
	                        dataset.setValue(17,  "A", "META");
	                        
	                        
	                        /**
	                         * c=CRIANDO TIPO DE TABELA, TÍTULO, TÍTULO LATERAL ETC.
	                         */
	                        JFreeChart chart = ChartFactory.createBarChart("DIVERSIDADE DE GÊNERO", "% DE MULHERES", "valor em %", dataset, PlotOrientation.VERTICAL, false, false, false);
	                        CategoryPlot catPlot = chart.getCategoryPlot();
	                        catPlot.setRangeGridlinePaint(Color.BLACK);

	                    
	                        /**
	                         * INSERINDO TABELA NO PAINEL.
	                         */
	                        ChartPanel chartPanel = new ChartPanel(chart);
	                        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
	                        

	                        panel.removeAll();
	                        panel.setLayout(new BorderLayout(0, 0));
	                        panel.add(chartPanel, BorderLayout.CENTER);
	                        panel.validate();
	                        
	                        
	                        
	                       
	                    } else if(mPLBaixa.isSelected()) {
	                    	
					JOptionPane.showMessageDialog(null,"Exibindo: % de Mulheres em Posição de Liderança ");
					
					dataset.setValue(18,  "", "2015");
	                dataset.setValue(17,  "", "2016");
	                dataset.setValue(18,  "", "2017");
	                dataset.setValue(18,  "", "2018");
	                dataset.setValue(19,  "", "2019");
	                dataset.setValue(20,  "", "2020");
	                dataset.setValue(20,  "", "2021");
	                dataset.setValue(20,  "", "2022");
	                dataset.setValue(20,  "A", "META");

	                JFreeChart chart = ChartFactory.createBarChart("DIVERSIDADE DE GÊNERO", "% de Mulheres em Posição de Liderança ", "valor em %", dataset, PlotOrientation.VERTICAL, false, false, false);
	                CategoryPlot catPlot = chart.getCategoryPlot();
	                catPlot.setRangeGridlinePaint(Color.BLACK);
	       

	                ChartPanel chartPanel = new ChartPanel(chart);
	                chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

	                panel.removeAll();
	                panel.setLayout(new BorderLayout(0, 0));
	                panel.add(chartPanel, BorderLayout.CENTER);
	                panel.validate();
	                    	
	                
	                
	                    }else if(equidadeSalarial.isSelected()) {
	                    	
					JOptionPane.showMessageDialog(null," Exibindo: % de Mulheres em Posição de Liderança - primeiro nível de gestão5\r\n"
							);
					
					dataset.setValue(0,  "", "2015");
	                dataset.setValue(0,  "", "2016");
	                dataset.setValue(0,  "", "2017");
	                dataset.setValue(0,  "", "2018");
	                dataset.setValue(0,  "", "2019");
	                dataset.setValue(19,  "", "2020");
	                dataset.setValue(20,  "", "2021");
	                dataset.setValue(20,  "", "2022");
	                dataset.setValue(20,  "A", "META");

	                JFreeChart chart = ChartFactory.createBarChart("DIVERSIDADE DE GÊNERO", "% de Mulheres em Posição de Liderança - primeiro nível de gestão5\r\n"
	                		+ " ", "valor em %", dataset, PlotOrientation.VERTICAL, false, false, false);
	                CategoryPlot catPlot = chart.getCategoryPlot();
	                catPlot.setRangeGridlinePaint(Color.BLACK);
	    

	                ChartPanel chartPanel = new ChartPanel(chart);
	                chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

	                panel.removeAll();
	                panel.setLayout(new BorderLayout(0, 0));
	                panel.add(chartPanel, BorderLayout.CENTER);
	                panel.validate();
	                    	
	                
	                
	                    }else if(mPLGdR.isSelected()) {
	                    	
					JOptionPane.showMessageDialog(null,"Exibindo: % de Mulheres em Posição de Liderança - alta gestão6\r\n"
							);
					
					dataset.setValue(0,  "", "2015");
	                dataset.setValue(0,  "", "2016");
	                dataset.setValue(0,  "", "2017");
	                dataset.setValue(0,  "", "2018");
	                dataset.setValue(22,  "", "2019");
	                dataset.setValue(17,  "", "2020");
	                dataset.setValue(28,  "", "2021");
	                dataset.setValue(21,  "", "2022");
	                dataset.setValue(28,  "A", "META");

	                JFreeChart chart = ChartFactory.createBarChart("DIVERSIDADE DE GÊNERO", "% de Mulheres em Posição de Liderança - alta gestão6\r\n"
	                		+ " ", "valor em %", dataset, PlotOrientation.VERTICAL, false, false, false);
	                CategoryPlot catPlot = chart.getCategoryPlot();
	                catPlot.setRangeGridlinePaint(Color.BLACK);


	                ChartPanel chartPanel = new ChartPanel(chart);
	                chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

	                panel.removeAll();
	                panel.setLayout(new BorderLayout(0, 0));
	                panel.add(chartPanel, BorderLayout.CENTER);
	                panel.validate();
	                    	
	                
	                
	                    }else if(mC.isSelected()) {
	                    	
					JOptionPane.showMessageDialog(null,"Exibindo: % de mulheres em posição de liderança - relacionada à geração de receita7\r\n"
							);
					
					dataset.setValue(0,  "", "2015");
	                dataset.setValue(0,  "", "2016");
	                dataset.setValue(0,  "", "2017");
	                dataset.setValue(0,  "", "2018");
	                dataset.setValue(5,  "", "2019");
	                dataset.setValue(13,  "", "2020");
	                dataset.setValue(13,  "", "2021");
	                dataset.setValue(15,  "", "2022");
	                dataset.setValue(13,  "A", "META");

	                JFreeChart chart = ChartFactory.createBarChart("DIVERSIDADE DE GÊNERO", "% de mulheres em posição de liderança - relacionada à geração de receita7\r\n"
	                		+ " ", "valor em %", dataset, PlotOrientation.VERTICAL, false, false, false);
	                CategoryPlot catPlot = chart.getCategoryPlot();
	                catPlot.setRangeGridlinePaint(Color.BLACK);


	                ChartPanel chartPanel = new ChartPanel(chart);
	                chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

	                panel.removeAll();
	                panel.setLayout(new BorderLayout(0, 0));
	                panel.add(chartPanel, BorderLayout.CENTER);
	                panel.validate();
	                    	
	                    }else if(mPL.isSelected()) {
	                    	
					JOptionPane.showMessageDialog(null,"Exibindo: % de mulheres na carreira STEM8\r\n"
							);
					
					dataset.setValue(0,  "", "2015");
	                dataset.setValue(0,  "", "2016");
	                dataset.setValue(11,  "", "2017");
	                dataset.setValue(11,  "", "2018");
	                dataset.setValue(11,  "", "2019");
	                dataset.setValue(12,  "", "2020");
	                dataset.setValue(12,  "", "2021");
	                dataset.setValue(12,  "", "2022");
	                dataset.setValue(12,  "A", "META");

	                JFreeChart chart = ChartFactory.createBarChart("DIVERSIDADE DE GÊNERO", "% de mulheres na carreira STEM8\r\n"
	                		+ " ", "valor em %", dataset, PlotOrientation.VERTICAL, false, false, false);
	                CategoryPlot catPlot = chart.getCategoryPlot();
	                catPlot.setRangeGridlinePaint(Color.BLACK);


	                ChartPanel chartPanel = new ChartPanel(chart);
	                chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

	                panel.removeAll();
	                panel.setLayout(new BorderLayout(0, 0));
	                panel.add(chartPanel, BorderLayout.CENTER);
	                panel.validate();
	                    	
	                    }else if(meta.isSelected()) {
	                    	
					JOptionPane.showMessageDialog(null,"Exibindo: Equidade Salarial - razão entre remuneração de mulheres e homens"
							);
					
					dataset.setValue(0,  "", "2015");
	                dataset.setValue(0.92,  "", "2016");
	                dataset.setValue(0.93,  "", "2017");
	                dataset.setValue(0.91,  "", "2018");
	                dataset.setValue(0.92,  "", "2019");
	                dataset.setValue(0.95,  "", "2020");
	                dataset.setValue(0.96,  "", "2021");
	                dataset.setValue(0.97,  "", "2022");

	                JFreeChart chart = ChartFactory.createBarChart("DIVERSIDADE DE GÊNERO"                                                                                                                                                             , "Equidade Salarial - razão entre remuneração de mulheres e homens"
	                		+ " ", "", dataset, PlotOrientation.VERTICAL, false, false, false);
	                CategoryPlot catPlot = chart.getCategoryPlot();
	                catPlot.setRangeGridlinePaint(Color.BLACK);


	                ChartPanel chartPanel = new ChartPanel(chart);
	                chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

	                panel.removeAll();
	                panel.setLayout(new BorderLayout(0, 0));
	                panel.add(chartPanel, BorderLayout.CENTER);
	                panel.validate();
	                    	
	                    }else if(mPLALTA.isSelected()) {
	                   
					JOptionPane.showMessageDialog(null,"META EMPRESA!");
					int s1 = Integer.parseInt(text1.getText());
					dataset.setValue(s1,  "a", "total funcionarios");
					dataset.setValue(s1*0.17,  "", " MULHERES");
	                dataset.setValue(s1*0.2,  "", "MULHERES EM LIDERANÇA");
	              

	                JFreeChart chart = ChartFactory.createBarChart("META PARA SUA EMPRESA!"                                                                                                                                                             , "Equidade Salarial - razão entre remuneração de mulheres e homens"
	                		+ " ", "valor em %", dataset, PlotOrientation.VERTICAL, false, false, false);
	                CategoryPlot catPlot = chart.getCategoryPlot();
	                catPlot.setRangeGridlinePaint(Color.BLACK);


	                ChartPanel chartPanel = new ChartPanel(chart);
	                chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

	                panel.removeAll();
	                panel.setLayout(new BorderLayout(0, 0));
	                panel.add(chartPanel, BorderLayout.CENTER);
	                panel.validate();
	                    	
	                    }else {
	                    	JOptionPane.showMessageDialog(null,"SELECIONE ALGUMA OPÇÃO!!!");
	                    }
	                	}
	                	
	                });
	        

	        panel = new JPanel();
	        panel.setBounds(31, 211, 848, 325);
	        panel.setForeground(Color.CYAN);
	        panel.setBackground(new Color(204, 204, 153));
	        frmApsCcp.getContentPane().setLayout(null);
	        frmApsCcp.getContentPane().add(btnNewButton);
	        frmApsCcp.getContentPane().add(panel);
	        
	        JPanel panel_2 = new JPanel();
	        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	        panel_2.setBackground(new Color(204, 204, 153));
	        panel_2.setBounds(10, 32, 425, 107);
	        frmApsCcp.getContentPane().add(panel_2);
	        panel_2.setLayout(null);
	        
	        mulher = new JRadioButton("% MULHER");
	        mulher.setBounds(8, 5, 85, 23);
	        panel_2.add(mulher);
	        mulher.setFont(new Font("Arial", Font.BOLD, 12));
	        buttonGroup.add(mulher);
	        mulher.setContentAreaFilled(false);
	        
	        mPLBaixa = new JRadioButton("% Mulheres em Posição de Liderança");
	        mPLBaixa.setBounds(8, 85, 231, 21);
	        panel_2.add(mPLBaixa);
	        mPLBaixa.setFont(new Font("Arial", Font.BOLD, 11));
	        buttonGroup.add(mPLBaixa);
	        mPLBaixa.setContentAreaFilled(false);
	        
	        equidadeSalarial = new JRadioButton("% de Mulheres em Posição de Liderança - primeiro nível de gestão5");
	        equidadeSalarial.setBounds(8, 31, 407, 23);
	        panel_2.add(equidadeSalarial);
	        equidadeSalarial.setFont(new Font("Arial", Font.BOLD, 12));
	        buttonGroup.add(equidadeSalarial);
	        equidadeSalarial.setContentAreaFilled(false);
	        
	        mPLGdR = new JRadioButton("% de Mulheres em Posição de Liderança - alta gestão6");
	        mPLGdR.setBounds(8, 59, 335, 23);
	        panel_2.add(mPLGdR);
	        mPLGdR.setFont(new Font("Arial", Font.BOLD, 12));
	        buttonGroup.add(mPLGdR);
	        mPLGdR.setContentAreaFilled(false);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBounds(445, 32, 480, 107);
	        frmApsCcp.getContentPane().add(panel_1);
	        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	        panel_1.setForeground(new Color(0, 0, 0));
	        panel_1.setBackground(new Color(204, 204, 153));
	        panel_1.setLayout(null);
	        
	        mPLALTA = new JRadioButton("META");
	        mPLALTA.setBounds(6, 8, 57, 23);
	        panel_1.add(mPLALTA);
	        mPLALTA.setFont(new Font("Arial", Font.BOLD, 12));
	        buttonGroup.add(mPLALTA);
	        mPLALTA.setContentAreaFilled(false);
	        
	        JLabel lblNewLabel = new JLabel("QUANTIDADE FUNCIONARIOS:");
	        lblNewLabel.setBounds(82, 12, 203, 14);
	        lblNewLabel.setBackground(new Color(0, 0, 0));
	        panel_1.add(lblNewLabel);
	        
	        text1 = new JTextField();
	        text1.addKeyListener(new KeyAdapter() {
	        	@Override
	        	

	            /**
	             * TRATATIVA DE DADOS PARA TEXTBOX ACEITAR APENAS VALORES INT.
	             */
	        	public void keyTyped(KeyEvent e) {
	        		String caracteres = "0123456789";
	        		if(!caracteres.contains(e.getKeyChar()+ "")) {
	        			e.consume();        		}
	        	}
	        });
	        text1.setBounds(270, 9, 86, 20);
	        panel_1.add(text1);
	        text1.setColumns(10);
	        
	        mPL = new JRadioButton("% de mulheres na carreira STEM8");
	        mPL.setBounds(6, 34, 217, 23);
	        panel_1.add(mPL);
	        mPL.setFont(new Font("Arial", Font.BOLD, 12));
	        buttonGroup.add(mPL);
	        mPL.setContentAreaFilled(false);
	        mPL.setBackground(new Color(255, 255, 255));
	        
	        mC = new JRadioButton("% de mulheres em posição de liderança - relacionada à geração de receita7");
	        mC.setBounds(6, 60, 455, 23);
	        panel_1.add(mC);
	        mC.setFont(new Font("Arial", Font.BOLD, 12));
	        buttonGroup.add(mC);
	        mC.setContentAreaFilled(false);
	        
	        meta = new JRadioButton("Equidade Salarial - razão entre remuneração de mulheres e homens ");
	        meta.setBounds(6, 86, 415, 23);
	        panel_1.add(meta);
	        meta.setFont(new Font("Arial", Font.BOLD, 12));
	        buttonGroup.add(meta);
	        meta.setContentAreaFilled(false);
	    }
}

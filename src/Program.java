import java.awt.EventQueue;

import Model.Model_DiversidadedeGenero;



public class Program {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Model_DiversidadedeGenero window = new Model_DiversidadedeGenero();
                	window.validation(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}

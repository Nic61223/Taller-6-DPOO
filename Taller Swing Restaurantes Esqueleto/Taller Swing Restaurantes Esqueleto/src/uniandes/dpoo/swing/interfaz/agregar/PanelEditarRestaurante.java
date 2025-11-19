package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	JPanel panel1 = new JPanel();
    	panel1.setLayout(new GridLayout(1, 2));
    	
    	
    	JLabel nombre = new JLabel("Nombre: ");

    	 txtNombre = new JTextField();
    	 panel1.add(nombre);
    	 panel1.add(txtNombre);
    	 
    	 
    	
    	
    	

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
    	 JPanel calificacion = new JPanel();
    	 calificacion.setLayout(new GridLayout(1,2));
    	 JLabel label = new JLabel("Clasificacion: ");
    	 cbbCalificacion = new JComboBox<String>();
    	 
    	 
    	 cbbCalificacion.addItem("1");
         cbbCalificacion.addItem("2");
         cbbCalificacion.addItem("3");
         cbbCalificacion.addItem("4");
         cbbCalificacion.addItem("5");
         
         calificacion.add(label);
         calificacion.add(cbbCalificacion);
         
         

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
         
         JPanel visitado = new JPanel();
         visitado.setLayout(new GridLayout(1,2));
         JLabel label2 = new JLabel("Visitado: ");
         
         cbbVisitado = new JComboBox<String>();
         
         cbbVisitado.addItem("Si");
         cbbVisitado.addItem("No");
         
         visitado.add(label2);
         visitado.add(cbbVisitado);
         


        // Agregar todos los elementos al panel
        // TODO completar
         
         this.setLayout(new GridLayout(3, 1));
         this.add(panel1);
         this.add(calificacion);
         this.add(visitado);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
        String  v= (String) cbbVisitado.getSelectedItem();
        return v.equals("Si");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
        return txtNombre.getText(); 
    }
}

package ordenarNombres;
import javax.swing.JOptionPane;

public class OrdenarNombres {
	
	public static void main(String[] args) {
		String aux = "";
		String nombre = "";
		for (int i = 0; i<=2; i++) {
			nombre = JOptionPane.showInputDialog("Ingrese un nombre");
			if (nombre.length() > aux.length()) {
				aux = nombre;
			}
		}
		JOptionPane.showMessageDialog(null, "El nombre mas largo es: " + aux + " con " + aux.length() + " caracteres");
	}
}
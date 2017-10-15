package guayabita;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class jus {
	private String jugador1;
	private String jugador2;
	private int potejugador1;
	private int potejugador2;
	
	
	public Jugador() {

		this.jugador1 = "";
		this.jugador2 = "";

	}
	
//	Guayabita guayabita = new Guayabita(0, " ");

	public void crearJugador() {

		String pote1;
		String pote2;
		
		int jugador = 1;
		while (this.jugador1.equals("")||this.jugador1.equals(null)) {

			if (jugador == 1) {
				this.jugador1 = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador" + jugador,
						"Nombre", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("guayabaP.png")),
						null, null);
				System.out.println(" d" + this.jugador1);
			
		
				
					
				

				// pote

				pote1 = (String) (JOptionPane.showInputDialog(null, "Ingrese el pote de " + this.jugador1, "Nombre",
						JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("guayabaP.png")), null,
						null));
				{
					if (Jugador.isNumeric(pote1)) {
						this.potejugador1 = Integer.parseInt(pote1);
						System.out.println(this.jugador1);

					} else
						JOptionPane.showMessageDialog(null, "El valor ingresado no es un numero");
					pote1 = (String) (JOptionPane.showInputDialog(null, "Ingrese el pote de " + this.jugador1, "Nombre",
							JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("guayabaP.png")), null,
							null));

				}
				jugador = 2;
			} else {
				this.jugador2 = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador" + jugador,
						"Pote", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("guayabaP.png")),
						null, null);

				// pote
				pote2 = (String) (JOptionPane.showInputDialog(null, "Ingrese el pote de " + this.jugador2, "Pote",
						JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("guayabaP.png")), null,
						null));
				{
					if (Jugador.isNumeric(pote2)) {
						this.potejugador2 = Integer.parseInt(pote2);
					} else {
						JOptionPane.showMessageDialog(null, "El valor ingresado no es un numero");
						pote2 = (String) (JOptionPane.showInputDialog(null, "Ingrese el pote de " + this.jugador2,
								"Pote", JOptionPane.WARNING_MESSAGE,
								new ImageIcon(getClass().getResource("guayabaP.png")), null, null));

					}
					jugador = 3;

				}

			}
		}
		}

	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	public String getJugador1() {
		return jugador1;
	}

	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}

	public String getJugador2() {
		return jugador2;
	}

	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

	public int getPotejugador1() {
		return potejugador1;
	}

	public void setPotejugador1(int potejugador1) {
		this.potejugador1 = potejugador1;
	}

	public int getPotejugador2() {
		return potejugador2;
	}

	public void setPotejugador2(int potejugador2) {
		this.potejugador2 = potejugador2;
	}
	


}

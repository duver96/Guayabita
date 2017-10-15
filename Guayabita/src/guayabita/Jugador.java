package guayabita;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jugador {
		private String nameJugador;
		private int poteJugador;
		
		
		//valida que si sea un numero
		public static boolean EsNumero(String cadena){
			try {
				Integer.parseInt(cadena);
				return true;
			} catch (NumberFormatException nfe){
				return false;
			}
		}
		//crea el jugador
		public String crearJugador() {
			
			do {
				this.nameJugador = (String) JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador" ,
						"Nombre", JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("guayabaP.png")),
						null, null);
							
			}while((this.nameJugador ==null) || this.nameJugador.trim().isEmpty());
					
			
			return this.nameJugador;
		}


		//crea el pote
		public int crearPote()
		{
			String convertPote;
		
			do {
			convertPote = (String) (JOptionPane.showInputDialog(null, "Ingrese el pote de " +this.nameJugador, "Nombre",
					JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("guayabaP.png")), null,
					null));
			{
				if (Jugador.EsNumero(convertPote)) {
					this.poteJugador = Integer.parseInt(convertPote);
					
				}
			}
					
				}while(this.poteJugador <=100);

			
			
			return this.poteJugador;
			
		}

		public String getNameJugador() {
			return nameJugador;
		}

		public void setNameJugador(String nameJugador) {
			this.nameJugador = nameJugador;
		}

		public int getPoteJugador() {
			return poteJugador;
		}

		public void setPoteJugador(int poteJugador) {
			this.poteJugador = poteJugador;
		}
		
				
}

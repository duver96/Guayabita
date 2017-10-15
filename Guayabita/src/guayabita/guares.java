package guayabita;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class guares {

	
	private int pote;
	private String lanzamiento;
	private Jugador jugadorp;

	// objeto clase jugador
	Jugador jugador = new Jugador();
	// contructor
	

	public Guayabita(int pote, String lanzamiento) {
		super();
		this.pote = pote;
		this.lanzamiento = lanzamiento;
	}

	

	public void menu() {
		int opcion = JOptionPane.showOptionDialog(null,
				"---Bienvenido al juego de la Guayabita---" + "\n" + "¿Que deseas hacer?", "Guayabita",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
				new ImageIcon(getClass().getResource("guayabaP.png")), new String[] { "Jugar", "Ver Instruciones" },
				null);

		if (opcion == 0) {

			jugador.crearJugador();
		}

		else if (opcion == 1) {

			JOptionPane.showMessageDialog(null, "---------Instruciones---------\n El juego de la guayabita");
			menu();
		}

	}

	public void jugar() {
		
		int numero;
		

		int validador = 0;
		int opcion = 0;

		if (validador == 0) {
			this.pote = 200;
			jugador.setPotejugador1(jugador.getPotejugador1() - 100);
			jugador.setPotejugador2(jugador.getPotejugador2() - 100);
			System.out.println(jugador.getPotejugador1());
			System.out.println(jugador.getJugador2());
			System.out.println(this.pote);
			validador++;
			/*JOptionPane.showConfirmDialog(null,
					jugador.getJugador1() + " ,el pote actual es de " + this.pote + " ¿Deseas lanzar el dado ",
					"Lanzaminento ", JOptionPane.QUESTION_MESSAGE);*/
		
			opcion = JOptionPane.showConfirmDialog(null,jugador.getJugador1() +   " ,el pote actual es de "   + this.pote +" ¿Deseas lanzar el dado ",
					"Lanzaminento ", JOptionPane.YES_NO_OPTION);
			System.out.println(opcion); {
				
			}
		}
		if (opcion == 0) {
			
			numero = (int) (Math.random() * 6) + 1;
			if(numero== 1)
			{
			JOptionPane.showConfirmDialog(null, jugador.getJugador1()+ "Este es tu dado\n"
					+ "Deseas hacer una apuesta", "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
					new ImageIcon(getClass().getResource("uno.png")));
			}

			else if(numero== 2)
			{
			JOptionPane.showConfirmDialog(null, jugador.getJugador1()+ "Este es tu dado\n"
					+ "Deseas hacer una apuesta", "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
					new ImageIcon(getClass().getResource("dos.png")));
			}
			else if(numero== 3)
			{
			JOptionPane.showConfirmDialog(null, jugador.getJugador1()+ "Este es tu dado\n"
					+ "Deseas hacer una apuesta", "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
					new ImageIcon(getClass().getResource("tres.png")));
			}
			else if(numero== 4)
			{
			JOptionPane.showConfirmDialog(null, jugador.getJugador1()+ "Este es tu dado\n"
					+ "Deseas hacer una apuesta", "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
					new ImageIcon(getClass().getResource("cuatro.png")));
			}
			else if(numero== 5)
			{
			JOptionPane.showConfirmDialog(null, jugador.getJugador1()+ "Este es tu dado\n"
					+ "Deseas hacer una apuesta", "Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
					new ImageIcon(getClass().getResource("cinco.png")));
			}
			else if(numero== 6)
			{
			JOptionPane.showConfirmDialog(null, jugador.getJugador1()+ "Este es tu dado\n"
					+ "Deseas hacer una apuesta","Lanzamiento", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_OPTION,
					new ImageIcon(getClass().getResource("seis.png")));
			}
			
			
			
			
			
		}
		if (opcion == 1) {
			System.out.println("ingre");

		}

	}

}
//if (this.dado > 1 && this.dado < 6) {
//
//	converPote = "";
//	do {
//
//		converPote = (String) JOptionPane.showInputDialog(null,
//				"Ingresa lo que deseas apostar,  " + jugadores.get(0).getNameJugador(), "Apuesta",
//				JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("guayabaP.png")), null,
//				null);
//
//		if (Jugador.EsNumero(converPote)) {
//			this.pote = Integer.parseInt(converPote) + this.pote;
//		}
//
//	} while (converPote.equals(null));
//
//} else
//	JOptionPane.showConfirmDialog(null,
//			"Sacaste un dado de valor " + this.dado + " con esté no puedes participar...\n Pasa el turno");
//
//turno++;
//}
//// jugador 2
//else if(turno % 2 == 1 && apuesta == 0) {
//converPote = "";
//do {
//
//	converPote = (String) JOptionPane.showInputDialog(null,
//			"Ingresa lo que deseas apostar  " + jugadores.get(1).getNameJugador(), "Apuesta",
//			JOptionPane.WARNING_MESSAGE, new ImageIcon(getClass().getResource("guayabaP.png")), null, null);
//
//	if (Jugador.EsNumero(converPote)) {
//		this.pote = Integer.parseInt(converPote) + this.pote;
//	}
//} while (converPote.equals(null));
//
//turno++;
//}
}

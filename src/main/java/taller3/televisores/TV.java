package taller3.televisores;

import java.util.ResourceBundle.Control;

public class TV {
	private Marca marca;
	private int canal = 1;
    private boolean estado;
    private int precio = 500;
    private int volumen = 1;
    private Control control;
    private static int numTv;
    
    public TV(Marca marca, boolean estado) {
		this.setMarca(marca);
		this.estado = estado;
	}

    //getter and setter.
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}
	
	 void setControl(Control control) {
		this.control = control;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	 void setVolumen(int volumen) {
		int minVolumen = 1;
		int maxVolumen = 7;
		
		if (volumen>=minVolumen && volumen<maxVolumen && this.estado) {
			this.volumen = volumen;
		}
		return;
	}

	 int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		int minCanal = 1;
		int maxCanal = 120;
		if(canal >= minCanal && canal <= maxCanal && this.estado) {
			this.canal = canal;
		}
		return;
	}

	public static int getNumTv() {
		return numTv;
	}

	public static void setNumTv(int numTv) {
		TV.numTv = numTv;
	}
	
	//methods.
	
	 void turnOn() {
		estado = true;
	}
	 void turnOff() {
		estado = false;
	}
	
	 void canalUp() {
		setCanal(canal++);
	}
	 void canalDown() {
		setCanal(canal--);
	}
	
	 void volumenDown() {
		setVolumen(volumen--);
		
	}
	 public void volumenUp() {
		setVolumen(volumen++);
	}
}

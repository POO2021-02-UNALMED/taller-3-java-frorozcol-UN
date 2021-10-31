package taller3.televisores;

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
		TV.numTv++;
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
	
	public void setControl(Control control) {
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

	public void setVolumen(int volumen) {
		int minVolumen = 0;
		int maxVolumen = 7;
		
		if (volumen>=minVolumen && volumen<=maxVolumen && this.estado) {
			this.volumen = volumen;
		}
		else return;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		int minCanal = 1;
		int maxCanal = 120;
		if(canal >= minCanal && canal <= maxCanal && this.estado) {
			this.canal = canal;
		}
		else return;
	}

	public static int getNumTV() {
		return numTv;
	}

	public static void setNumTV(int numTv) {
		TV.numTv = numTv;
	}
	
	//methods.
	
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		setCanal(canal++);
	}
	public void canalDown() {
		setCanal(canal--);
	}
	
	public void volumenDown() {
		setVolumen(volumen--);
		
	}
	 public void volumenUp() {
		setVolumen(volumen++);
	}

	public boolean getEstado() {
		return estado;
	}
}

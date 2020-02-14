package montania_como;

public class Carrito {

	private int carrito_x;
	private int carrito_y;
	private int potencia;
	
	//Constructor de la clase Carrito
	public Carrito(int x){
		this.carrito_x=x;
		this.carrito_y=0;
		this.potencia=0;
	}
	
	//getters y setters
	public int getCarrito_x() {
		return carrito_x;
	}
	public void setCarrito_x(int carrito_x) {
		this.carrito_x = carrito_x;
	}
	public int getCarrito_y() {
		return carrito_y;
	}
	public void setCarrito_y(int carrito_y) {
		this.carrito_y = carrito_y;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
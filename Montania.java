package montania_como;

public class Montania {

	private int cant_picos;
	private int[] picos;
	
	//Constructor de la clase Montania
	public Montania(int cant_p){
		this.cant_picos=cant_p;
		this.picos=new int[cant_p];
			
	}
	
	//Metodo para cargar las alturas de las cimas y valles de la montaña 
	public void cargarPico(int pos,int x){
		this.picos[pos]=x;
	}
	
	//Metodo para calcular la posicion final del Carrito
	public void calcular_posicion(Carrito c){
		
		this.picos[0]=this.picos[0]-c.getCarrito_x();
		int aux=0;
		
		for(int y=0;y<this.cant_picos-1;y++){
			//"if" para que el carrito descienda a un valle
			if(this.picos[y+1]<this.picos[y]){
				aux=this.picos[y]-this.picos[y+1];
				c.setPotencia(c.getPotencia()+aux);
				c.setCarrito_x(c.getCarrito_x()+aux);
				c.setCarrito_y(this.picos[y+1]);
			}
			//"if" para que un carrito suba hacia una cima (si tiene suficiente potencia)
			if(this.picos[y+1]>this.picos[y]){
				aux=this.picos[y+1]-this.picos[y];
				if(aux<=c.getPotencia()-1) {
					c.setPotencia(c.getPotencia()-1);
					c.setPotencia(c.getPotencia()-aux);
					c.setCarrito_x(c.getCarrito_x()+aux);
					c.setCarrito_y(this.picos[y+1]);
				}
				//Calcular la posicion donde se queda el carrito sino tiene suficiente potencia 
				else {
					c.setPotencia(c.getPotencia()-1);
					c.setCarrito_y(this.picos[y]+c.getPotencia());
					c.setCarrito_x(c.getCarrito_x()+c.getPotencia());
				}
				
			}
			
		}
		
	}
	
	//getters y setters
	public int getCant_picos() {
		return cant_picos;
	}
	
	public void setCant_picos(int cant_picos) {
		this.cant_picos = cant_picos;
	}
	
	public int[] getPicos() {
		return picos;
	}
	
	public void setPicos(int[] picos) {
		this.picos = picos;
	}
	
	
}
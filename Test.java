package montania_como;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = null;
		try {
		  double tiempo_inic = System.currentTimeMillis();
		  
		  sc = new Scanner(new File("como4.in"));
		  
		  Montania m1= new Montania(sc.nextInt());
		  
		  for(int i=0;i<m1.getCant_picos();i++){
			  m1.cargarPico(i,sc.nextInt());
		  }
		  
		  Carrito c1=new Carrito(sc.nextInt());
		  
		  m1.calcular_posicion(c1);
		  
		  PrintWriter p=null;
		  try{
				p=new PrintWriter(new File("como.out"));
				p.print(c1.getCarrito_x());
				p.print(" ");
				p.print(c1.getCarrito_y());
				
				double tiempo_fin = System.currentTimeMillis();
				double tiempo_rta = tiempo_fin - tiempo_inic;
				System.out.println("Tiempo de respuesta="+tiempo_rta+"ms");
			
		  }catch(FileNotFoundException f){
				
		  }finally{
				if(p!=null){
					p.close();
				}
		  }
		}
		catch(Exception FileNotFoundException){
			System.out.println("Error E/S");
		}
		finally{
			sc.close();
		}

	}

}

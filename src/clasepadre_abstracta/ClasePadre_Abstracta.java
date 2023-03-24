
package clasepadre_abstracta;
import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

 protected int transacciones, retiro, deposito;
	private static int saldo;
	Scanner entrada =  new Scanner (System.in);
	
	public void Operaciones() {
		int bandera = 0;
		int seleccion = 0;
		do {
		do {
			System.out.println("Porfavor seleccione una opcion:");
			System.out.println("	1. Consultar saldo");
			System.out.println("	2. Retirar");
			System.out.println("	3. Depositar");
			System.out.println("	4. Salir");
			seleccion = entrada.nextInt();
			
			if (seleccion >= 1 && seleccion<=4 ) {
				bandera = 1;
				
			}else {
				System.out.println("Opcion no disponible");
				
			}
			
		}while (bandera == 0);
		if(seleccion == 1) {
                    ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                    mensajero.Trasacciones();
			
		}else if(seleccion == 2) {
                    ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                    mensajero.Trasacciones();
			
			
		}else if(seleccion == 3) {
                    ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                    mensajero.Trasacciones();
			
                    
			
		}else if(seleccion == 4) {
			System.out.println("Gracias, vuelva pronto");
			
		}
		}while(bandera !=2);
	} 
	//metodo para solitar cantidad de retiro
	
	public void Retiro(){
		retiro = entrada.nextInt();
	}
	//metodo para depositar
	
	public void Deposito() {
		deposito = entrada.nextInt();
	}
	//metodo abstracto
	
	public abstract void Trasacciones();
	
	//metodos setter y getter
	
	public int getSaldo() {
		return saldo;
		
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
}
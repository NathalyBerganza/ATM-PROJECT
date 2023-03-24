
package clasepadre_abstracta;

public abstract class ClaseHija_Deposito extends ClasePadre_Abstracta{
    	public void Transacciones() {
		System.out.print("Cuanto deseas depositar: ");
		Deposito();
		
		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		System.out.println("Depositaste: "+ deposito);
		System.out.println("Tu saldo actual es: "+ getSaldo());
	}
}


package clasepadre_abstracta;

public abstract class ClaseHija_Consulta extends ClasePadre_Abstracta{
   
    public void Transacciones (){
    System.out.println("Tu saldo actual es: "+ getSaldo());
    }
}



package clasepadre_abstracta;

public class ClasePrincipal {
    public static void main(String[]args){
        ClasePadre_Abstracta mensajero = new ClaseHija_Consulta() {
            @Override
            public void Trasacciones() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        mensajero.setSaldo(500);
        mensajero.Operaciones();
    }
    
    
}

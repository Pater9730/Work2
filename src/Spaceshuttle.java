
/**
 * Cuarta clase que hereda de la clase abstracta principal
 */

public abstract class Spaceshuttle extends Spaceship {


    /**
     * Sobreescritura de metodos para esta clase
     */

    @Override
    public void Propulsion() {
        System.out.println( "la nave utiliza propulsion para salir de la atmosfera");
    }

    @Override
    public void Performingmissions(){
        System.out.println("el Transbordador traslada un satelite para investigacion cientifica");

    }

    /**
     * Metodo unico de esta nave que otras no pueden realizar
     */

    public void Launchpayloadsintospace() {
        System.out.println("La nave esta transportando su respectiva carga util");
    }

}





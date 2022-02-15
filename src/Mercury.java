/**
 * Primera clase que hereda de la clase abstracta principal
 */

public abstract class Mercury extends Spaceship {

    /**
     * Sobreescritura de metodos para esta clase
     */

    @Override
    public void Propulsion() {
        System.out.println( "la nave utiliza propulsion para salir de la atmosfera");
    }

    @Override
    public void Performingmissions(){
        System.out.println("transportar personas para sus respectivas misiones");
    }

    /**
     * Metodo unico de esta nave que otras no pueden realizar
     */

    public void TransportingPeople ()
    {
        System.out.println("Mercury transporta personas para que reparen un satelite averiado");

    }



}

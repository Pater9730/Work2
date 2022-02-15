/**
 * Segunda clase que hereda de la clase abstracta principal
 */

public abstract class Soho extends Spaceship {

    /**
     * Sobreescritura de metodos para esta clase
     */

    @Override
    public void Propulsion() {
        System.out.println( "la nave utiliza propulsion para salir de la atmosfera");
    }

    @Override
    public void Performingmissions(){
        System.out.println("estudiar cuerpos celestiales");
    }

    /**
     * Metodo unico de esta nave que otras no pueden realizar
     */

    public void Studycelestialbodies () {
        System.out.println("Soho realiza su mision de estudiar cuerpos celestiales");
    }




}

/**
 * Tercera clase que hereda de la clase abstracta principal
 */

public abstract class Surveyor extends Spaceship {

    /**
     * Sobreescritura de metodos para esta clase
     */

    @Override
    public void Propulsion() {
        System.out.println( "la nave utiliza propulsion para salir de la atmosfera");
    }

    @Override
    public void Performingmissions() {
        System.out.println("Abordar planetas para investigacion");
    }

    /**
     * Metodo unico de esta nave que otras no pueden realizar
     */

    public void Addressplanetsofthesolarsystem () {
        System.out.println("Surveyor aborda jupiter para su respectiva investigacion cientifica ");
    }







}

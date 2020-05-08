/**
 * Clase abstracta que model el comportamiento que deben tener los 
 *  builders concretos
 */
public abstract class AbstractBuilder {
    /**
     * Molde de Vehiculo que sera construido de acuerdo al builder concreto
     */
    Vehiculo vehiculo;
    public void tipoCarroceria(){}; // agrega un tipo de carroceria especifica
    public void addMotor(){}; // agrega un tipo de motor especifico
    public void addLlantas(){}; // agrega un tipo de llantas especificas
    public void addBlindaje(){}; // agrega un tipo de blindaje especifico
    public void addArmas(){}; // agrega un tipo de armamento especifico
    public Vehiculo getCar(){return vehiculo;}; // regresa el vehiculo con las especificaciones dadas
}
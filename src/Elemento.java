/** Clase que modela los elementos que componen un vehiculo*/
public interface Elemento {

    public abstract String getNombre(); 
    public abstract int getCosto();
    public abstract int getAtaque(); 
    public abstract int getDefensa();
    public abstract int getVelocidad();
    
}
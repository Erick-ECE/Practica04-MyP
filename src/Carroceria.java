public abstract class Carroceria implements Elemento {
    String nombre; // tipo de carroceria  ("casual", "camion", "deportiva" )
    int costo;     // $$
    int ataque;    // [1,2,3]
    int defensa;   // [1,2,3]
    int velocidad; // [1,2,3]

    public abstract String getNombre();

    public abstract int getCosto();

    public abstract int getAtaque(); 

    public abstract int getDefensa();

    public abstract int getVelocidad();
    
}
public abstract class Llantas implements Elemento {
    String nombre; // tipo de llantas ("simple", "deportivas", "off-road", "oruga de tanque")
    int costo;     // $$
    int ataque;    // [1,2,3,4]
    int defensa;   // [1,2,3,4]
    int velocidad; // [1,2,3,4]

    public abstract String getNombre();

    public abstract int getCosto();

    public abstract int getAtaque(); 

    public abstract int getDefensa();

    public abstract int getVelocidad();
    
    
}
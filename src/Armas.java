/**Clase que especifica que tipo de elementro es */
public abstract class Armas implements Elemento{
    String nombre; // tipo de armas ("arpones", "lanzallamas", "lanzas", "sierra", "metralleta")
    int costo;     // $$
    int ataque;    // [1,2,3,4,5]
    int defensa;   // [1,2,3,4,5]
    int velocidad; // [1,2,3,4,5]

    public abstract String getNombre();

    public abstract int getCosto();

    public abstract int getAtaque(); 

    public abstract int getDefensa();

    public abstract int getVelocidad();
}
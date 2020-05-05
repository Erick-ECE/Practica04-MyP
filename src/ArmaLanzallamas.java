public class ArmaLanzallamas extends Armas{
    
    public ArmaLanzallamas() {
        super.nombre ="Lanzallamas";
        super.ataque = 2;
        super.costo = 150;
        super.defensa = 2;
        super.velocidad = 2;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCosto() {
        return costo;
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getDefensa() {
        return defensa;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }
}
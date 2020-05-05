public class LlantasOffRoad extends Llantas{
    
    public LlantasOffRoad() {
        super.nombre ="Llantas Off-Road";
        super.ataque = 2;
        super.costo = 250;
        super.defensa = 3;
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
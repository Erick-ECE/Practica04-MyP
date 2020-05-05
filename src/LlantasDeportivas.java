public class LlantasDeportivas extends Llantas {
    
    public LlantasDeportivas() {
        super.nombre ="Llantas Deportivas";
        super.ataque = 1;
        super.costo = 190;
        super.defensa = 1;
        super.velocidad = 4;
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
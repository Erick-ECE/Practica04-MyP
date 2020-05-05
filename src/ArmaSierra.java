public class ArmaSierra extends Armas {
    
    public ArmaSierra() {
        super.nombre ="Sierra";
        super.ataque = 3;
        super.costo = 200;
        super.defensa = 0;
        super.velocidad = 3;
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
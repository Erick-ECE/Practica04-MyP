public abstract class AbstractBuilder {
    Vehiculo vehiculo;
    public void tipoCarroceria(){};
    public void addMotor(){};
    public void addLlantas(){};
    public void addBlindaje(){};
    public void addArmas(){};
    public Vehiculo getCar(){return vehiculo;};
}
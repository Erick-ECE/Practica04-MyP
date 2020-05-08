public interface AbstractBuilder {
    protected Vehiculo vehiculo;

    public void tipoCarroceria();
    public void addMotor();
    public void addLlantas();
    public void addBlindaje();
    public void addArmas();
    public void getCar(){return vehiculo};
}
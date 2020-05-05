public interface AbstractBuilder {
    //Vehiculo vehiculo = new Vehiculo();

    public void tipoCarroceria(String carroceria);
    public void addMotor(String motor);
    public void addLlantas(String llantas);
    public void addBlindaje(String blindaje);
    public void addArmas(String arma);
    public void getCar();
}
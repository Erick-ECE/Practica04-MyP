public class StockBuilder3 implements AbstractBuilder {
    public StockBuilder3(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){
        Carroceria carroceria= new CarroceriaCasual();
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){
        Motor motor = new MotorDeportivo();
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){
        Llantas llantas = new CarroceriaCasual();
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){
        Blindaje blindaje = new CarroceriaCasual();
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){
        Armas armas = new CarroceriaCasual();
        super.vehiculo.setArmas(armas);
    }
}

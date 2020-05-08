public class StockBuilder2 implements AbstractBuilder {
    public StockBuilder2(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){
        Carroceria carroceria= new CarroceriaDeportiva();
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){
        Motor motor = new MotorSimple();
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){
        Llantas llantas = new CarroceriaDeportiva();
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){
        Blindaje blindaje = new CarroceriaDeportiva();
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){
        Armas armas = new CarroceriaDeportiva();
        super.vehiculo.setArmas(armas);
    }
}

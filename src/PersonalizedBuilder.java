import java.util.Scanner;

public class PersonalizedBuilder implements AbstractBuilder {
    Scanner s = new Scanner(System.in);
    int opcion = 0;

    public PersonalizedBuilder(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){
        Carroceria carroceria;

        System.out.println( " \n"+ "¿Que carrocería quiere? :\n "+
                        "      1.- casual \n" + 
                        "       2.- camion \n" +
                        "       3.- deportiva \n" );
        opcion = s.nextInt();
        switch(opcion){
            case 1:carroceria = new CarroceriaCasual();
            break;
            case 2:carroceria = new CarroceriaCamion();
            break;
            case 3:carroceria = new CarroceriaDeportiva();
            break;
        }
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){
        Motor motor;

        System.out.println( " \n"+ "¿Que motor quiere? :\n "+
                        "      1.- deportivo \n" + 
                        "       2.- diesel \n" +
                        "       3.- simple \n" );
        opcion = s.nextInt();
        switch(opcion){
            case 1:motor = new MotorDeportivo();
            break;
            case 2:motor = new MotorDiesel();
            break;
            case 3:motor = new MotorSimple();
            break;
        }
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){
        Llantas llantas;

        System.out.println( " \n"+ "¿Que carrocería quiere? :\n "+
                        "      1.- casual \n" + 
                        "       2.- camion \n" +
                        "       3.- deportiva \n" );
        opcion = s.nextInt();
        switch(opcion){
            case 1:llantas = new CarroceriaCasual();
            break;
            case 2:llantas = new CarroceriaCamion();
            break;
            case 3:llantas = new CarroceriaDeportiva();
            break;
        }
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){
        Blindaje blindaje;

        System.out.println( " \n"+ "¿Que carrocería quiere? :\n "+
                        "      1.- casual \n" + 
                        "       2.- camion \n" +
                        "       3.- deportiva \n" );
        opcion = s.nextInt();
        switch(opcion){
            case 1:blindaje = new CarroceriaCasual();
            break;
            case 2:blindaje = new CarroceriaCamion();
            break;
            case 3:blindaje = new CarroceriaDeportiva();
            break;
        }
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){
        Armas armas;

        System.out.println( " \n"+ "¿Que carrocería quiere? :\n "+
                        "      1.- casual \n" + 
                        "       2.- camion \n" +
                        "       3.- deportiva \n" );
        opcion = s.nextInt();
        switch(opcion){
            case 1:armas = new CarroceriaCasual();
            break;
            case 2:armas = new CarroceriaCamion();
            break;
            case 3:armas = new CarroceriaDeportiva();
            break;
        }
        super.vehiculo.setArmas(armas);
    }
}

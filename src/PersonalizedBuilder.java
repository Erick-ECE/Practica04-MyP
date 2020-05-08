import java.util.Scanner;
//clase para un vehiculo personalizado
public class PersonalizedBuilder extends AbstractBuilder {
    Scanner s = new Scanner(System.in);
    int opcion = 0;

    public PersonalizedBuilder(){super.vehiculo = new Vehiculo();}

    public void tipoCarroceria(){// se pasa un tipo concreto de carroceria personalizado
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
            default:carroceria = new CarroceriaCasual();
            break;
        }
        super.vehiculo.setCarroceria(carroceria);
    }

    public void addMotor(){// se pasa un tipo concreto de motor personalizado
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
            default:motor = new MotorSimple();
            break;
        }
        super.vehiculo.setMotor(motor);
    }

    public void addLlantas(){// se pasa un tipo concreto de llantas personalizado
        Llantas llantas;

        System.out.println( " \n"+ "¿Que llantas quiere? :\n "+
                        "      1.- Deportivas \n" + 
                        "       2.- OffRoad \n" +
                        "       3.- Siples \n" +
                        "       3.- Tanque \n" );
        opcion = s.nextInt();
        switch(opcion){
            case 1:llantas = new LlantasDeportivas();
            break;
            case 2:llantas = new LlantasOffRoad();
            break;
            case 3:llantas = new LlantasSiples();
            break;
            case 4:llantas = new LlantasTanque();
            break;
            default:llantas = new LlantasSiples();
            break;
        }
        super.vehiculo.setLlantas(llantas);
    }

    public void addBlindaje(){// se pasa un tipo concreto de blindaje personalizado
        Blindaje blindaje;

        System.out.println( " \n"+ "¿Que blindaje quiere? :\n "+
                        "      1.- Reforzado \n" + 
                        "       2.- Simple \n" +
                        "       3.- Tanque \n" );
        opcion = s.nextInt();
        switch(opcion){
            case 1:blindaje = new BlindajeReforzado();
            break;
            case 2:blindaje = new BlindajeSimple();
            break;
            case 3:blindaje = new BlindajeTanque();
            break;
            default:blindaje = new BlindajeSimple();
            break;
        }
        super.vehiculo.setBlindaje(blindaje);
    }

    public void addArmas(){// se pasa un tipo concreto de armas personalizado
        Armas armas;

        System.out.println( " \n"+ "¿Que armas quiere? :\n "+
                        "      1.- Arpon \n" + 
                        "       2.- Lanza \n" +
                        "       3.- Lanza llamas \n" +
                        "       4.- Metralla \n" +
                        "       5.- Sierra \n" );
        opcion = s.nextInt();
        switch(opcion){
            case 1:armas = new ArmaArpon();
            break;
            case 2:armas = new ArmaLanza();
            break;
            case 3:armas = new ArmaLanzallamas();
            break;
            case 4:armas = new ArmaMetralla();
            break;
            case 5:armas = new ArmaSierra();
            break;
            default:armas = new ArmaArpon();
            break;
        }
        super.vehiculo.setArmas(armas);
    }
}

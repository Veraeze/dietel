package cls;

public class Bike {
    private int speed ;

    private boolean isOn;


    public boolean key(){
        isOn = !isOn ;

        return isOn;
    }

    public void accelerate() {

        if (speed >= 41) {speed = speed + 4; }

        if ((speed <= 40) && (speed >= 31)) {speed = speed + 3;}

        if ((speed <= 30) && (speed >= 21)){speed = speed + 2;}

        if ((speed <= 20) && (speed >= 0)) {speed = speed + 1;}

    }

    public void decelerate() {

        if ((speed <= 20) && (speed >= 0)) speed = speed - 1;

        if ((speed <= 30) && (speed >= 21)) speed = speed - 2;

        if ((speed <= 40) && (speed >= 31)) speed = speed - 3;

        if (speed >= 41) speed = speed - 4;

    }


    public int checkSpeed() {
        return speed;
    }

    public int checkGear() {

        if(speed >0 && speed <=20) return 1;

        if(speed >20 && speed <=30) return 2;

        if(speed >30 && speed <=40) return 3;

        if(speed >41) return 4;

        return 0;
    }
}

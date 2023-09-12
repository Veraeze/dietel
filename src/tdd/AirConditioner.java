package tdd;

public class AirConditioner {

    private boolean isOn;
    private int temperature = 16;

    public void toggle() {


        isOn = !isOn;


    }

    public void increaseTemperature() {

        if (temperature < 30) {
            temperature = temperature + 1;

        } else {
            this.temperature = temperature;
        }
    }

        public void decreaseTemperature () {
            if (temperature > 16) {
                temperature = temperature - 1;

            } else {
                this.temperature = temperature;
            }
        }
        public boolean checkIsOn () {

            return isOn;
        }
        public int checkTemperature () {

            return temperature;
        }
    }
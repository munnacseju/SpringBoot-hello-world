package munna.spring.seltofar;

import java.util.Date;

public class Loader {
    private String cof;

    public String getCof() {
        return cof;
    }

    public void setCof(String cof) {
        this.cof = cof;
        double celcius = Double.parseDouble(cof);
        cof = converter(celcius);

        this.cof = cof;
    }

    public String converter(double celcius){
        celcius = (celcius/5)*9+32;
        String fahrenheit = String.valueOf(celcius);
        return fahrenheit;
    }

}

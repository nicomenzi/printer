public class Application {

    public static void main(String[] args){
        System.out.println("Printer und CO");
        System.out.println();

        Laserdrucker laserdrucker = new Laserdrucker();
        Faxgeraet faxgeraet = new Faxgeraet();
        Kombigeraet kombigeraet = new Kombigeraet();

        laserdrucker.drucken("Das ist ein Test");
        faxgeraet.senden("Das ist ein Test");
        kombigeraet.drucken("Das ist ein Test");
        kombigeraet.senden("Das ist ein Test");


    }

}
